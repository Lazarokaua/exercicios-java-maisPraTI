package br.com.lazarokaua.exercicios.ex5_sistemaDePagamento;

import java.math.BigDecimal;
import java.time.YearMonth;

public class CartaoCredito extends FormaPagamento{
    private String numeroCartao;
    private YearMonth dataValidade;
    private int codigoDeSeguranca;
    private String nomeTitular;
    private String bandeiraCartao;


    public CartaoCredito(String numeroCartao, YearMonth dataValidade, int codigoDeSeguranca, String nomeTitular, String bandeiraCartao) {
        this.numeroCartao = numeroCartao;
        this.dataValidade = dataValidade;
        this.codigoDeSeguranca = codigoDeSeguranca;
        this.nomeTitular = nomeTitular;
        this.bandeiraCartao = bandeiraCartao;
    }


    public String getNumeroCartao() {
        return numeroCartao;
    }


    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }


    public YearMonth getDataValidade() {
        return dataValidade;
    }


    public void setDataValidade(YearMonth dataValidade) {
        this.dataValidade = dataValidade;
    }


    public int getCodigoDeSeguranca() {
        return codigoDeSeguranca;
    }


    public void setCodigoDeSeguranca(int codigoDeSeguranca) {
        this.codigoDeSeguranca = codigoDeSeguranca;
    }


    public String getNomeTitular() {
        return nomeTitular;
    }


    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }


    public String getBandeiraCartao() {
        return bandeiraCartao;
    }


    public void setBandeiraCartao(String bandeiraCartao) {
        this.bandeiraCartao = bandeiraCartao;
    }

    @Override
    public void validarPagamento(BigDecimal valor) throws PagamentoInvalidoException {
        if (getNumeroCartao() == null || getNumeroCartao().isEmpty()) {
            throw new PagamentoInvalidoException("Numero do Cartão não pode ser vazio ou nulo. ");
        }

        if (getNumeroCartao().length() != 16) {
            throw new PagamentoInvalidoException("Numero do Cartão inválido! ");
        }
    }


}
