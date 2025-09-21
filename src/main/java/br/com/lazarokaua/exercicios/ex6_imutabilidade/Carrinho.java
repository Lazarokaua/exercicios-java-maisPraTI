package br.com.lazarokaua.exercicios.ex6_imutabilidade;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public final class Carrinho {

    private final List<ItemCarrinho> itens;
    private final Dinheiro total;
    private final BigDecimal cupomDesconto;

    public Carrinho() {
        this.itens = Collections.emptyList();
        this.total = new Dinheiro(BigDecimal.ZERO, Dinheiro.Moeda.BRL);
        this.cupomDesconto = BigDecimal.ZERO;
    }

    private Carrinho(List<ItemCarrinho> itens, BigDecimal cupomDesconto) {
        this.itens = Collections.unmodifiableList(itens);
        this.cupomDesconto = cupomDesconto;
        this.total = calcularTotal(this.itens, this.cupomDesconto);
    }

    public Carrinho adicionarItem(Produto produto, int quantidade) {
        List<ItemCarrinho> novosItens = new ArrayList<>(this.itens);
        novosItens.add(new ItemCarrinho(produto, quantidade));
        return new Carrinho(novosItens, this.cupomDesconto);
    }

    public Carrinho removerItem(Produto produto) {
        List<ItemCarrinho> novosItens = this.itens.stream()
                .filter(item -> !item.getProduto().equals(produto))
                .collect(Collectors.toList());
        return new Carrinho(novosItens, this.cupomDesconto);
    }

    public Carrinho aplicarCupom(BigDecimal cupom) {
        if (cupom.compareTo(BigDecimal.ZERO) < 0 || cupom.compareTo(new BigDecimal("0.3")) > 0) {
            throw new IllegalArgumentException("Cupom de desconto deve estar entre 0 e 30%.");
        }
        return new Carrinho(this.itens, cupom);
    }

    public List<ItemCarrinho> getItens() {
        return itens;
    }

    public Dinheiro getTotal() {
        return total;
    }

    public BigDecimal getCupomDesconto() {
        return cupomDesconto;
    }

    private Dinheiro calcularTotal(List<ItemCarrinho> itens, BigDecimal cupomDesconto) {
        BigDecimal valorTotal = itens.stream()
                .map(item -> item.getProduto().getPreco().getValor().multiply(new BigDecimal(item.getQuantidade())))
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        BigDecimal valorDesconto = valorTotal.multiply(cupomDesconto);
        BigDecimal valorFinal = valorTotal.subtract(valorDesconto);

        return new Dinheiro(valorFinal.setScale(2, RoundingMode.HALF_EVEN), Dinheiro.Moeda.BRL);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carrinho carrinho = (Carrinho) o;
        return Objects.equals(itens, carrinho.itens) &&
                Objects.equals(total, carrinho.total) &&
                Objects.equals(cupomDesconto, carrinho.cupomDesconto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itens, total, cupomDesconto);
    }
}
