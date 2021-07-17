package com.alura.tdd.junit.javatestesunitariostddjunit.modelo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

public class Funcionario {

    //Atributos
    private String nome;
    private LocalDate dataAdmissao;
    private BigDecimal salario;

    //Métodos
    public Funcionario(String nome, LocalDate dataAdmissao, BigDecimal salario) {
        this.nome = nome;
        this.dataAdmissao = dataAdmissao;
        this.salario = salario;
    }

    public void reajusteSalario(BigDecimal reajuste) {
        this.salario = this.salario.add(reajuste);
        arredondarSalario();
    }

    private void arredondarSalario() {
        this.salario = this.salario.setScale(2, RoundingMode.HALF_UP);
    }

    //Getters
    public String getNome() {
        return nome;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public BigDecimal getSalario() {
        return salario;
    }
}
