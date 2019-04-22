package com.membros.comunidade;

public class Funcionarios extends Empregado {
    private String area;
    public Funcionarios(String nome, String CPF, String area,double salario){
        super(nome,CPF,salario);
        this.area = area;
    }
}
