package org.example;

public class ProdutoVisitor implements Visitor {

    public String exibir(Produto produto) {
        return produto.aceitar(this);
    }

    @Override
    public String exibirComida(Comida comida) {
        return 
            "Comida: " + comida.getNome() + 
            " - Preço: " + comida.getPreco() + 
            " - Ingredientes: " + comida.getNomeIngredientes();
    }

    @Override
    public String exibirEletronico(Eletronico eletronico) {
        return 
            "Eletronico: " + eletronico.getNome() + 
            " - Preço: " + eletronico.getPreco() + 
            " - Componentes: " + eletronico.getNomeComponentes();
    }

    @Override
    public String exibirMovel(Movel movel) {
        return 
            "Movel: " + movel.getNome() + 
            " - Preço: " + movel.getPreco() + 
            " - Material: " + movel.getMaterial();
    }
}
