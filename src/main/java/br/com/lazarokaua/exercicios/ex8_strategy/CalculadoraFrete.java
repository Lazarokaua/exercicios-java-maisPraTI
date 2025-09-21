package br.com.lazarokaua.exercicios.ex8_strategy;

import java.math.BigDecimal;

public class CalculadoraFrete {

    public BigDecimal calcular(Pedido pedido) {
        String cepDestino = pedido.getCepDestino();

        // Simulação de validação de CEP
        if (cepDestino == null || cepDestino.length() != 8 || !cepDestino.matches("[0-9]+")) {
            throw new CepInvalidoException("CEP inválido: " + cepDestino);
        }

        Frete frete = pedido.getFrete();
        if (frete == null) {
            throw new IllegalStateException("Estratégia de frete não definida!");
        }

        return frete.calcular(pedido);
    }
}
