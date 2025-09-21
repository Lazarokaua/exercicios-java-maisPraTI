package br.com.lazarokaua.exercicios.ex8_strategy;

import java.math.BigDecimal;

public class Sedex implements Frete {
    @Override
    public BigDecimal calcular(Pedido pedido) {
        // Lógica de cálculo de frete para Sedex (ex: 10% do valor do pedido)
        return pedido.getValor().multiply(new BigDecimal("0.10"));
    }
}
