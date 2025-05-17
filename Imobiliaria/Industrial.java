public class Industrial extends Imovel{
    public Industrial(String endereco, double valorBase, double valorIPTU){
        super(endereco, valorBase, valorIPTU);
    }
    @Override
    public double calcularTaxaAdministracao(){
        return getValorBase() * 0.5;
    }
}
