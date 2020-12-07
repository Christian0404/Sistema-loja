package objetos;

public class Cliente {
    private String nome = "";
    private String cpf = "";
    private String endereco = "";
    private String cidade = "";
    private String estado = "";
    private String dataNasc = "";
    private String email = "";
    private String fone = "";
    private String cnpj = ""; 
    private int id;


    public Cliente() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
        public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }
    
    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    public int getId() {
        return id;
    }    

    public void setId(int id) {
        this.id = id;
    }    



     public void limpaCliente(){
       nome = "";
       cpf = "";
       endereco = "";
       cidade = "";
       estado = "";
       dataNasc = "";
       fone = "";
       cnpj = "";
    }   
    

}
