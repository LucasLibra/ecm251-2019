package com.company;

public class Vendedor {
    private double porcentagemDeComissao;
    private double salarioBase;
    private String nome;
    private Gerente gerente;

    public static int totaldeVendas = 0;

    /*public String getDados(){
        return "Nome: " + this.nome + " - Salário do Mês: " + getSalarioDoMes(totaldeVendas) + "\t\t" + " Gerente: " + gerente.getDados();
    }*/

    public Vendedor(String nome, double salarioBase, Gerente gerente){
        this.nome = nome;
        this.porcentagemDeComissao = 0.05;
        this.salarioBase = salarioBase;
        this.gerente = gerente;
    }

    public String getNome(){
        return this.nome;
    }

    public double getSalarioDoMes(double totaldeVendas){
        return this.getComissao(totaldeVendas) + this.salarioBase;
    }

    public double getSalarioBase(){
        return this.salarioBase;
    }

    public double getComissao(double totalDeVendas){
        return this.porcentagemDeComissao * totalDeVendas;
    }

    public Gerente getGerente(){
        return this.gerente;
    }

}
