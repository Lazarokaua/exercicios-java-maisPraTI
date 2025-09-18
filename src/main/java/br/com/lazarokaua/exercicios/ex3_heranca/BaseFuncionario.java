
package br.com.lazarokaua.exercicios.ex3_heranca;

import java.math.BigDecimal;

class BaseFuncionario {

    protected String nome;
    protected BigDecimal salario;


    public String getNome() {
        return this.nome;
    }

    public BigDecimal getSalarioDecimal() {
        return this.salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalarioDecimal(BigDecimal salario) {
        if (salario.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("O salário não pode ser negativo. ");
        }

        this.salario = salario;
    }


}
