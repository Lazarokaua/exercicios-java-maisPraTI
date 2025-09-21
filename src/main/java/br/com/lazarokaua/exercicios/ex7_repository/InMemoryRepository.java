package br.com.lazarokaua.exercicios.ex7_repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class InMemoryRepository<T extends Identificavel<ID>, ID> implements IRepository<T, ID> {
    private final Map<ID, T> storage = new HashMap<>();

    @Override
    public void salvar(T entidade) {
        storage.put(entidade.getId(), entidade);
    }

    @Override
    public Optional<T> buscarPorId(ID id) {
        return Optional.ofNullable(storage.get(id));
    }

    @Override
    public List<T> listarTodos() {
        return Collections.unmodifiableList(new ArrayList<>(storage.values()));
    }

    @Override
    public void remover(ID id) {
        if (!storage.containsKey(id)) {
            throw new EntidadeNaoEncontradaException("Entidade com id " + id + " não encontrada.");
        }
        storage.remove(id);
    }
}