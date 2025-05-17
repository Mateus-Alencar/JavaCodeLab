// Mateus da Silva Alencar
// RGM: 38254301



public class Main
{
	public static void main(String[] args) {
		Estoque estoque = new Estoque();
		
        estoque.adicionarPerecivel(new ProdutoPerecivel(1, "Leite", 30, 5, "25/04/2025"));
        estoque.adicionarPerecivel(new ProdutoPerecivel(2, "Iogurte", 20, 5, "22/04/2025"));
        estoque.adicionarPerecivel(new ProdutoPerecivel(3, "Queijo", 15, 3, "28/04/2025"));
        estoque.adicionarPerecivel(new ProdutoPerecivel(4, "Pão", 40, 10, "24/04/2025"));
        estoque.adicionarPerecivel(new ProdutoPerecivel(5, "Presunto", 12, 2, "26/04/2025"));
        estoque.adicionarPerecivel(new ProdutoPerecivel(6, "Frango", 25, 4, "27/04/2025"));
        estoque.adicionarPerecivel(new ProdutoPerecivel(7, "Carne Moída", 18, 3, "28/04/2025"));
        estoque.adicionarPerecivel(new ProdutoPerecivel(8, "Manteiga", 22, 5, "30/04/2025"));
        estoque.adicionarPerecivel(new ProdutoPerecivel(9, "Requeijão", 19, 3, "01/05/2025"));
        estoque.adicionarPerecivel(new ProdutoPerecivel(10, "Creme de leite", 35, 6, "03/05/2025"));

        estoque.adicionarEletronico(new ProdutoEletronico(101, "Monitor", 10, 2, "SN12345", 24));
        estoque.adicionarEletronico(new ProdutoEletronico(102, "Notebook", 5, 1, "SN67890", 12));
        estoque.adicionarEletronico(new ProdutoEletronico(103, "Fone de Ouvido", 25, 5, "SN11122", 6));
        estoque.adicionarEletronico(new ProdutoEletronico(104, "Teclado", 40, 10, "SN33344", 18));
        estoque.adicionarEletronico(new ProdutoEletronico(105, "Mouse", 60, 15, "SN55566", 12));
        estoque.adicionarEletronico(new ProdutoEletronico(106, "Impressora", 8, 2, "SN77788", 24));
        estoque.adicionarEletronico(new ProdutoEletronico(107, "Tablet", 12, 3, "SN99900", 12));
        estoque.adicionarEletronico(new ProdutoEletronico(108, "HD Externo", 14, 4, "SN22233", 36));
        estoque.adicionarEletronico(new ProdutoEletronico(109, "Webcam", 20, 5, "SN44455", 18));
        estoque.adicionarEletronico(new ProdutoEletronico(110, "Roteador", 18, 4, "SN66677", 24));


        estoque.mostrarTodosProdutos();
	}
}

class Produto{
    int codigo; 
    String nome; 
    int quantidadeEstoque; 
    int estoqueMinimo; 
    public Produto(int codigo, String nome, int quantidadeEstoque, int estoqueMinimo){
        this.codigo = codigo;
        this.nome = nome;
        this.quantidadeEstoque = quantidadeEstoque;
        this.estoqueMinimo = estoqueMinimo;
    }
    //GET
    public int getCodigo(){
        return codigo;
    }
    public String getNome(){
        return nome;
    }
    public int getQuantidadeEstoque(){
        return quantidadeEstoque;
    }
    public int getEstoqueMinimo(){
        return estoqueMinimo;
    }
    //SET
    public void setCodigo(int c){
        this.codigo = c;
    }
    public void setNome(String n){
        this.nome = n;
    }
    public void setQuantidadeEstoque(int q){
        this.quantidadeEstoque = q;
    }
    public void setEstoqueMinimo(int e){
        this.estoqueMinimo = e;
    }
    
