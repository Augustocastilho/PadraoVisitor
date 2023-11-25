package org.example;

public class Movel implements Produto{
    
    private String nome;
    private double preco;
    private String material;

    public Movel(String nome, double preco, String material) {
        this.nome = nome;
        this.preco = preco;
        this.material = material;
    }

    public String getNome() { return nome; }

    public double getPreco() { return preco; }

    public String getMaterial() { return material; }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.exibirMovel(this);
    }

}
