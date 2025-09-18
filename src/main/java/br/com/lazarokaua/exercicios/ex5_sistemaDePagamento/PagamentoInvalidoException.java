package br.com.lazarokaua.exercicios.ex5_sistemaDePagamento;

public class PagamentoInvalidoException extends Exception {
    public PagamentoInvalidoException(String message) {
        super(message);
    }
}
