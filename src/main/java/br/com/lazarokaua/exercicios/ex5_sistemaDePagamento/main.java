package br.com.lazarokaua.exercicios.ex5_sistemaDePagamento;

import java.math.BigDecimal;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.List;

class Main { 

    public static void main(String[] args) {

        List<FormaPagamento> formasDePagamento = new ArrayList<>();


        CartaoCredito cartao = new CartaoCredito("1234567890123456", YearMonth.of(2025, 12), 123, "Titular do Cartão", "Visa");
        Boleto boleto = new Boleto("12345678901234567890123456789012345678901234567");
        Pix pix = new Pix("chavepix@email.com", Pix.chavePix.EMAIL);


        formasDePagamento.add(cartao);
        formasDePagamento.add(boleto);
        formasDePagamento.add(pix);


        for (FormaPagamento formaPagamento : formasDePagamento) {
            formaPagamento.processarPagamento(BigDecimal.valueOf(100.00));
        }
    }
}
