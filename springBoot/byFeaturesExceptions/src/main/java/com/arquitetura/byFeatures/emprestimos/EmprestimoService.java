package com.arquitetura.byFeatures.emprestimos;

import com.arquitetura.byFeatures.emprestimos.exceptions.JaDevolvidoException;
import com.arquitetura.byFeatures.emprestimos.exceptions.NaoEncontrado;
import com.arquitetura.byFeatures.emprestimos.exceptions.SemEstoqueException;
import com.arquitetura.byFeatures.livros.Livro;
import com.arquitetura.byFeatures.livros.LivroRepository;
import com.arquitetura.byFeatures.pessoas.Cliente;
import com.arquitetura.byFeatures.pessoas.ClienteRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDate;

@Service

@RequiredArgsConstructor
public class EmprestimoService {
    private final ClienteRepository clienteRepo;
    private final LivroRepository livroRepo;
    private final EmprestimoRepository emprestimoRepo;

    @Transactional
    public EmprestimoResponseDTO alugar(EmprestimoRequestDTO dto){
        Cliente cliente = clienteRepo.findById(dto.clienteId()).orElseThrow(() -> new RuntimeException("CLiente não encontrado"));
        Livro livro = livroRepo.findById(dto.livroId()).orElseThrow(() -> new RuntimeException("Livro Nnão encontrado"));

        boolean clienteTemEmprestimoAtivo = emprestimoRepo.existsByClienteIdAndStatus(cliente.getId(), Emprestimo.StatusEmprestimo.ATIVO);

        if(livro.getQuantidade() <= 0){
            throw new SemEstoqueException(livro.getId());
        }
        livro.setQuantidade(livro.getQuantidade() - 1);
        livroRepo.save(livro);

        Emprestimo emprestimo = new Emprestimo();
        emprestimo.setCliente(cliente);
        emprestimo.setLivro(livro);
        Instant localDate;
        emprestimo.setDataEmprestimo(LocalDate.now());
        emprestimo.setStatus(Emprestimo.StatusEmprestimo.ATIVO);

        return toResponseDTO(emprestimoRepo.save(emprestimo));
    }

    public EmprestimoResponseDTO devolver(Long emprestimoId) {
        Emprestimo emprestimo = emprestimoRepo.findById(emprestimoId).orElseThrow(() -> new NaoEncontrado(emprestimoId));
        if(emprestimo.getStatus() == Emprestimo.StatusEmprestimo.DEVOLVIDO){
            throw new JaDevolvidoException(emprestimoId);
        }

        emprestimo.setStatus(Emprestimo.StatusEmprestimo.DEVOLVIDO);
        emprestimo.setDataDevolucao(LocalDate.now());

        Livro livro = emprestimo.getLivro();
        livro.setQuantidade(livro.getQuantidade() + 1);
        livroRepo.save(livro);

        return toResponseDTO(emprestimoRepo.save(emprestimo));
    }

    private EmprestimoResponseDTO toResponseDTO(Emprestimo e){
        return new EmprestimoResponseDTO(
                e.getId(),
                e.getCliente().getNome(),
                e.getLivro().getTittle(),
                e.getDataEmprestimo(),
                e.getDataDevolucao(),
                e.getStatus().name()

        );
    }

}
