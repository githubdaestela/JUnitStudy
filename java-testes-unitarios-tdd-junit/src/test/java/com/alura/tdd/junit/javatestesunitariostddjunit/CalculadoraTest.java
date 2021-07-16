package com.alura.tdd.junit.javatestesunitariostddjunit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    //Para indicar ao JUnit que esse método se trata de um teste
    @Test
    public void deveriaSomarDoisNumerosPositivos() {
        //intancia a classe que quer testar
        Calculadora calc = new Calculadora();
        //e chamar o método passando os parametro
        int soma = calc.somar(3, 7);
        //verificar o teste
        //a classe Assert do JUnit tem vários métodos estáticos para fazer as assertivas (verificações)
        Assertions.assertEquals(10, soma);
        //Os parametros passados são o valor esperado e a variável de onde se espera esse valor.
        //Se colocar o valor esperado errado vai dar erro quando rodar o teste
    }

    @Test
    public void deveriaSomarUmNumeroComZero() {
        Calculadora calc = new Calculadora();
        int soma = calc.somar(3, 0);
        Assertions.assertEquals(3, soma);
    }

    @Test
    public void deveriaSomarDoisNumerosZero() {
        Calculadora calc = new Calculadora();
        int soma = calc.somar(0, 0);
        Assertions.assertEquals(0, soma);
    }

    @Test
    public void deveriaSomarUmNumeroPositivoUmNumeroNegativo() {
        Calculadora calc = new Calculadora();
        int soma = calc.somar(3, -1);
        Assertions.assertEquals(2, soma);
    }

}