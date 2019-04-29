package compras;

import java.util.ArrayList;
import java.util.List;

public class ListaDeCompras {
    private List<Produto> produtos;

    public ListaDeCompras(){
        produtos = new ArrayList<Produto>();
    }

    public boolean adicionarProduto(Produto p){
        if(p == null)
            return false;
        else{
            produtos.add(p);
            return true;
        }
    }
    public boolean removerProduto(String nome){
        Produto produto = new Produto(nome);
        return produtos.remove(produto);
    }

    public void listarProdutos(){
        for(Produto i : produtos){
            System.out.println(i);
        }
    }
    public int procurar(Produto produto){
        /*int j = 0;
        for(Produto i : produtos){
            j = j+1;
            if(produto == i){
                return 1;
            }
        }*/
        return 1;
    }

    public boolean modificar(int n, Produto produto){
        return false;
    }
}

