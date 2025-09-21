package br.com.lazarokaua.exercicios.ex7_repository;

public class Produto implements Identificavel<String> {
    private final String id;
    private final String nome;

    public Produto(String id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    @Override
    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Produto{"
                + "id='" + id + "'" +
                ", nome='" + nome + "'" +
                '}';
    }
}
