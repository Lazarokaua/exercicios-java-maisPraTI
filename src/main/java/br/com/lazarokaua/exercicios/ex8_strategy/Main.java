package br.com.lazarokaua.exercicios.ex8_strategy;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        CalculadoraFrete calculadora = new CalculadoraFrete();
        Pedido pedido = new Pedido(new BigDecimal("150.00"), "88050100");

        System.out.println("--- Calculando Frete --- C");

        // 1. Estratégia Sedex
        pedido.setFrete(new Sedex());
        BigDecimal valorSedex = calculadora.calcular(pedido);
        System.out.println("Valor do frete com Sedex: R$ " + valorSedex);

        // 2. Trocando para a estratégia PAC em tempo de execução
        pedido.setFrete(new Pac());
        BigDecimal valorPac = calculadora.calcular(pedido);
        System.out.println("Valor do frete com PAC: R$ " + valorPac);

        // 3. Trocando para Retirada na Loja
        pedido.setFrete(new RetiradaNaLoja());
        BigDecimal valorRetirada = calculadora.calcular(pedido);
        System.out.println("Valor do frete com Retirada na Loja: R$ " + valorRetirada);

        // 4. Estratégia Promocional com Lambda (Frete Grátis acima de R$ 100)
        Frete fretePromocional = p -> {
            if (p.getValor().compareTo(new BigDecimal("100.00")) > 0) {
                System.out.println("Aplicando frete grátis promocional!");
                return BigDecimal.ZERO;
            }
            // Caso não atinja o valor, usa o cálculo do PAC como padrão
            return p.getValor().multiply(new BigDecimal("0.05"));
        };

        pedido.setFrete(fretePromocional);
        BigDecimal valorPromocional = calculadora.calcular(pedido);
        System.out.println("Valor do frete com a promoção: R$ " + valorPromocional);

        System.out.println("\n--- Testando Exceção ---");

        // 5. Testando CEP inválido
        try {
            Pedido pedidoInvalido = new Pedido(new BigDecimal("50.00"), "123");
            pedidoInvalido.setFrete(new Sedex());
            calculadora.calcular(pedidoInvalido);
        } catch (CepInvalidoException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
