import java.util.*;

public class ContratoLocacao extends Contrato {
    private Locatario locatario;
    private List<ParticipacaoProprietario> proprietarios;
    private double multaPorAtraso;
    private boolean emAtraso;

    public ContratoLocacao(Imovel imovel, Locatario locatario, List<ParticipacaoProprietario> proprietarios, String dataInicio, double valorPrincipal, double multaPorAtraso) {
        super(imovel, dataInicio, valorPrincipal);
        this.locatario = locatario;
        this.proprietarios = proprietarios;
        this.multaPorAtraso = multaPorAtraso;
    }

    @Override
    public double calcularEncargosMensais() {
        double total = valorPrincipal + getImovel().getValorIPTU();
        if (emAtraso) {
            total += multaPorAtraso;
        }
        return total;
    }

    public void repassarAluguel() {
        double total = valorPrincipal;
        for (ParticipacaoProprietario pp : proprietarios) {
            double valor = total * pp.getPercentual();
            System.out.println("Repassado R$" + valor + " para " + pp.getProprietario().getNome());
        }
    }

    public void marcarAtraso(Imobiliaria imobiliaria) {
        this.emAtraso = true;
        imobiliaria.registrarDevedor(locatario);
    }

    public void encerrarContrato(boolean houveDanos) {
        System.out.println(houveDanos ? "Reparos exigidos." : "Vistoria aprovada.");
    }
}
