package br.com.lazarokaua.exercicios.ex8_strategy;

import java.math.BigDecimal;

public class Pedido {

    private BigDecimal valor;
    private String cepDestino;
    private Frete frete;

    public Pedido(BigDecimal valor, String cepDestino) {
        this.valor = valor;
        this.cepDestino = cepDestino;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public String getCepDestino() {
        return cepDestino;
    }

    public Frete getFrete() {
        return frete;
    }

    public void setFrete(Frete frete) {
        this.frete = frete;
    }
}
