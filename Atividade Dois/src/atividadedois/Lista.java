package atividadedois;

public abstract class Lista {
    public abstract Boolean adicionarALista(Produto produto);
    public abstract int getRestantes();
    public abstract Boolean removerUltimoDaLista();
    public abstract String retornarResumo();
}
