import java.util.*;
public class Proprietario {
    private String nome;
    private List<Imovel> imoveis = new ArrayList<>();

    public Proprietario(String nome) {
        this.nome = nome;
    }

    public void adicionarImovel(Imovel imovel) {
        imoveis.add(imovel);
    }

    public List<Imovel> getImoveis() {
        return imoveis;
    }

    public String getNome() {
        return nome;
    }
}
