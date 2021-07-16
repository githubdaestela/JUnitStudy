package com.alura.tdd.junit.javatestesunitariostddjunit;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    //criar método main que roda a aplicação
    public static void main(String[] args) {
        //instanciar o objeto (classe)
        Calculadora calc = new Calculadora();
        //e chamar o método passando os parametro
        int soma = calc.somar(3, 7);
        //pega o retorno e faz a verificação
        System.out.println(soma);

        //mais possibilidades diante do mesmo cenário
//        int soma = calc.somar(3, 0);
//        System.out.println(soma);

//        int soma = calc.somar(0, 0);
//        System.out.println(soma);

//        int soma = calc.somar(3, -1);
//        System.out.println(soma);
    }

}