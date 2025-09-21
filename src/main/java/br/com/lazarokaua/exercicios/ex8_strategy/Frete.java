package br.com.lazarokaua.exercicios.ex8_strategy;

import java.math.BigDecimal;

public interface Frete {
    BigDecimal calcular(Pedido pedido);
}
