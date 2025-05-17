public class Comercial extends Imovel {
    public Comercial(String endereco, double valorBase, double valorIPTU){
        super(endereco, valorBase, valorIPTU);
    }
    @Override
    public double calcularTaxaAdministracao(){
        return getValorBase() * 0.2;
    }
}
