package org.example;

public class Componente {

    private String nome;
    private double preco;

    public Componente(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() { return nome; }

    public double getPreco() { return preco; }

}
