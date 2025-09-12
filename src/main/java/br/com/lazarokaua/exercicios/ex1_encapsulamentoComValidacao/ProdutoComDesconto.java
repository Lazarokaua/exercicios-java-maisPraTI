package br.com.lazarokaua.exercicios.ex1_encapsulamentoComValidacao;

import br.com.lazarokaua.exercicios.ex1_encapsulamento.Produto;

public class ProdutoComDesconto extends Produto {

    public ProdutoComDesconto(String nome, double preco, int quantidadeEmEstoque) {
        super(nome, preco, quantidadeEmEstoque);
    }

    public void aplicarDesconto(double porcentagem) {
        if (porcentagem < 0 || porcentagem > 50) {
            throw new IllegalArgumentException("Desconto indiponível! ");
        }

        double desconto = getPreco() * (porcentagem / 100);
        double precoFinal = getPreco() - desconto;

        setPreco(precoFinal);
    }

    @Override
    public String toString() {
        return "Produto " + getNome() + " com desconto: " + getPreco();
    }

}
