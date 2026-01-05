package org.example.cadastros;

public class Colaborador extends Modelo{
    private String cargoFuncao;

    public Colaborador(int id, String nome, String logradouro, String CEP, String cidade, String bairro, String UF, String telefone, String CPFcnpj, String cargo) {
        super(id, nome, logradouro, CEP, cidade, bairro, UF, telefone, CPFcnpj);
        this.cargoFuncao = cargo;
    }

    public String getCargo() {
        return cargoFuncao;
    }

    public void setCargo(String cargo) {
        this.cargoFuncao = cargo;
    }
}
