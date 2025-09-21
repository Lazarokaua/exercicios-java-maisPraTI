## Exercício 7 — Generics

> ( Repositório Genérico em Memória) Defina Identificavel com getId(). Crie IRepository<T extends Identificavel, ID> com salvar, buscarPorId (retorna Optional<T>), listarTodos e remover. Implemente InMemoryRepository com Map<ID, T>, garanta que listarTodos devolva cópia imutável e lance EntidadeNaoEncontradaException ao remover ID inexistente. Use com entidades como Produto e Funcionario.


