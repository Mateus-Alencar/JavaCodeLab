public class Corretor {
    private String nome;
    private double totalComissoes = 0.00;

    public Corretor(String nome, double totalComissoes) {
        this.nome = nome;
        this.totalComissoes = totalComissoes;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public double getTotalComissoes(){
        return totalComissoes;
    }
    public void setTotalComissoes(double totalComissoes){
        this.totalComissoes = totalComissoes;
    }

    public void receberComissao(double valor) {
        this.totalComissoes += valor;
    }

}
