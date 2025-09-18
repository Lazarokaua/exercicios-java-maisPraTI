package br.com.lazarokaua.exercicios.ex5_sistemaDePagamento;

import java.math.BigDecimal;

public class Pix extends FormaPagamento {
    private String chave;
    private chavePix tipoChave;

    public enum chavePix {
        ALEATORIA,
        EMAIL,
        CELULAR,
        CPF,
        CNPJ;
    }

    public Pix(String chave, chavePix tipoChave) {
        this.chave = chave;
        this.tipoChave = tipoChave;
    }

@Override
public void validarPagamento(BigDecimal valor) throws PagamentoInvalidoException {
    if (chave == null || chave.isEmpty()) {
        throw new PagamentoInvalidoException("Chave Pix não pode ser nula ou vazia.");
    }

    switch (tipoChave) {
        case CPF:
            if (chave.length() != 11) {
                throw new PagamentoInvalidoException("Chave Pix CPF inválida.");
            }
            break;
        case CNPJ:
            if (chave.length() != 14) {
                throw new PagamentoInvalidoException("Chave Pix CNPJ inválida.");
            }
            break;
        case EMAIL:

            if (!chave.contains("@") || !chave.contains(".")) {
                throw new PagamentoInvalidoException("Chave Pix Email inválida.");
            }
            break;
        case CELULAR:
            if (chave.length() != 10) {
                throw new PagamentoInvalidoException("Chave Pix Celular inválida.");
            }
            break;
        case ALEATORIA:
            if (chave.length() != 32) {
                throw new PagamentoInvalidoException("Chave Pix Aleatória inválida.");
            }
            break;
    }
}

    public String getChave() {
        return chave;
    }

    public void setChave(String chave) {
        this.chave = chave;
    }

    public chavePix getTipoChave() {
        return tipoChave;
    }

    public void setTipoChave(chavePix tipoChave) {
        this.tipoChave = tipoChave;
    }
}
