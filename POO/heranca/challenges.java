///EX1
/*
Crie um programa que leia dois vetores de 5 posições com números inteiros. Em seguida, 
crie um terceiro vetor que contenha a soma dos elementos dos dois vetores.
*/

//EX2
/*
Crie uma classe Pessoa com nome e idade. Depois, crie uma classe Aluno que herda 
de Pessoa e inclui um atributo curso. Faça um método exibirDados() nas duas classes.
*/
//EX3
/*
Crie uma classe chamada Util com um método maiorValor(int[] vetor) 
que retorna o maior número de um vetor.
*/
//EX4
/*
Crie uma classe Funcionario com nome e salário. Crie uma classe Gerente que herda 
de Funcionario e tem um bônus. Crie um vetor de funcionários e mostre os dados de todos.
*/

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    //EX1
	    SomaVetor somaV = new SomaVetor();
        int somaTotal = somaV.soma();
        System.out.println("A soma de todos os elementos é: " + somaTotal);
	    //EX2
	    Aluno aluno = new Aluno("Mateus", 19, "Ciência da computação");
	    aluno.exibirDados();
	    //EX3
	    int[] numeros = {1,2,4,3,4,66,223,3,5,7,4};
	    int maior = Util.maiorValor(numeros);
	    System.out.println(maior);
	    Funcionario[] funcionários = new Funcionario[3];
	    
	    funcionarios[0] = new Funcionario("Ana", 2500f);
        funcionarios[1] = new Gerente("Carlos", 4000f, 1000f);
        funcionarios[2] = new Funcionario("Bruno", 2800f);
        for(int x = 0; x < 3; x++){
            System.out.println(funcionarios[x].toString());
        }
	}
}
//EX1
class SomaVetor{
    public int soma(){
        Scanner sc = new Scanner(System.in);
        int[] vetorA = new int[5];
        int[] vetorB = new int[5];
        int[] vetorSoma = new int[10]; 

        System.out.println("Digite 5 números para o vetor A:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Nº " + (i + 1) + ": ");
            vetorA[i] = sc.nextInt();
        }

        System.out.println("Digite 5 números para o vetor B:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Nº " + (i + 1) + ": ");
            vetorB[i] = sc.nextInt();
        }

        for (int x = 0; x < 5; x++) {
            vetorSoma[x] = vetorA[x];
        }

        int y = 0;
        for (int x = 5; x < 10; x++) {
            vetorSoma[x] = vetorB[y];
            y++;
        }

        int contadorSoma = 0;
        for (int z = 0; z < 10; z++) {
            contadorSoma += vetorSoma[z];
        }

        sc.close();
        return contadorSoma;
    }
}


//EX2

class Pessoa{
    private String nome;
    private int idade;
    
    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    
    public void exibirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}
class Aluno extends Pessoa{
    private String curso;
    
    public Aluno(String nome, int idade, String curso){
        super(nome, idade);
        this.curso = curso;
    }
    @Override
    public void exibirDados(){
        super.exibirDados();
        System.out.println("Curso: "+ curso);
    }
}

//EX3

class Util{
    public static int maiorValor(int[] vetor){
        int maior = vetor[0];
        for(int x = 0; x < vetor.length; x++){
            if(maior < vetor[x]){
                maior = vetor[x];
            }
        }
        return maior;
    }
}

//EX4
class Funcionario {
    private String nome;
    private Float salario;

    public Funcionario(String nome, Float salario) {
        this.nome = nome;
        this.salario = salario;
    }
    public String getNome() {
        return nome;
    }
    public Float getSalario() {
        return salario;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSalario(Float salario) {
        this.salario = salario;
    }
    public String toString() {
        return "Nome: " + nome + ", Salário: R$ " + salario;
    }
}

class Gerente extends Funcionario {
    private Float bonus;

    public Gerente(String nome, Float salario, Float bonus) {
        super(nome, salario);
        this.bonus = bonus;
    }
    public Float getBonus() {
        return bonus;
    }
    public void setBonus(Float bonus) {
        this.bonus = bonus;
    }
    @Override
    public String toString() {
        return super.toString() + ", Bônus: R$ " + bonus;
    }
}
