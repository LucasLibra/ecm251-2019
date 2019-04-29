package compras;

import java.util.Scanner;

public class ListaDeComprasTestDrive {
    public static void main(String[] args) {
        ListaDeCompras listaDeCompras = new ListaDeCompras();
        Scanner scanner = new Scanner(System.in);
/*
        for(int i = 0; i < 3; i++){
            String nome = scanner.next();
            if(listaDeCompras.adicionarProduto(new Produto(nome))){
                System.out.println("Produto Adicionado");
            }
            else{
                System.out.println("Erro");
            }
        }
*/
        listaDeCompras.adicionarProduto(new Produto("Abacate"));
        listaDeCompras.adicionarProduto(new Produto("Banana"));
        if(listaDeCompras.removerProduto(("Abacate")))
            System.out.println("Removido com sucesso!");
        if(listaDeCompras.removerProduto(("Caqui")))
            System.out.println("Removido com sucesso!");
        else
            System.out.println("Erro ao remover!");

    }
}
