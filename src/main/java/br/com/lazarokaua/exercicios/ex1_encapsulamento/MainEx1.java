package br.com.lazarokaua.exercicios.ex1_encapsulamento;

public class MainEx1 {
  public static void main(String[] args) {
    Produto televisao32Samsung = new Produto("Tv 32 Samsung", 2999.99, 10);
    System.out.println("--- Produto criado com sucesso ---");
    System.out.println("Nome: " + televisao32Samsung.getNome());
    System.out.println("Preço: " + televisao32Samsung.getPreco());
    System.out.println("Quantidade em estoque: " + televisao32Samsung.getQuantidadeEmEstoque());
    System.out.println("\n====================================\n");
    
    System.out.println("--- Tentando criar produto com preço negativo (no construtor) ---");
    try {
      Produto televisao42Lg = new Produto("Tv 42 LG", -6, 5);
      System.out.println("Nome: " + televisao42Lg.getNome());
    } catch (IllegalArgumentException e) {
      System.out.println("ERRO CAPTURADO: " + e.getMessage());
    }
    System.out.println("\n====================================\n");
    
    System.out.println("--- Tentando alterar para um nome inválido (vazio) ---");
    try {
      televisao32Samsung.setNome("");
      System.out.println("Novo nome: " + televisao32Samsung.getNome());
    } catch (IllegalArgumentException e) {
      System.out.println("ERRO CAPTURADO: " + e.getMessage());
    }
    System.out.println("\n====================================\n");
    
    System.out.println("--- Tentando alterar para quantidade inválida (negativa) ---");
    try {
      televisao32Samsung.setQuantidadeEmEstoque(-5);
      System.out.println("Nova quantidade: " + televisao32Samsung.getQuantidadeEmEstoque());
    } catch (IllegalArgumentException e) {
      System.out.println("ERRO CAPTURADO: " + e.getMessage());
    }
  }
}