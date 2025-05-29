import java.util.*;
public class Carrinho {
    private int idCarrinho;
    private Cliente cliente;
    private String data;
    private String situacao;
    private ArrayList<ItemCarrinho> itens = new ArrayList<>();
    private static int sequencia;
    
    public Carrinho(Cliente cliente, String data){
        sequencia++;
        idCarrinho=sequencia;
        this.cliente = cliente;
        this.data = data;
        situacao="Aberto";
    }

    public int getIdCarinho() {
        return idCarrinho;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String getData() {
        return data;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    public boolean fechaCarrinho(){
        if (situacao.equalsIgnoreCase("Aberto")){
            situacao="Fechado";
            System.out.print("O carrinho foi fechado.");
            return true;
        } else {
            System.out.print("O carrinho já estava fechado anteriormente.");
            return false;
        }
    }
    public void adicionarItem(Produto p, double quantidade, double preco){
        ItemCarrinho ic;
        if (situacao.equalsIgnoreCase("Fechada")){
            System.out.print("Não é possível adicionar itens no carrinho.");
            return;
        } 
        if (existeProduto(p.getIdProduto())){
            System.out.print("Produto já anteriormente incluído no carrinho");
            return;
        }
        ic = new ItemCarrinho(p, quantidade, preco);
        itens.add(ic);
        cliente.setDebito(cliente.getDebito()+p.getPreco()*quantidade);
        System.out.print("Item incluído no carrinho!");
    }
    public boolean existeProduto(int id){
        for (ItemCarrinho ic: itens){
            if(ic.getProduto().getIdProduto()==id){
                return true;
            }
        }
        return false;
    }
    // Método para percorrer a ArrayList e mostrar o seu conteúdo
    public void mostrarCarrinho (){
        for (ItemCarrinho l : itens){
            System.out.print(l);
        }
    }
    public double mostrarValorTotal(){
        double contador = 0;
        for (ItemCarrinho ic: itens){
            contador =contador + ic.getQuantidade() * ic.getPreco();
        }
        return contador;
    }
    
    //Método para mostrar o pedido
    public void mostraDadosCarrinho(){
        System.out.println("Id Pedido: "+ idCarrinho);
        System.out.println("Cliente: "+ cliente);
        System.out.println("Data: "+data);
        System.out.println("Situação: "+ situacao);
        System.out.println("Total carrinho: " + mostrarValorTotal());
    }
    public int obtemPosicaoItem(int id){
        for (int i = 0; i<itens.size();++i){
            if(itens.get(i).getProduto().getIdProduto()==id){
                return i;
            }
        }
        return -1;
    }
    //Criar um metodo para alterar a quantidade de um produto no carrinho
    public void alterarQuantProd(int id, double quant, boolean tipo){
        // o tipo se for true, acrescenta a quantidade do item
        // se o tipo for false, decrementa a quantidade do item
        int pos;
        pos = obtemPosicaoItem(id);
        if(pos==-1){
            System.out.print("O id informado não foi encontrado");
            return;
        }
        if(tipo){
            //Adicionando
            itens.get(pos).setQuantidade(itens.get(pos).getQuantidade()+quant);
            cliente.setDebito(cliente.getDebito()+itens.get(pos).getPreco()*quant);
        }else{
            //Retirando
            if(quant>itens.get(pos).getQuantidade()){
                System.out.println("Quantidade a ser retirada é mairo que a quantidade incluida");
                return;
            }
            itens.get(pos).setQuantidade(itens.get(pos).getQuantidade()- quant);
            cliente.setDebito(cliente.getDebito()-itens.get(pos).getPreco()*quant);
            if(itens.get(pos).getQuantidade()==0){
                itens.remove(pos);
                System.out.println("Item removido do carrinho");
            }
        }
    }
}
