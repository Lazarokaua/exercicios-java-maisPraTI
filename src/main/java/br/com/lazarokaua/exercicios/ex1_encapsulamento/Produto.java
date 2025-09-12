package br.com.lazarokaua.exercicios.ex1_encapsulamento;

public class Produto {
  private String nome;
  private double preco;
  private int quantidadeEmEstoque;

  protected Produto(String nome, double preco, int quantidadeEmEstoque) {
      this.nome = nome;
      this.preco = preco;
      this.quantidadeEmEstoque = quantidadeEmEstoque;
  }

  public String getNome() {
    return this.nome;
  }

  public double getPreco() {
    return this.preco;
  }

  public int getQuantidadeEmEstoque() {
    return this.quantidadeEmEstoque;
  }

  public void setNome(String nome) {
    if (nome == null || nome.isEmpty()) {
      throw new IllegalArgumentException("Nome inválido");
    }
      this.nome = nome;
  }

  public void setPreco(double preco) {
    if (preco < 0 ) {
      throw new IllegalArgumentException("Preço inválido");
    }
    this.preco = preco;
  }

  public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
      if (quantidadeEmEstoque < 0) {
          throw new IllegalArgumentException("Quantidade inválida");
      }
      this.quantidadeEmEstoque = quantidadeEmEstoque;
  }

  @Override
  public String toString() {
      return "Produto: " + this.nome + "com preco: " + this.preco;
  }

}
