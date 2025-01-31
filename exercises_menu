import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int op;

        // Loop do menu
        do {
            // Exibição do menu
            System.out.println("----------- Menu ----------------");
            System.out.println("1 - Mostrar números pares até 100");
            System.out.println("2 - Mostrar números pares e ímpares até um número determinado");
            System.out.println("3 - Calcular a média das notas de uma turma");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            op = ent.nextInt(); // Captura a opção do usuário
            System.out.println("-------------------------------------------------------------");

            // Opção 1 - Mostrar números pares até 100
            if (op == 1) {
                System.out.println("Números pares até 100:");
                for (int x = 1; x <= 100; x++) {
                    if (x % 2 == 0) {
                        System.out.println(x);
                    }
                }
            }

            // Opção 2 - Mostrar números pares e ímpares até um número informado pelo usuário
            if (op == 2) {
                System.out.println("Números pares e ímpares até um número determinado.");
                System.out.print("Digite um número: ");
                int num = ent.nextInt();

                System.out.println("Números pares   |   Números ímpares");
                System.out.println("----------------|----------------");

                // Percorre os números de 1 até o número informado
                for (int c = 1; c <= num; c++) {
                    if (c % 2 == 0) {
                        System.out.print(c + "          ");
                    } else {
                        System.out.println("    |    " + c);
                    }
                }
                System.out.println(); // Pula uma linha para melhor exibição
            }

            // Opção 3 - Calcular a média das notas de uma turma
            if (op == 3) {
                System.out.println("Cálculo da média das notas de uma turma");
                
                int quantAlunos;
                float nota, soma = 0, media;

                // Solicita a quantidade de alunos
                System.out.print("Digite a quantidade de alunos: ");
                quantAlunos = ent.nextInt();

                // Coleta as notas dos alunos
                for (int i = 1; i <= quantAlunos; i++) {
                    System.out.print("Digite a nota do aluno " + i + ": ");
                    nota = ent.nextFloat();
                    soma += nota; // Soma das notas
                }

                // Calcula a média
                media = soma / quantAlunos;
                System.out.println("A média da turma é: " + media);
            }

        } while (op < 4); // Continua o loop até o usuário escolher sair

        System.out.println("Obrigado por usar o sistema!");

        // Fechando o Scanner para evitar vazamento de recursos
        ent.close();
    }
}
