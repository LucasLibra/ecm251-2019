package com.membros.comunidade;

public class Empregado extends MembrosDaComunidade {
    protected double salario;
    public Empregado(String nome, String CPF,double salario){
        super(nome,CPF);
        this.salario = salario;
    }

    @Override
    public String getDados() {
        return super.getDados() + '\t' + this.salario;
    }
}
