package br.com.lazarokaua.exercicios.ex6_imutabilidade;

import java.util.Objects;

public class ItemCarrinho {
    private final Produto produto;
    private final int quantidade;

    public ItemCarrinho(Produto produto, int quantidade) {
        if (quantidade < 0) {
            throw new IllegalArgumentException();
        }

        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }


    @Override
    public boolean equals(Object obj) {
        if ( this == obj ) return true;
        if ( obj == null || getClass() != obj.getClass()) return false;

        ItemCarrinho other = (ItemCarrinho) obj;

        return produto.equals(other.produto) && quantidade == other.quantidade;
    }

    @Override
    public int hashCode() {
        return Objects.hash(produto, quantidade);
    }
}
