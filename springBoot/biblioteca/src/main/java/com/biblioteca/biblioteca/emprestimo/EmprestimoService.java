package com.biblioteca.biblioteca.emprestimo;

import com.biblioteca.biblioteca.clientes.Cliente;
import com.biblioteca.biblioteca.clientes.ClienteRepository;
import com.biblioteca.biblioteca.emprestimo.exceptions.JaDevolvidoException;
import com.biblioteca.biblioteca.emprestimo.exceptions.NaoEncontradoException;
import com.biblioteca.biblioteca.emprestimo.exceptions.SemEstoqueException;
import com.biblioteca.biblioteca.livros.Livro;
import com.biblioteca.biblioteca.livros.LivroRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@RequiredArgsConstructor
public class EmprestimoService {

    private final EmprestimoRepository emprestimoRepository;
    private final ClienteRepository clienteRepository;
    private final LivroRepository livroRepository;

    @Transactional
    public EmprestimoResponseDTO alugar(EmprestimoRequestDTO dto) {
        Cliente cliente = clienteRepository.findById(dto.clienteId()).orElseThrow(() -> new RuntimeException("Cliente não encontrado."));

        Livro livro = livroRepository.findById(dto.livroId()).orElseThrow(() -> new RuntimeException("Livro não encontrado."));

        boolean clienteTemEmprestimoAtivo = emprestimoRepository.existsByClienteIdAndStatus(cliente.getId(), Emprestimo.StatusEmprestimo.ATIVO);

        if (livro.getQuantidade() <= 0) {
            throw new SemEstoqueException(livro.getId());
        }

        livro.setQuantidade(livro.getQuantidade() - 1);
        livroRepository.save(livro);

        Emprestimo emprestimo = new Emprestimo();
        emprestimo.setCliente(cliente);
        emprestimo.setLivro(livro);
        emprestimo.setDataEmprestimo(LocalDate.now());
        emprestimo.setStatus(Emprestimo.StatusEmprestimo.ATIVO);

        return toResponseDTO(emprestimoRepository.save(emprestimo));
    }

    @Transactional
    public EmprestimoResponseDTO devolver(Long emprestimoId){

        Emprestimo emprestimo = emprestimoRepository.findById(emprestimoId).orElseThrow(() -> new NaoEncontradoException(emprestimoId));

        if(emprestimo.getStatus() == Emprestimo.StatusEmprestimo.DEVOLVIDO){
            throw new JaDevolvidoException(emprestimoId);
        }

        emprestimo.setStatus(Emprestimo.StatusEmprestimo.DEVOLVIDO);
        emprestimo.setDataDevolucao(LocalDate.now());

        Livro livro = emprestimo.getLivro();
        livro.setQuantidade(livro.getQuantidade() + 1);
        livroRepository.save(livro);

        return toResponseDTO(emprestimoRepository.save(emprestimo));
    }

    private EmprestimoResponseDTO toResponseDTO(Emprestimo e) {
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
