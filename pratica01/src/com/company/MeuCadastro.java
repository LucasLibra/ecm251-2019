package com.company;
import java.util.Scanner;

public class MeuCadastro {
    public static void main(String[] args) {
        String name, funcao;
        int idade;
        double salario;
        // Pega os dados do teclado
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        while(continuar) {
            // Lê o nome
            System.out.println("Digite seu nome: ");
            name = scanner.nextLine();
            // Lê a função
            System.out.println("Digite sua função: ");
            funcao = scanner.nextLine();
            // Lê a idade
            System.out.println("Digite sua idade: ");
            idade = scanner.nextInt();
            // Lê o salário
            System.out.println("Digite seu salário: ");
            salario = scanner.nextDouble();
            // Exibição
            System.out.printf(
                    "Nome: %s\nFunção: %s\nIdade: %d\nSalário: R$%5.2f \n",
                    name,  // Nome do Usuário
                    funcao, // Cargo do Usuário
                    idade,  // Idade do Usuário
                    salario // Salário do Usuário
            );
            String resposta;
            System.out.println("Você deseja continuar? ");
            resposta = scanner.next();
            if(resposta.equalsIgnoreCase("SIM"))
                continuar = true;
            else
                continuar = false;
        }
    }
}
