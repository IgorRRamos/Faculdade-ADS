package org.example.cadastro;

public class Principal {
    private Aluno aluno;

    public void adicionarNome(String nome){
        this.aluno.setNome(nome);
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
}
