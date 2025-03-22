import java.util.HashMap;
import java.util.Map;

class SysHotel {
    private final Map<Integer, String> reservas = new HashMap<>();
    /*
    A chave (Integer) representa o número do quarto.
    O valor (String) representa o nome do hóspede que reservou o quarto.
    */
    
    private int TOTAL_QUARTOS = 10;
    
    public void reservarQuarto(String nome){
        for(int i = 1; i <= TOTAL_QUARTOS; i++){
            // O método containsKey() em Java é usado para verificar se um Map contém uma chave específica.
            if(!reservas.containsKey(i)){ // Verifica se o quarto está disponível
                reservas.put(i, nome);
                System.out.println("✅ Quarto " + i + " reservado para " + nome);
                return;
            }
        }
        System.out.println("❌ Todos os quartos estão ocupados!");
    }
    public void cancelarReserva(String nome) {
        for (Map.Entry<Integer, String> entry : reservas.entrySet()) { // Percore todas as entradas (chave e valor) do Map reservas.
            if (entry.getValue().equalsIgnoreCase(nome)) { // equalsIgnoreCase --> ignora a diferença maiúscula e minúsculas.
                reservas.remove(entry.getKey());
                System.out.println("✅ Reserva de " + nome + " cancelada.");
                return;
            }
        }
        System.out.println("❌ Nenhuma reserva encontrada para " + nome);
    }

    public void listarQuartos() {
        System.out.println("\n=== Status dos Quartos ===");
        System.out.print("Quartos disponíveis: ");
        boolean temDisponivel = false;
        for (int i = 1; i <= TOTAL_QUARTOS; i++) {
            if (!reservas.containsKey(i)) {
                System.out.print(i + " ");
                temDisponivel = true;
            }
        }
        if (!temDisponivel) System.out.print("Nenhum");

        System.out.print("\nQuartos ocupados: ");
        if (reservas.isEmpty()) {
            System.out.println("Nenhum");
        } else {
            for (Map.Entry<Integer, String> entry : reservas.entrySet()) {
                System.out.print(entry.getKey() + " (" + entry.getValue() + ") ");
            }
        }
        System.out.println("\n");
    }
    public void buscarReserva(String nome) {
        for (Map.Entry<Integer, String> entry : reservas.entrySet()) {
            if (entry.getValue().equalsIgnoreCase(nome)) {
                System.out.println("🔍 " + nome + " está no quarto " + entry.getKey());
                return;
            }
        }
        System.out.println("❌ Nenhuma reserva encontrada para " + nome);
    }
        
}
