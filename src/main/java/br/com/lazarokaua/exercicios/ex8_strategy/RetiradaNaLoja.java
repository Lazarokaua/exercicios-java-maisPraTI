package br.com.lazarokaua.exercicios.ex8_strategy;

import java.math.BigDecimal;

public class RetiradaNaLoja implements Frete {
    @Override
    public BigDecimal calcular(Pedido pedido) {
        return BigDecimal.ZERO;
    }
}
