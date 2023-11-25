package org.example;

public class Ingrediente {

    private String nome;
    private double preco;
    private String cuidados;


    public Ingrediente(String nome, double preco, String cuidados) {
        this.nome = nome;
        this.preco = preco;
        this.cuidados = cuidados;
    }

    public String getNome() { return nome; }

    public double getPreco() { return preco; }

    public String getCuidados() { return cuidados; }
}
