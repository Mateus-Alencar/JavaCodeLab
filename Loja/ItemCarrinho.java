public class ItemCarrinho {
    private int produto;
    private double quantidade;
    private double preco;
    public ItemCarrinho(int produto, double quantidade, double preco){
        this.produto = produto;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public int getProduto() {
        return produto;
    }

    public void setProduto(int produto) {
        this.produto = produto;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "ItemCarrinho{" + "produto=" + produto + ", quantidade=" + quantidade + ", preco=" + preco + '}';
    }
    
    
}
