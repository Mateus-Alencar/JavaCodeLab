
public class main {
    public static void main(String[] args) {
        viagem SaoPaulo = new viagem("Franca", "São Paulo", 530.3, 6.4);
        SaoPaulo.mostrarDetalhes();
        SaoPaulo.setDestino("Brasilia");
        System.out.println(SaoPaulo.getDestino());
    }
}
