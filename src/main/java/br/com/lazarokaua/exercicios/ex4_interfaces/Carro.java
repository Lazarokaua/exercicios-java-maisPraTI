package br.com.lazarokaua.exercicios.ex4_interfaces;

public class Carro implements IMeioTransporte {
    private String modelo;
    private int velocidadeAtual;
    private static final int VELOCIDADE_MAXIMA = 120; 
    private static final int INCREMENTO_VELOCIDADE = 10;
    private static final int DECREMENTO_VELOCIDADE = 10;

    public Carro(String modelo, int velocidadeAtual) {
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
        if (this.velocidadeAtual + INCREMENTO_VELOCIDADE > VELOCIDADE_MAXIMA) {
            setVelocidadeAtual(VELOCIDADE_MAXIMA); // Define a velocidade para a máxima
            throw new IllegalStateException(
                    "O carro " + modelo + " atingiu a velocidade máxima de " + VELOCIDADE_MAXIMA + " km/h.");
        }
        setVelocidadeAtual(this.velocidadeAtual + INCREMENTO_VELOCIDADE);
        System.out
                .println("Carro " + getModelo() + " acelerando. Velocidade atual: " + getVelocidadeAtual() + " km/h.");
    }

    @Override
    public void frear() {
        setVelocidadeAtual(this.velocidadeAtual - DECREMENTO_VELOCIDADE);
        System.out.println("Carro " + getModelo() + " freando. Velocidade atual: " + getVelocidadeAtual() + " km/h.");
    }
}
