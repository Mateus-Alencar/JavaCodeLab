
// Array
/*******************************************************************************
* 1) Fazer um programa para armazenar em um Array, vários números inteiros e
* positivos e calcular a média. Imprimir também o maior. A quantidade de números
* lidos será definida pelo usuário.
*******************************************************************************/
import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
	    System.out.println("Array");
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite a quantidade de números: ");
		int quantidade = entrada.nextInt();
		double media=0;
		int[] numeros = new int[quantidade];
		for(int x=0;x<quantidade;x++){
			System.out.print("Digite o valor "+(x+1)+": ");
			numeros[x]=entrada.nextInt();
			media += numeros[x];
		}
		media = media/quantidade;
		Arrays.sort(numeros); // sort() --> método interno usado para classificar elementos em uma lista em ordem crescente

		System.out.println("A média dos valores é: "+media+"\nO maior valor é: "+numeros[quantidade-1]);
		ExemploVetores ExV = new ExemploVetores();
		ExV.Vetor();
	}
}


// Vetores
/*******************************************************************************
* são estruturas de dados lineares que armazenam uma sequência de elementos de um único tipo de dado,
* com cada elemento acessível por meio de um índice. O tamanho do vetor é fixo no momento de sua criação 
* e a alocação de memória é contínua, ou seja, os elementos são armazenados de forma sequencial na memória.
*******************************************************************************/
class ExemploVetores {
    public static void Vetor() {
        System.out.println("Vetor");
        int[] vetor = {10, 20, 30, 40, 50};

        System.out.println("Primeiro valor: " + vetor[0]);  // Saída: 10
        vetor[2] = 35; 
        System.out.println("Novo valor na posição 2: " + vetor[2]);  // Saída: 35

        System.out.println("Elementos do vetor:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }

        System.out.println("\nUsando for-each para exibir elementos:");
        for (int valor : vetor) {
            System.out.println(valor);
        }

        // Tamanho do vetor
        System.out.println("\nTamanho do vetor: " + vetor.length);
        
        int [] vetor2 = new int[5];
        vetor2[2] = 10;
        System.out.println(vetor2);
        for (int x = 0; x < vetor2.length; x++){
            System.out.print(vetor2[x] + " - ");
        }
    }
}
