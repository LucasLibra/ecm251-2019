package com.company;

public class Gerente {
    private double comissao;
    private double salarioBase;
    private String nome;
    public static int totaldeVendas = 0;

    /*public String getDados(){
        return "Nome: " + this.nome + " - Salário do Mês: " + getSalarioDoMes(totaldeVendas);
    }*/

    public Gerente(String nome, double salarioBase){
        this.nome = nome;
        this.comissao = 0.1;
        this.salarioBase = salarioBase;
    }


    public double getSalarioDoMes(double totaldeVendas){
        return this.getComissao(totaldeVendas) + this.salarioBase;
    }

    public double getSalarioBase(){
        return this.salarioBase;
    }

    public double getComissao(double totalDeVendas){
        return this.comissao*totalDeVendas + 0.5*this.salarioBase;
    }

    public boolean aumentarSalarioBaseVendedor(Vendedor vendedor){
        if(vendedor.getGerente().equals(this)) {
            return true;
        } else {
            return false;
        }
    }
}
