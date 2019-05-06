package com.company;

public class Player extends Usuário{
    public Player(String nome, String email, String senha){
        super(nome,email,senha);
    }

    @Override
    public boolean autentica(String senha) {
        return senha.equals(this.senha);
    }
}
