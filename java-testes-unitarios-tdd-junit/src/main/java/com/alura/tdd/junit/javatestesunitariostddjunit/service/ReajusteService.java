package com.alura.tdd.junit.javatestesunitariostddjunit.service;

import com.alura.tdd.junit.javatestesunitariostddjunit.modelo.Funcionario;

import java.math.BigDecimal;

public class ReajusteService {

    public void concederReajuste(Funcionario funcionario, Desempenho desempenho) {
        if (desempenho == Desempenho.A_DESEJAR) {
            BigDecimal reajusteADesejar = funcionario.getSalario().multiply(new BigDecimal("0.03"));
            funcionario.reajusteSalario(reajusteADesejar);
        } else if (desempenho == Desempenho.BOM) {
            BigDecimal reajusteBom = funcionario.getSalario().multiply(new BigDecimal("0.15"));
            funcionario.reajusteSalario(reajusteBom);
        } else {
            BigDecimal reajusteOtimo = funcionario.getSalario().multiply(new BigDecimal("0.20"));
            funcionario.reajusteSalario(reajusteOtimo);
        }
    }
}
