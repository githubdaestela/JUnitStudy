package com.alura.tdd.junit.javatestesunitariostddjunit.service;

import com.alura.tdd.junit.javatestesunitariostddjunit.modelo.Funcionario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;


class ReajusteServiceTest {

    //Desempenho "a desejar", reajuste 3%
    @Test
    public void reajusteADesejar() {
        ReajusteService reajusteService = new ReajusteService();
        Funcionario funcionario = new Funcionario("Ana", LocalDate.now(), new BigDecimal("1000"));
        reajusteService.concederReajuste(funcionario, Desempenho.A_DESEJAR);
        Assertions.assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
    }

    //Desempenho "bom", reajuste 15%
    @Test
    public void reajusteBom() {
        ReajusteService reajusteService = new ReajusteService();
        Funcionario funcionario = new Funcionario("Ana", LocalDate.now(), new BigDecimal("1000"));
        reajusteService.concederReajuste(funcionario, Desempenho.BOM);
        Assertions.assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());
    }

    //Desempenho "ótimo", reajuste 20%
    @Test
    public void reajusteOtimo() {
        ReajusteService reajusteService = new ReajusteService();
        Funcionario funcionario = new Funcionario("Ana", LocalDate.now(), new BigDecimal("1000"));
        reajusteService.concederReajuste(funcionario, Desempenho.OTIMO);
        Assertions.assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());
    }

}