package br.com.lazarokaua.exercicios.ex4_interfaces;

public class Bike implements IMeioTransporte {
    private String modelo;
    private int velocidadeAtual;
    private static final int VELOCIDADE_MAXIMA = 50;
    private static final int INCREMENTO_VELOCIDADE = 5;
    private static final int DECREMENTO_VELOCIDADE = 5;

    public Bike(String modelo, int velocidadeAtual) {
        this.modelo = modelo;
        setVelocidadeAtual(velocidadeAtual);
    }

    private void setVelocidadeAtual(int velocidade) {
        if (velocidade > VELOCIDADE_MAXIMA) {
            this.velocidadeAtual = VELOCIDADE_MAXIMA;
        } else if (velocidade < 0) {
            this.velocidadeAtual = 0;
        } else {
            this.velocidadeAtual = velocidade;
        }
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    @Override
    public void acelerar() {
        if (this.velocidadeAtual >= VELOCIDADE_MAXIMA) {
            throw new IllegalStateException("Operação inválida: A bicicleta já atingiu sua velocidade máxima.");
        }
        
        setVelocidadeAtual(this.velocidadeAtual + INCREMENTO_VELOCIDADE);
        System.out.println("Bicicleta " + getModelo() + " acelerando. Velocidade: " + getVelocidadeAtual() + " km/h.");
    }

    @Override
    public void frear() {
        if (this.velocidadeAtual <= 0) {
            throw new IllegalStateException("Operação inválida: A bicicleta já não está mais em movimento");
        }

        setVelocidadeAtual(this.velocidadeAtual - DECREMENTO_VELOCIDADE);
        System.out
                .println("Bicicleta " + getModelo() + " freando. Velocidade atual: " + getVelocidadeAtual() + " km/h.");
    }
}
