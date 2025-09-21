package br.com.lazarokaua.exercicios.ex7_repository;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        // Repositório de Produtos
        IRepository<Produto, String> produtoRepository = new InMemoryRepository<>();
        System.out.println("--- Repositório de Produtos ---");

        // Salvar produtos
        produtoRepository.salvar(new Produto("1", "Notebook"));
        produtoRepository.salvar(new Produto("2", "Mouse"));
        System.out.println("Produtos salvos.");

        // Listar todos os produtos
        System.out.println("Listando todos: " + produtoRepository.listarTodos());
        
        // Buscar produto por ID
        System.out.println("Buscando produto com id 1: " + produtoRepository.buscarPorId("1"));

        // Remover produto
        produtoRepository.remover("2");
        System.out.println("Produto com id 2 removido.");
        System.out.println("Listando todos novamente: " + produtoRepository.listarTodos());

        // Tentar remover produto inexistente
        try {
            produtoRepository.remover("3");
        } catch (EntidadeNaoEncontradaException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n--- Repositório de Funcionários ---");

        // Repositório de Funcionários
        IRepository<Funcionario, Integer> funcionarioRepository = new InMemoryRepository<>();

        // Salvar funcionários
        funcionarioRepository.salvar(new Funcionario(1, "João", new BigDecimal("3000")));
        funcionarioRepository.salvar(new Funcionario(2, "Maria", new BigDecimal("4000")));
        System.out.println("Funcionários salvos.");

        // Listar todos os funcionários
        System.out.println("Listando todos: " + funcionarioRepository.listarTodos());

        // Buscar funcionário por ID
        System.out.println("Buscando funcionário com id 2: " + funcionarioRepository.buscarPorId(2));

        // Remover funcionário
        funcionarioRepository.remover(1);
        System.out.println("Funcionário com id 1 removido.");
        System.out.println("Listando todos novamente: " + funcionarioRepository.listarTodos());
    }
}
