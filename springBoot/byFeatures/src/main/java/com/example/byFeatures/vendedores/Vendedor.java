    package com.example.byFeatures.vendedores;

    import jakarta.persistence.*;
    import lombok.Getter;
    import lombok.Setter;

    @Entity
    @Table(name = "VENDEDORES")

    @Getter
    @Setter

    public class Vendedor {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String nome;
        private String senha;

        public Vendedor(){}

        public Vendedor(String nome, String senha){
            this.nome = nome;
            this.senha = senha;
        }
    }
