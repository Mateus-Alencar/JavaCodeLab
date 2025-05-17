import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1; // Gera um número entre 1 e 100
        Scanner scanner = new Scanner(System.in);
        int tentativa;
        int tentativas = 0;

        System.out.println("Tente adivinhar o número secreto entre 1 e 100!");

        do {
            System.out.print("Digite um número: ");
            tentativa = scanner.nextInt();
            tentativas++;
            if (tentativa == numeroSecreto){
                break;
            }
            if (tentativa > numeroSecreto){
                System.out.println("O número secreto é menor");
            }
            if (tentativa < numeroSecreto){
                System.out.println("O número secreto é maior");
            }

        } while (true); 
        System.out.println("Você acertou o número secreto!!!");
    }
}
