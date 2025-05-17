public class ParticipacaoProprietario {
    private Proprietario proprietario;
    private double percentual; // Ex: 0.5 = 50%

    public ParticipacaoProprietario(Proprietario proprietario, double percentual) {
        this.proprietario = proprietario;
        this.percentual = percentual;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public double getPercentual() {
        return percentual;
    }
}
