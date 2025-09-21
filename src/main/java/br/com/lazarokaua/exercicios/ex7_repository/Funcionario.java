package br.com.lazarokaua.exercicios.ex7_repository;

import java.math.BigDecimal;

public class Funcionario implements Identificavel<Integer> {
    private final Integer id;
    private final String nome;
    private final BigDecimal salario;

    public Funcionario(Integer id, String nome, BigDecimal salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    @Override
    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return "Funcionario{"
                + "id=" + id + 
                ", nome='" + nome + "'" +
                ", salario=" + salario + 
                '}';
    }
}
