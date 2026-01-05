package org.example.cadastros;

public class Modelo {
    private int id;
    private String nome, logradouro, CEP, bairro, cidade, UF, telefone, CPFcnpj;

    public Modelo(int id, String nome, String logradouro, String CEP, String cidade, String bairro, String UF, String telefone, String CPFcnpj) {
        this.id = id;
        this.nome = nome;
        this.logradouro = logradouro;
        this.CEP = CEP;
        this.cidade = cidade;
        this.bairro = bairro;
        this.UF = UF;
        this.telefone = telefone;
        this.CPFcnpj = CPFcnpj;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCPFcnpj() {
        return CPFcnpj;
    }

    public void setCPFcnpj(String CPFcnpj) {
        this.CPFcnpj = CPFcnpj;
    }
}
