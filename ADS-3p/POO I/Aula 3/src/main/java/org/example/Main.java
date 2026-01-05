package org.example;

import org.example.cadastros.Associados;
import org.example.cadastros.Colaborador;
import org.example.cadastros.Fornecedores;

public class Main {
    public static void main(String[] args) {

        Associados a1 = new Associados(1, "Oficial Farma", "Rua A", "124212-1213",
                "Brasilia", "Ceilandia", "DF", "36716812", "142342320001.12", true, "999999999");

        Colaborador c1 = new Colaborador(4, "Matheus", "Rua das betulas", "38608-118", "Salvador",
                "Cabula", "BA", "9999999999", "29864910001-32", "Farmaceutico");

        Fornecedores f1 = new Fornecedores(2, "WM Fornecedora", "Rua Crystal", "4827348923", "Paracatu", "Centro",
                "MG", "9999999999", "57309500001-21", "Super Fornecedora", "www.superfornecedora.com.br");

        }
}