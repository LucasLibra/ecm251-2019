package com.company;

import auxiliar_database.UsuariosDAO;
import model.Usuario;
import utilities.Constants;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aplicacao {
    private UsuariosDAO usuariosDAO;
    private List<Usuario> users;
    public Aplicacao(){
        usuariosDAO = new UsuariosDAO(Constants.URL_MEU_BANCO);
        users = new ArrayList<>();
    }

    public void run(){
        Scanner scanner = new Scanner(System.in);
        do{
            menu();
            int op = scanner.nextInt();
            switch(op) {
                case 1:
                    String nome, email, senha;
                    System.out.println("Informe: ");
                    nome = scanner.next();
                    email = scanner.next();
                    senha = scanner.next();
                    Usuario user = new Usuario(nome, email, senha);
                    usuariosDAO.insertUsuario(user);
                    break;
                case 2:

                    users = usuariosDAO.getAllUsuario();
                    for (Usuario u : users) {
                        System.out.println("id: " + u.id);
                        System.out.println("Nome: " + u.nome);
                        System.out.println("Email: " + u.email);
                    }
            }
        } while (true);
    }
    public void menu(){
        System.out.println("1 - Inserir Usuario");
        System.out.println("2 - Mostrar todos os usuários");
        System.out.println("3 - Buscar usuário");
        System.out.println("4 - Atualizar usuário");
        System.out.println("5 - Remover usuario");
        System.out.println("0 - Sair");
    }
}
