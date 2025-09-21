package br.com.lazarokaua.exercicios.ex6_imutabilidade;

import java.util.Objects;

public class Produto {
    private final String nome;
    private final Dinheiro preco;

    public Produto(String nome, Dinheiro preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public Dinheiro getPreco() {
        return preco;
    }


    @Override
    public int hashCode() {
        return Objects.hash(nome, preco);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if ( obj == null || getClass() !=  obj.getClass()) return false;

        Produto other = (Produto) obj;

        return preco.equals(other.preco) && nome.equals(other.nome);
    }




}
