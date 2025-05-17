import java.util.*;

public class Imobiliaria {
    private List<Imovel> imoveis = new ArrayList<>();
    private List<Contrato> contratos = new ArrayList<>();
    private List<Corretor> corretores = new ArrayList<>();
    private List<Proprietario> locadores = new ArrayList<>();
    private List<Locatario> locatarios = new ArrayList<>();
    private List<Locatario> devedores = new ArrayList<>();
    private double totalRecebido = 0;

    public void registrarDevedor(Locatario locatario) {
        if (!devedores.contains(locatario)) {
            devedores.add(locatario);
            locatario.marcarComoDevedor();
        }
    }

    public void enviarRelatorioReceitaFederal() {
        System.out.println("Relatório enviado à Receita Federal.");
    }
}
