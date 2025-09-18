package br.com.lazarokaua.exercicios.ex4_interfaces;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<IMeioTransporte> meioDeTransporte = new ArrayList<>();

        meioDeTransporte.add(new Carro("fiat fastback 2025", 50));
        meioDeTransporte.add(new Bike("BMX", 10));
        meioDeTransporte.add(new Trem("Thomas e Seus Amigos", 50));

        meioDeTransporte.stream().forEach(mt -> mt.acelerar());
        meioDeTransporte.stream().forEach(mt -> mt.acelerar());
        meioDeTransporte.stream().forEach(mt -> mt.acelerar());
        meioDeTransporte.stream().forEach(mt -> mt.frear());
        meioDeTransporte.stream().forEach(mt -> mt.frear());
    }
}
