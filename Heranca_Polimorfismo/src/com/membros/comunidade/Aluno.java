package com.membros.comunidade;

public class Aluno extends MembrosDaComunidade{
    private String RA;
    public Aluno(String nome, String CPF, String RA){
        super(nome,CPF);
        this.RA = RA;
    }

    @Override
    public String getDados() {
        return super.getDados() + '\t' + this.RA;
    }
}
