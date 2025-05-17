public class Misto extends Imovel{
    public Misto(String endereco, double valorBase, double valorIPTU){
        super(endereco, valorBase, valorIPTU);
    }
    @Override
    public double calcularTaxaAdministracao(){
        return getValorBase() * 0.3;
    }
}
