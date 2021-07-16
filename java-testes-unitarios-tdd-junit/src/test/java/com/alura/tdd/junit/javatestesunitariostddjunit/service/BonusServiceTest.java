package com.alura.tdd.junit.javatestesunitariostddjunit.service;

import com.alura.tdd.junit.javatestesunitariostddjunit.modelo.Funcionario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
    public void bonusDeveriaSerZero() {
        //intancia a classe que quer testar
        BonusService bonusService = new BonusService();
        //chamando o método e passando como parametro um funcionario intanciando um Funcionario(classe)
        //passar o retorno do método para uma variável
        BigDecimal bonus = bonusService.calcularBonus(new Funcionario("Raquel", LocalDate.now(), new BigDecimal("25000.00")));
        //Verificar se o valor de retono vai ser zero como o esperado
        Assertions.assertEquals(new BigDecimal("0.00"), bonus);
    }

    @Test
    public void bonusDeveriaSerDezPorCento() {
        BonusService bonusService = new BonusService();
        BigDecimal bonus = bonusService.calcularBonus(new Funcionario("Raquel", LocalDate.now(), new BigDecimal("2500")));
        Assertions.assertEquals(new BigDecimal("250.00"), bonus);
    }

    @Test
    public void bonusDeveriaSer10PorCento() {
        BonusService bonusService = new BonusService();
        BigDecimal bonus = bonusService.calcularBonus(new Funcionario("Raquel", LocalDate.now(), new BigDecimal("10000")));
        Assertions.assertEquals(new BigDecimal("1000.00"), bonus);
    }


}