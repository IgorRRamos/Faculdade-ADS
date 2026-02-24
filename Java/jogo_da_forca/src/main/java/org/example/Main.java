package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Palavra palavra = new Palavra();
        int escolhaOpcao=0, chutes=0;
        String palavraChave;
        char chuteLetra;
        String palavraTeste;

        System.out.println("Jogo da forca");
        System.out.println("Escolha o tema");
        System.out.println("1 - Natureza");
        System.out.println("2 - Espaço");
        System.out.println("3 - Arte");
        System.out.println("4 - Tecnologia");
        System.out.println("5 - Alimentação");
        System.out.println("6 - Musica");
        System.out.println("7 - Esporte");
        System.out.println("8 - Livros");
        System.out.println("9 - Geografia");

        System.out.println();
        System.out.print("Digite sua escolha: ");
        escolhaOpcao = teclado.nextInt();
        palavraChave = palavra.wordKey(escolhaOpcao);
        System.out.println();

        List<String> palavraEscondida = new ArrayList<>();
        for (int i = 0; i < palavraChave.length(); i++) {
            palavraEscondida.add(" * ");
        }

        while(true) {

            for (String lista : palavraEscondida) {
                System.out.print(lista);
            }

            System.out.println();
            System.out.println("A palavra tem " + palavraChave.length() + " letras");
            System.out.println();

            if(chutes < 5){
                System.out.print("\nDigite uma letra: ");
                chuteLetra = teclado.next().charAt(0);
                System.out.println();
                chutes++;

                for(int i=0; i<palavraEscondida.size();i++){
                    if(palavraChave.charAt(i) == chuteLetra) {
                        palavraEscondida.set(i, String.valueOf(chuteLetra));
                    }
                }
            }else{
                System.out.println("\nVocê precisa acertar a palavra.");
                System.out.print("Qual é a palavra: ");
                palavraTeste =  teclado.next();
                teclado.nextLine();

                if(palavraChave.equals(palavraTeste)){
                    System.out.println("\nPalavra correta!");
                    System.out.println("Ganhou!");
                    chutes = 6;
                }else{
                    System.out.println("\nForca");
                    chutes = 6;
                }
            }

            if(chutes > 5) break;
        }


    }

    public static class Palavra{
        Random random = new Random();
        private int numPalavra = random.nextInt(5);
        private String[] tema1 = {"cachoeira", "neblina", "raiz", "vulcao", "coral"};
        private String[] tema2 = {"Galaxia", "Cometa", "orbita", "Nebulosa", "Eclipse"};
        private String[] tema3 = {"Tela", "Escultura", "Tinta", "Galeria", "Mural"};
        private String[] tema4 = {"Algoritmo", "Interface", "Nuvem", "Codigo", "Chip"};
        private String[] tema5 = {"Canela", "Abacate", "Pimenta", "Fermento", "Mel"};
        private String[] tema6 = {"Ritmo", "Melodia", "Acorde", "Harmonia", "Refrao"};
        private String[] tema7 = {"Torcida", "Medalha", "Podio", "Treino", "Recorde"};
        private String[] tema8 = {"Enredo", "Personagem", "Capitulo", "Metafora", "Narrador"};
        private String[] tema9 = {"Planalto", "Estuario", "Latitude", "Arquipelago", "Continente"};

        public Palavra(){}


        public String wordKey(int num){
            switch(num){
                case 1:
                    return tema1[numPalavra];
                case 2:
                    return tema2[numPalavra];
                case 3:
                    return tema3[numPalavra];
                case 4:
                    return tema4[numPalavra];
                case 5:
                    return tema5[numPalavra];
                case 6:
                    return tema6[numPalavra];
                case 7:
                    return tema7[numPalavra];
                case 8:
                    return tema8[numPalavra];
                case 9:
                    return tema9[numPalavra];

                default: System.out.println("Opcao invalida");
                return null;
            }
        }

        private String palavra;

        public String[] getTema1() {
            return tema1;
        }

        public void setTema1(String[] tema1) {
            this.tema1 = tema1;
        }

        public String[] getTema2() {
            return tema2;
        }

        public void setTema2(String[] tema2) {
            this.tema2 = tema2;
        }

        public String[] getTema3() {
            return tema3;
        }

        public void setTema3(String[] tema3) {
            this.tema3 = tema3;
        }

        public String[] getTema4() {
            return tema4;
        }

        public void setTema4(String[] tema4) {
            this.tema4 = tema4;
        }

        public String[] getTema5() {
            return tema5;
        }

        public void setTema5(String[] tema5) {
            this.tema5 = tema5;
        }

        public String[] getTema6() {
            return tema6;
        }

        public void setTema6(String[] tema6) {
            this.tema6 = tema6;
        }

        public String[] getTema7() {
            return tema7;
        }

        public void setTema7(String[] tema7) {
            this.tema7 = tema7;
        }

        public String[] getTema8() {
            return tema8;
        }

        public void setTema8(String[] tema8) {
            this.tema8 = tema8;
        }

        public String[] getTema9() {
            return tema9;
        }

        public void setTema9(String[] tema9) {
            this.tema9 = tema9;
        }

        public String getPalavra() {
            return palavra;
        }

        public void setPalavra(String palavra) {
            this.palavra = palavra;
        }
    }
}