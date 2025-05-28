
public class Cliente {
    private int codigo;
    private String nome;
    private String endereco;
    private double debito;
    private double credito;
    public Cliente(int codigo, String nome, String endereco, double debito, double credito){
        this.codigo = codigo;
        this.nome = nome;
        this.endereco = endereco;
        this.debito = debito;
        this.credito = credito;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getDebito() {
        return debito;
    }

    public void setDebito(double debito) {
        this.debito = debito;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    @Override
    public String toString() {
        return "Cliente{" + "codigo=" + codigo + ", nome=" + nome + ", endereco=" + endereco + ", debito=" + debito + ", credito=" + credito + '}';
    }
    
    
}
