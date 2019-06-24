package atividadedois;

import java.util.ArrayList;

public class Carrinho extends Lista {
    int n = 12;
    private ArrayList<Produto> carr = new ArrayList<>(n);

    @Override
    public Boolean adicionarALista(Produto produto) {
        if(carr.size() < n){
            this.carr.add(produto);
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public Boolean removerUltimoDaLista() {
        if(carr.size() > 0){
            this.carr.remove(carr.size()-1);
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public int getRestantes() {
        return n - carr.size();
    }

    @Override
    public String retornarResumo() {
        String temp = "";
        for(int i = 0; i < carr.size(); i++){
            temp = temp + carr.get(i).exibirInfos();
        }
        return temp;
    }
    public void limparLista(){
        carr.clear();
    }
    public int getSize(){
        return carr.size();
    }
}
