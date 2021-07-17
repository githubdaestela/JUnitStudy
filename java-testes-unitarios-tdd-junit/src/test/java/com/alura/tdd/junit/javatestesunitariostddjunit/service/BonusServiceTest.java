package com.alura.tdd.junit.javatestesunitariostddjunit.service;

import com.alura.tdd.junit.javatestesunitariostddjunit.modelo.Funcionario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    private BonusService bonusService;

    @BeforeEach
    public void inicializar() {
        //melhorando BonusService bonusService = new BonusService();
        this.bonusService = new BonusService();
    }

    @Test
    public void bonusDeveriaSerZero() {
//        Assertions.assertThrows(IllegalArgumentException.class, () -> bonusService.calcularBonus(new Funcionario("Raquel", LocalDate.now(), new BigDecimal("25000.00"))));
        try {
            bonusService.calcularBonus(new Funcionario("Raquel", LocalDate.now(), new BigDecimal("25000.00")));
            fail("Não caiu na Exception");
        } catch (Exception e) {
            Assertions.assertEquals("Funcionário sem direito a bônus", e.getMessage());
        }
    }

    @Test
    public void bonusDeveriaSerDezPorCento() {
        //chamando o método e passando como parametro um funcionario intanciando um Funcionario(classe)
        //passar o retorno do método para uma variável
        BigDecimal bonus = bonusService.calcularBonus(new Funcionario("Raquel", LocalDate.now(), new BigDecimal("2500")));
        //Verificar se o valor de retono vai ser zero como o esperado
        Assertions.assertEquals(new BigDecimal("250.00"), bonus);
    }

    @Test
    public void bonusDeveriaSerExatamenteMil() {
        BigDecimal bonus = bonusService.calcularBonus(new Funcionario("Raquel", LocalDate.now(), new BigDecimal("10000")));
        Assertions.assertEquals(new BigDecimal("1000.00"), bonus);
    }


}