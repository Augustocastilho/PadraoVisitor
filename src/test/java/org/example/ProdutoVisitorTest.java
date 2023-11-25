package org.example;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class ProdutoVisitorTest {

    @Test
    void deveExibirComida() {
        List<Ingrediente> ingredientes = List.of(
            new Ingrediente("Calabresa", 10.0, "Manter refrigerado"),
            new Ingrediente("Queijo", 5.0, "Manter refrigerado"),
            new Ingrediente("Molho de tomate", 2.0, "Manter refrigerado")            
            );
        Comida comida = new Comida("Pizza de calabresa", 50.0, ingredientes);
        ProdutoVisitor visitor = new ProdutoVisitor();
        assertEquals("Comida: Pizza de calabresa - Preço: 50.0 - Ingredientes: [Calabresa, Queijo, Molho de tomate]", visitor.exibir(comida));
    }

    @Test
    void deveExibirEletronico() {
        List<Componente> componentes = List.of(
            new Componente("Placa mãe", 400.0),
            new Componente("Processador", 700.0),
            new Componente("Memória RAM", 150.0)            
            );
        Eletronico eletronico = new Eletronico("Computador", 5000.0, componentes);
        ProdutoVisitor visitor = new ProdutoVisitor();
        assertEquals("Eletronico: Computador - Preço: 5000.0 - Componentes: [Placa mãe, Processador, Memória RAM]", visitor.exibir(eletronico));
    }

    @Test
    void deveExibirMovel() {
        Movel movel = new Movel("Cadeira", 200.0, "Madeira");
        ProdutoVisitor visitor = new ProdutoVisitor();
        assertEquals("Movel: Cadeira - Preço: 200.0 - Material: Madeira", visitor.exibir(movel));
    }
}