package org.example;
public class Main {
    static int previsaoDemanda = 200;
    static int producaoNormal = 250;
    static int producaoInicial = 50;
    static int estoqueFinal;

    public static void main(String[] args) {

        estoqueFinal = (producaoNormal + producaoInicial) - previsaoDemanda;

        System.out.println("O estoque final previsto para o mês é de: " + estoqueFinal + " Unidades");

    }
}