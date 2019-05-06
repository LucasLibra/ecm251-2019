package com.company;

public class GameMaster extends Usuário{
    public GameMaster(String nome, String email, String senha){
        super(nome,email,senha);
    }

    @Override
    public boolean autentica(String senha) {
        return false;
    }
}
