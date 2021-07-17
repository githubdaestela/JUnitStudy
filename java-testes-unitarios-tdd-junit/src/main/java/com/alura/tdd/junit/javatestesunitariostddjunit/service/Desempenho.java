package com.alura.tdd.junit.javatestesunitariostddjunit.service;

import java.math.BigDecimal;

public enum Desempenho {


    //Implementação de cada cosntante
    A_DESEJAR {
        @Override
        public BigDecimal porcentualReajuste() {
            return new BigDecimal("0.03");
        }
    },
    BOM {
        @Override
        public BigDecimal porcentualReajuste() {
            return new BigDecimal("0.15");
        }
    },
    OTIMO {
        @Override
        public BigDecimal porcentualReajuste() {
            return new BigDecimal("0.20");
        }
    };

    //Devolver qual é o BigDecimal para reajuste para economizar nos if's
    //Abtrato pois cada consante é obrigado a fornecer uma implementação
    public abstract BigDecimal porcentualReajuste();
}