    public void entrada(int qtd){
        int valor = this.quantidadeEstoque + qtd;
        setQuantidadeEstoque(valor);
    }
    public void saida(int qtd){
        if(this.quantidadeEstoque > qtd){
            int valor = this.quantidadeEstoque - qtd;
            setQuantidadeEstoque(valor);
        }else{
            System.out.println("Estoque insuficiente para retirada.");
        }
    }
    public void registrarPerda(int qtd) {
        if (qtd > 0 && qtd <= this.quantidadeEstoque) {
            this.quantidadeEstoque -= qtd;
        }
    }
    public boolean emEstoqueMinimo() {
        return quantidadeEstoque <= estoqueMinimo;
    }
    public void mostraDados() {
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Quantidade em Estoque: " + quantidadeEstoque);
        System.out.println("Estoque Mínimo: " + estoqueMinimo);
    }
}

class ProdutoPerecivel extends Produto{
    String dataValidade;
    public ProdutoPerecivel(int codigo, String nome, int quantidadeEstoque, int estoqueMinimo, String dataValidade){
        super(codigo, nome, quantidadeEstoque, estoqueMinimo);
        this.dataValidade = dataValidade;
    }
    public String getDataValidade(){
        return dataValidade;
    }
    public void setDataValidade(String data){
        this.dataValidade = data;
    }
    @Override
    public void mostraDados() {
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Quantidade em Estoque: " + quantidadeEstoque);
        System.out.println("Estoque Mínimo: " + estoqueMinimo);
        System.out.println("Data de validade: " + dataValidade);
    }
}

class ProdutoEletronico extends Produto{
    String numeroSerie;
    int garantiaMeses;
    public ProdutoEletronico(int codigo, String nome, int quantidadeEstoque, int estoqueMinimo, String numeroSerie, int garantiaMeses){
        super(codigo, nome, quantidadeEstoque, estoqueMinimo);
        this.numeroSerie = numeroSerie;
        this.garantiaMeses = garantiaMeses;
    }
    
    public String getNumeroSerie(){
        return numeroSerie;
    }
    public void setnNumeroSerie(String n){
        this.numeroSerie = n;
    }
    
    public int getGarantiaMeses(){
        return garantiaMeses;
    }
    public void setGarantiaMeses(int g){
        this.garantiaMeses = g;
    }
    
    @Override
    public void mostraDados() {
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Quantidade em Estoque: " + quantidadeEstoque);
        System.out.println("Estoque Mínimo: " + estoqueMinimo);
        System.out.println("Número de série: " + numeroSerie);
        System.out.println("Garantia: " + garantiaMeses);
    }
}
class Estoque {
    
    private ProdutoPerecivel[] pereciveis = new ProdutoPerecivel[10];
    private ProdutoEletronico[] eletronicos  = new ProdutoEletronico[10];

    private int quantidadePerecivel = 0;
    private int quantidadeEletronico = 0;
    
    public void adicionarPerecivel(ProdutoPerecivel p){
        if (quantidadePerecivel < 10) {
            pereciveis[quantidadePerecivel] = p;
            quantidadePerecivel++;
        } else {
            System.out.println("Limite de produtos perecíveis atingido!");
        }
    }
    public void adicionarEletronico(ProdutoEletronico p){
        if (quantidadeEletronico < 10){
            eletronicos[quantidadeEletronico] = p;
            quantidadeEletronico++;
        } else {
            System.out.println("Limite de produtos eletrônicos atingido!");
        }
    }
    
    public void mostrarTodosProdutos() {
        System.out.println("=== Produtos Perecíveis ===");
        for (int i = 0; i < quantidadePerecivel; i++) {
            pereciveis[i].mostraDados();
            System.out.println("--------------------------");
        }

        System.out.println("=== Produtos Eletrônicos ===");
        for (int x = 0; x < quantidadeEletronico; x++){
            eletronicos[x].mostraDados();
            System.out.println("--------------------------");
        }
    }
}
