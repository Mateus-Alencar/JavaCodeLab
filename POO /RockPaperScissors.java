import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            exibir_menu();
            int escolha_jogador = obter_escolha_jogardor(scanner);
            
            if (escolha_jogador == 0){
                System.out.println("Obrigado por jogar! Até a próxima!");
                break;
            }
            
            int escolha_computador = obter_escolha_computador();
            exibir_escolhas(escolha_jogador, escolha_computador);
            determinar_vencedor(escolha_jogador, escolha_computador);
        }
        scanner.close();
        
    }
    public static void exibir_menu(){
        System.out.println("\nEscolha uma opção: ");
        System.out.println("1 - Pedra");
        System.out.println("2 - Papel");
        System.out.println("3 - Tesoura");
        System.out.println("0 - Sair");
    }
    public static int obter_escolha_jogardor(Scanner scanner) {
        System.out.print("Sua escolha: ");
        return scanner.nextInt();
    }
    public static int obter_escolha_computador(){
        Random random =  new Random();
        return random.nextInt(3) + 1;
    }
    public static void exibir_escolhas(int j,int c){
        System.out.println("Você escolheu: " + converter_Escolha(j));
        System.out.println("O computador escolheu: " + converter_Escolha(c));
    }
    public static String converter_Escolha(int escolha){
        switch(escolha){
            case 1: return "Pedra";
            case 2: return "Papel";
            case 3: return "Tesoura";
            default: return "Escolha Inválida";
        }
    }
    public static void determinar_vencedor(int j, int c){
        if (j == c){
            System.out.println("Empate");
        }else if(
                 (j == 1 && c == 3) ||
                 (j == 2 && c == 1) ||
                 (j == 3 && c == 2) 
                 ){
            System.out.println("Você venceu!!!");
        }else{
            System.out.println("Você perdeu!!!");
        }
    }
}
