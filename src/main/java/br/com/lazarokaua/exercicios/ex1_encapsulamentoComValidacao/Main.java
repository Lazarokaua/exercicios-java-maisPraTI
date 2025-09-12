package br.com.lazarokaua.exercicios.ex1_encapsulamentoComValidacao;

public class Main {
    public static void main(String[] args) {
        ProdutoComDesconto tv = new ProdutoComDesconto("Tv Smart Samsung", 1000, 5);

        // tv.aplicarDesconto(80);
        // tv.toString();
        tv.aplicarDesconto(10);
        System.out.println(tv.toString());
    }
}
