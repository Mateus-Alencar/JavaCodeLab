import java.util.*;

//Uma classe abstrata é uma classe que não pode ser instanciada diretamente, não pode criar objetos dela, ela serve como modelo base para outras classes.
abstract class Imovel {
    private String endereco;
    private double valorBase;
    private double valorIPTU;
    private List<ParticipacaoProprietario> proprietarios = new ArrayList<>();

    public Imovel(String endereco, double valorBase, double valorIPTU) {
        this.endereco = endereco;
        this.valorBase = valorBase;
        this.valorIPTU = valorIPTU;
    }
    public double getValorBase() {
        return valorBase;
    }
    public double getValorIPTU() {
        return valorIPTU;
    }
    public String getEndereco() {
        return endereco;
    }

    public void adicionarProprietario(Proprietario proprietario, double percentual) {
        proprietarios.add(new ParticipacaoProprietario(proprietario, percentual));
        proprietario.adicionarImovel(this);
    }

    public List<ParticipacaoProprietario> getProprietarios() {
        return proprietarios;
    }

    public abstract double calcularTaxaAdministracao();
}
