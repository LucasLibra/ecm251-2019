package compras;

public class Produto {
    private String nomeDoProduto;

    public Produto(String nomeDoProduto){
        this.nomeDoProduto = nomeDoProduto;
    }
    @Override
    public String toString() {
        return this.nomeDoProduto;
    }

    @Override
    public boolean equals(Object obj) {
        return this.nomeDoProduto.equals(obj.toString());
    }
}
