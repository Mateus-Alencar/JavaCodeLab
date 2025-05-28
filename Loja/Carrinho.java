import java.util.*;
public class Carrinho {
    private int idCarinho;
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
        return idCarinho;
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
}
