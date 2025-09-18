package br.com.lazarokaua.exercicios.ex5_sistemaDePagamento;

import java.math.BigDecimal;

public class Boleto extends FormaPagamento {

    private String numeroBoleto;

    public Boleto(String numero) {
        this.numeroBoleto = numero;
    }

    @Override
    public void validarPagamento(BigDecimal valor) throws PagamentoInvalidoException {
        if (getNumeroBoleto() == null || getNumeroBoleto().isEmpty()) {
            throw new PagamentoInvalidoException("Numero do Boleto está inválido! ");
        }

        if (getNumeroBoleto().length() != 47 || getNumeroBoleto().length() < 0) {
            throw new PagamentoInvalidoException("Numero do Boleto Incorreto. ");
        }
    }

    public String getNumeroBoleto() {
        return numeroBoleto;
    }

    public void setNumeroBoleto(String numero) {
        this.numeroBoleto = numero;
    }

}
