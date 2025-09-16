package br.com.lazarokaua.exercicios.ex3_heranca;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Gerente carlos = new Gerente("Carlos", new BigDecimal(10000));
        System.out.println("Nome: " + carlos.getNome());
        System.out.println("Salário: " + carlos.getSalario());
        System.out.println("Bonus: " + carlos.calcularBonus());


        Desenvolvedor joao = new Desenvolvedor("João", new BigDecimal(5000));
        System.out.println("Nome: " + joao.getNome());
        System.out.println("Salário: " + joao.getSalario());
        System.out.println("Bonus: " + joao.calcularBonus());


        List<Funcionario> funcionario = new ArrayList<>();
        funcionario.add(carlos);
        funcionario.add(joao);

        funcionario.add(new Desenvolvedor("Lázaro Kauã", new BigDecimal(7500)));
        funcionario.add(new Desenvolvedor("Izaias Fernando", new BigDecimal(8500)));
        funcionario.add(new Desenvolvedor("Rodrigo Santos", new BigDecimal(9000)));
        funcionario.add(new Desenvolvedor("Felipe Melo", new BigDecimal(16500)));
        funcionario.add(new Desenvolvedor("Amanda Nunes", new BigDecimal(4000)));

        funcionario.stream().forEach(f -> System.out.println(f.getNome() + " Recebe de Bonus: " + f.calcularBonus()));
    }
}
