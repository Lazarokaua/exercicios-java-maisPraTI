package br.com.lazarokaua.exercicios.ex5_sistemaDePagamento;

import java.math.BigDecimal;

public abstract class FormaPagamento {
    public abstract void validarPagamento(BigDecimal valor) throws PagamentoInvalidoException;
    public void processarPagamento(BigDecimal valor) {
        System.out.println("Processando pagamento...");

        try {
            validarPagamento(valor);
            System.out.println("Pagamento efetuado!");
        } catch (PagamentoInvalidoException e) {
            System.out.println("Erro no Pagamento: " + e);
        }

    }
}
