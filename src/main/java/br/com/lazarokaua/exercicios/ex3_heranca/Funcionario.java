package br.com.lazarokaua.exercicios.ex3_heranca;

import java.math.BigDecimal;

public class Funcionario {
    protected String nome;
    protected BigDecimal salario;

    public Funcionario(String nome, BigDecimal salario) {
        this.nome = nome;
        this.salario = salario.compareTo(BigDecimal.ZERO) > 0 ? salario : BigDecimal.ZERO;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public BigDecimal calcularBonus() {
        return BigDecimal.ZERO;
    }

    




}
