package org.example;

import java.util.ArrayList;
import java.util.List;

public class Comida implements Produto{

    private String nome;
    private double preco;
    private List<Ingrediente> ingredientes;

    public Comida(String nome, double preco, List<Ingrediente> ingredientes) {
        this.nome = nome;
        this.preco = preco;
        this.ingredientes = ingredientes;
    }

    public String getNome() { return nome; }

    public double getPreco() { return preco; }

    public List<String> getNomeIngredientes() { 
        List<String> nomes = new ArrayList<>();
        for (Ingrediente ingrediente : ingredientes) {
            nomes.add(ingrediente.getNome());
        }
        return nomes;
     }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.exibirComida(this);
    }
    
}
