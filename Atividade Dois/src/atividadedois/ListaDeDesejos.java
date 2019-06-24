package atividadedois;

import java.util.ArrayList;

public class ListaDeDesejos extends Lista{
    int n = 5;
    private ArrayList<Produto> desejos = new ArrayList<Produto>(n);

    @Override
    public Boolean adicionarALista(Produto produto) {
        if(desejos.size() < n){
            this.desejos.add(produto);
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public int getRestantes() {
        return n - desejos.size();
    }

    @Override
    public Boolean removerUltimoDaLista() {
        if(desejos.size() > 0){
            this.desejos.remove(desejos.size()-1);
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public String retornarResumo() {
        String temp = "";
        for(int i = 0; i < desejos.size(); i++){
            temp = temp + desejos.get(i).exibirInfos();
        }
        return temp;
    }

}
