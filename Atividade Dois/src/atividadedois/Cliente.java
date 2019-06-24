package atividadedois;

public class Cliente {
    //Cliente cli = new Cliente(cpf, nome, endereco, cep, email);
    private String cpf;
    private String nome;
    private String endereco;
    private String cep;
    private String email;

    public Cliente (String cpf, String nome, String endereco, String cep, String email){
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
        this.cep = cep;
        this.email = email;
    }

    public String getNome(){
        return this.nome;
    }
    public String getCPF(){
        return this.cpf;
    }
    public String getEndereco(){
        return this.endereco;
    }
    public String getCEP(){
        return this.cep;
    }
    public String getEmail(){
        return this.email;
    }
}
