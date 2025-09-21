package br.com.lazarokaua.exercicios.ex6_imutabilidade;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        // 1. Criação dos produtos
        Produto tv = new Produto("TV 4K", new Dinheiro(new BigDecimal("2500.00"), Dinheiro.Moeda.BRL));
        Produto notebook = new Produto("Notebook Gamer", new Dinheiro(new BigDecimal("5500.00"), Dinheiro.Moeda.BRL));
        Produto smartphone = new Produto("Smartphone", new Dinheiro(new BigDecimal("1500.00"), Dinheiro.Moeda.BRL));

        // 2. Criação de um carrinho de compras vazio
        Carrinho carrinhoInicial = new Carrinho();
        System.out.println("--- Carrinho Inicial ---");
        System.out.println("Itens: " + carrinhoInicial.getItens().size());
        System.out.println("Total: " + carrinhoInicial.getTotal().getValor());
        System.out.println("------------------------\n");

        // 3. Adicionando itens -> Cada operação retorna um NOVO carrinho
        Carrinho carrinhoComTv = carrinhoInicial.adicionarItem(tv, 1);
        System.out.println("--- Adicionada a TV ---");
        System.out.println("Itens no carrinho inicial: " + carrinhoInicial.getItens().size() + " (imutável)");
        System.out.println("Itens no novo carrinho: " + carrinhoComTv.getItens().size());
        System.out.println("Total do novo carrinho: " + carrinhoComTv.getTotal().getValor());
        System.out.println("------------------------\n");

        Carrinho carrinhoComNotebook = carrinhoComTv.adicionarItem(notebook, 1);
        System.out.println("--- Adicionado o Notebook ---");
        System.out.println("Itens no carrinho anterior: " + carrinhoComTv.getItens().size() + " (imutável)");
        System.out.println("Itens no novo carrinho: " + carrinhoComNotebook.getItens().size());
        System.out.println("Total do novo carrinho: " + carrinhoComNotebook.getTotal().getValor());
        System.out.println("------------------------\n");

        // 4. Removendo um item -> Retorna outro NOVO carrinho
        Carrinho carrinhoSemTv = carrinhoComNotebook.removerItem(tv);
        System.out.println("--- Removida a TV ---");
        System.out.println("Itens no carrinho anterior: " + carrinhoComNotebook.getItens().size() + " (imutável)");
        System.out.println("Itens no novo carrinho: " + carrinhoSemTv.getItens().size());
        System.out.println("Produto restante: " + carrinhoSemTv.getItens().get(0).getProduto().getNome());
        System.out.println("Total do novo carrinho: " + carrinhoSemTv.getTotal().getValor());
        System.out.println("------------------------\n");

        // 5. Aplicando um cupom de desconto -> Retorna mais um NOVO carrinho
        Carrinho carrinhoComDesconto = carrinhoSemTv.aplicarCupom(new BigDecimal("0.20")); // 20%
        System.out.println("--- Aplicado cupom de 20% ---");
        System.out.println("Total no carrinho anterior: " + carrinhoSemTv.getTotal().getValor() + " (imutável)");
        System.out.println("Total com desconto no novo carrinho: " + carrinhoComDesconto.getTotal().getValor());
        System.out.println("------------------------\n");

        // 6. Tentativa de aplicar cupom inválido
        try {
            System.out.println("--- Tentando aplicar cupom inválido (40%) ---");
            carrinhoComDesconto.aplicarCupom(new BigDecimal("0.40"));
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
            System.out.println("O carrinho anterior permanece intacto: " + carrinhoComDesconto.getTotal().getValor());
            System.out.println("------------------------\n");
        }
    }
}
