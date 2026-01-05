package org.example.cadastros;

public class Associados extends Modelo{
    private boolean situacao;
    private String numeroAssociado;

    public Associados(int id, String nome, String logradouro, String CEP, String cidade, String bairro, String UF, String telefone, String CPFcnpj, boolean situacao, String numeroAssociado) {
        super(id, nome, logradouro, CEP, cidade, bairro, UF, telefone, CPFcnpj);
        this.situacao = situacao;
        this.numeroAssociado = numeroAssociado;
    }

    public boolean isSituacao() {
        return situacao;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }

    public String getNumeroAssociado() {
        return numeroAssociado;
    }

    public void setNumeroAssociado(String numeroAssociado) {
        this.numeroAssociado = numeroAssociado;
    }
}
