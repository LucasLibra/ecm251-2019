package atividadedois;

public class Pedido {
    //Pedido pedido = new Pedido( cli , carrinho );
    private Cliente cliente;
    private Carrinho carrinho;
    private static int numeroDePedidos;
    public Pedido(Cliente cli, Carrinho carrinho){
        this.cliente = cli;
        this.carrinho = carrinho;
    }

    public String resumoPedido(Carrinho carrinho){
        String temp ="Senhor(a)" + this.cliente.getNome() + ",seu pedido foi gerado com sucesso \n";
        temp = temp + Integer.toString(Pedido.numeroDePedidos);
        temp = temp + this.cliente.getNome() + "\n";
        temp = temp + this.cliente.getCPF() + "\n";
        temp = temp + "Endereço de Entrega: " + this.cliente.getEndereco() + "\n";
        Pedido.numeroDePedidos ++;
        temp = temp + "Resumo da Compra" + "\n";
        temp = temp + "Você comprou " + carrinho.getSize() + " itens" + "\n";
        temp = temp + carrinho.retornarResumo();
        temp = temp + "Um boleto foi enviado para o email: " +this.cliente.getEmail() + ". Obrigado pela preferência :D";
        return temp;
    }

}
