import java.util.List;

public class Proprietario extends Pessoa {
    public Proprietario(String nome, String CPF, String endereco){
        super(nome, CPF, endereco);
    }
    
    Imovel[] imoveis = new Imovel[30];
    
    public int contador = 0;
    public void adicionaImovel(Imovel imovel) {
        if (contador < imoveis.length) {
            boolean idExiste = false;  

            for (int i = 0; i < contador; i++) {
                if (imoveis[i] != null && imoveis[i].getIdImovel() == imovel.getIdImovel()) {
                    idExiste = true;  
                    break;
                }
            }
            if (idExiste) {
                System.out.println("Já existe um imóvel com o ID " + imovel.getIdImovel() + ". Imóvel não adicionado.");
            } else {
                imoveis[contador++] = imovel;
                System.out.println("Imóvel adicionado na posição " + (contador - 1));
            }
        } else {
            System.out.println("Não há mais espaço para adicionar imóveis.");
        }
    }
    public void retirarImovel(int id){
        for(int x = 0; x < imoveis.length; x++){
            if (imoveis[x].getIdImovel() == id){
                imoveis[x] = null;
                break;
            } else {
                System.out.println("Id não encontrado.");
                break;
            }
        }
    }
    public void buscarImovel(int id){
        for(int x = 0; x < imoveis.length; x++){
            if (imoveis[x].getIdImovel() == id){
                System.out.println("Imovel encontrado: " + imoveis[x]);
            } else {
                System.out.println("Imovel não encontrado");
            }
        }
    }

    public void listarImoveis() {
    for (int x = 0; x < imoveis.length; x++) {
        if (imoveis[x] != null) {
            mostrarDados(imoveis[x]);
        }
    }
}
    public void mostrarDados(Imovel imovel) {
        System.out.println("Imóvel encontrado:");
        System.out.println("ID: " + imovel.getIdImovel());
        System.out.println("Endereço: " + imovel.getEndereco());
        System.out.println("Valor Base Locação: R$" + imovel.getValorBaseLocacao());
        System.out.println("Valor Base Venda: R$" + imovel.getValorBaseVenda());
        System.out.println("Valor IPTU: R$" + imovel.getValorIPTU());
    }
}
