package com.alura.tdd.junit.javatestesunitariostddjunit.service;

import com.alura.tdd.junit.javatestesunitariostddjunit.modelo.Funcionario;

import java.math.BigDecimal;

public class ReajusteService {

    public void concederReajuste(Funcionario funcionario, Desempenho desempenho) {
        BigDecimal percentual = desempenho.porcentualReajuste();
        BigDecimal reajuste = funcionario.getSalario().multiply(percentual);
        funcionario.reajusteSalario(reajuste);
    }
}
