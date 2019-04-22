package com.membros.comunidade;

public class Graduado extends MembrosDaComunidade {
    private String curso;
    public Graduado(String nome, String CPF, String curso) {
        super(nome, CPF);
        this.curso = curso;
    }

    @Override
    public String getDados() {
        return super.getDados() + '\t' + this.curso;
    }
}