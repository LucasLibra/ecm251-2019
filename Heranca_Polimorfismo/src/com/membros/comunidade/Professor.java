package com.membros.comunidade;

public class Professor extends CorpoDocente {
    private String disciplina;
    public Professor(String nome, String CPF, double salario, String disciplina){
        super(nome,CPF,salario);
        this.disciplina = disciplina;
    }

    @Override
    public String getDados() {
        return super.getDados() + '\t' + this.disciplina;
    }
}
