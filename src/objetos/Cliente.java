package objetos;

public class Cliente {
    private String nome = "";
    private String cpf = "";
    private String sexo = "";
    private String endereco = "";
    private String cidade = "";
    private String estado = "";
    private String dataNasc = "";
    private String fone = "";



    public Cliente() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
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
        return dataNasc;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }


     public void limpaCliente(){
       nome = "";
       cpf = "";
       sexo = "";
       endereco = "";
       cidade = "";
       estado = "";
       dataNasc = "";
       fone = "";
    }   
    

}