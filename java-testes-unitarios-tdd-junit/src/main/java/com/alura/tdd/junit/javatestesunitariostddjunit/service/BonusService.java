package com.alura.tdd.junit.javatestesunitariostddjunit.service;

import com.alura.tdd.junit.javatestesunitariostddjunit.modelo.Funcionario;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BonusService {

    //Regra de negócio do bonus do funcionario
    //nesse método retorna um BIgDecimal recebendo como parametro o objeto Funcionario(classe)
    public BigDecimal calcularBonus(Funcionario funcionario) {
        //variavel valor do tipo BigDecimal que pega o salario atual, multiplica por 0.1
        BigDecimal valor = funcionario.getSalario().multiply(new BigDecimal("0.1"));
        //verificação para o valor do bonus não passar de mil reais
        if (valor.compareTo(new BigDecimal("1000")) > 0) {
            valor = BigDecimal.ZERO;
        }
        return valor.setScale(2, RoundingMode.HALF_UP);
    }
}


