package com.company;

public class Funcionario {
    private double porcentagemDeComissao;
    private double salarioBase;
    private String nome;
    public static int totaldeVendas = 0;


    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.porcentagemDeComissao = 0.05;
        this.salarioBase = salarioBase;
    }
    public String getNome(){
        return this.nome;
    }
    public double getSalarioDoMes(int totaldeVendas) {
        return this.porcentagemDeComissao * totaldeVendas + this.salarioBase;
    }

    public double getSalarioBase(){
        return this.salarioBase;
    }

    public double getComissao(double totalDeVendas){
        return this.porcentagemDeComissao * totalDeVendas;
    }
}
