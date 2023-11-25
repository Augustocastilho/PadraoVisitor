package org.example;

import java.util.ArrayList;
import java.util.List;

public class Eletronico implements Produto{

    private String nome;
    private double preco;
    private List<Componente> componentes;

    public Eletronico(String nome, double preco, List<Componente> componentes) {
        this.nome = nome;
        this.preco = preco;
        this.componentes = componentes;
    }

    public String getNome() { return nome; }

    public double getPreco() { return preco; }  

    public List<String> getNomeComponentes() { 
        List<String> nomes = new ArrayList<>();
        for (Componente componente : componentes) {
            nomes.add(componente.getNome());
        }
        return nomes;
     }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.exibirEletronico(this);
    }

}
