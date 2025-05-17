/*
✅ Classe Hotel

Gerencia as reservas usando um HashMap<Integer, String>.

Métodos:

reservarQuarto(String nome) → Reserva o primeiro quarto disponível.

cancelarReserva(String nome) → Cancela a reserva de um hóspede.

listarQuartos() → Lista os quartos disponíveis e ocupados.

buscarReserva(String nome) → Busca o quarto de um hóspede.

✅ Classe SistemaHotel

Controla o menu e as interações do usuário.

Utiliza um loop while para manter o sistema rodando.
*/

package hospedagem;
import java.util.Scanner;

 class Hospedagem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SysHotel hotel = new SysHotel();

        while (true) {
            System.out.println("\n=== SISTEMA DE RESERVAS DO HOTEL ===");
            System.out.println("1 - Reservar um quarto");
            System.out.println("2 - Cancelar reserva");
            System.out.println("3 - Listar quartos");
            System.out.println("4 - Buscar reserva pelo nome");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");

            int opcao;
            try {
                opcao = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("❌ Entrada inválida! Digite um número.");
                continue;
            }

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do hóspede: ");
                    String nomeReserva = scanner.nextLine();
                    hotel.reservarQuarto(nomeReserva);
                    break;
                case 2:
                    System.out.print("Digite o nome do hóspede para cancelar: ");
                    String nomeCancelamento = scanner.nextLine();
                    hotel.cancelarReserva(nomeCancelamento);
                    break;
                case 3:
                    hotel.listarQuartos();
                    break;
                case 4:
                    System.out.print("Digite o nome do hóspede para buscar: ");
                    String nomeBusca = scanner.nextLine();
                    hotel.buscarReserva(nomeBusca);
                    break;
                case 5:
                    System.out.println("🏨 Sistema encerrado. Obrigado!");
                    scanner.close();
                    return;
                default:
                    System.out.println("❌ Opção inválida! Escolha entre 1 e 5.");
            }
        }
        
    }
    
}
