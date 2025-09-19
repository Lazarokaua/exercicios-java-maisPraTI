package br.com.lazarokaua.exercicios.ex6_imutabilidade;

import java.math.BigDecimal;
import java.util.Objects;

public final class Dinheiro {
    private final BigDecimal valor;
    private final Moeda moeda;

    public enum Moeda {
        BRL,
        USD,
        EUR
    }

    public Dinheiro(BigDecimal valor, Moeda moeda) {
        this.valor = valor;
        this.moeda = moeda;
    }

    public BigDecimal getValor() {
        return this.valor;
    }

    public Moeda getMoeda() {
        return this.moeda;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if ( obj == null || getClass() !=  obj.getClass()) return false;

        Dinheiro dinheiro = (Dinheiro) obj;

        return valor.equals(dinheiro.valor) && moeda == dinheiro.moeda;
    }

}
