package com.company;

public class FuncionarioTesteDrive {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Ricardo", 1000);
        Funcionario f2 = new Funcionario("Luciano", 1700);
        System.out.println("Salário do Mês " + f1.getSalarioDoMes(10000));
    }
}