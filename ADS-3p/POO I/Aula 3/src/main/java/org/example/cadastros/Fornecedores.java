package org.example.cadastros;

public class Fornecedores extends Modelo{
    private String nomeFantasia, webSite;

    public Fornecedores(int id, String nome, String logradouro, String CEP, String cidade, String bairro, String UF, String telefone, String CPFcnpj, String nomeFantasia, String webSite) {
        super(id, nome, logradouro, CEP, cidade, bairro, UF, telefone, CPFcnpj);
        this.nomeFantasia = nomeFantasia;
        this.webSite = webSite;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }
}
