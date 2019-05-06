package com.company;
//XGH Extreme Go Horse
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class SistemaLogin {
    private List<Usuário> listaUsuarios;

    public SistemaLogin(){
        listaUsuarios = new LinkedList<Usuário>();
    }

    public void Monitorar(){
        Scanner scanner = new Scanner(System.in);
        while(true) {
            ExibirMenu();
            int op = scanner.nextInt();
            AvaliarEscolha(op);
        }
    }
    public void ExibirMenu(){
        System.out.println("1 - Logar");
        System.out.println("2 - Novo Usuário");
        System.out.println("3 - Usuários Cadastrados");
        System.out.println("4 - Trocar Senha");
        System.out.println("0 - Sair");
    }
    private void AvaliarEscolha(int op){
        switch (op){
            case 0: System.exit(0); break;
            case 2: CadastrarUsuario(); break;
            case 3: ExibirListaDeUsuarios(); break;
            default:
                System.out.println("Será implementado em versões futuras");
                break;
        }
    }

    private void ExibirListaDeUsuarios() {
        System.out.println("Usuários Cadastrados: ");
        for(Usuário i : listaUsuarios){
            System.out.println(i.getEmail() + "-" + i.getEmail());
        }
    }

    private void CadastrarUsuario() {
        System.out.println("Informe um usuário, email e senha: ");
        Scanner scanner = new Scanner(System.in);
        String nome = scanner.next();
        String email = scanner.next();
        String senha = scanner.next();
        listaUsuarios.add(new Player(nome,email,senha));
        System.out.println("Cadastrado com Sucesso! ");
    }

}
