public class Residencial extends Imovel {
    public Residencial(String endereco, double valorBase, double valorIPTU){
        super(endereco, valorBase, valorIPTU);
    }

    @Override
    public double calcularTaxaAdministracao(){
        return getValorBase() * 0.1;
    }
}
