import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pessoa[] lista = new Pessoa[10];
        int totalCadastrados = 0;
        int opcao;

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Cadastrar Pessoa");
            System.out.println("2. Cadastrar Aluno");
            System.out.println("3. Cadastrar Aluno com Matéria");
            System.out.println("4. Exibir Todas as Pessoas");
            System.out.println("5. Exibir Todos os Alunos");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    if (totalCadastrados < 10) {
                        System.out.print("Digite o nome da Pessoa: ");
                        String nomePessoa = sc.nextLine();
                        System.out.print("Digite a idade da Pessoa: ");
                        int idadePessoa = sc.nextInt();
                        lista[totalCadastrados++] = new Pessoa(nomePessoa, idadePessoa);
                    } else {
                        System.out.println("Limite de cadastros atingido.");
                    }
                    break;

                case 2:
                    if (totalCadastrados < 10) {
                        System.out.print("Digite o nome do Aluno: ");
                        String nomeAluno = sc.nextLine();
                        System.out.print("Digite a idade do Aluno: ");
                        int idadeAluno = sc.nextInt();
                        sc.nextLine(); 
                        System.out.print("Digite a matrícula: ");
                        String matricula = sc.nextLine();
                        System.out.print("Digite a nota final: ");
                        double nota = sc.nextDouble();
                        lista[totalCadastrados++] = new Aluno(nomeAluno, idadeAluno, matricula, nota);
                    } else {
                        System.out.println("Limite de cadastros atingido.");
                    }
                    break;

                case 3:
                    if (totalCadastrados < 10) {
                        System.out.print("Digite o nome do Aluno: ");
                        String nomeAluno = sc.nextLine();
                        System.out.print("Digite a idade do Aluno: ");
                        int idadeAluno = sc.nextInt();
                        sc.nextLine(); 
                        System.out.print("Digite a matrícula: ");
                        String matricula = sc.nextLine();
                        System.out.print("Digite a nota final: ");
                        double nota = sc.nextDouble();
                        sc.nextLine(); 
                        System.out.print("Digite o nome da matéria: ");
                        String nomeMateria = sc.nextLine();
                        lista[totalCadastrados++] = new Materia(nomeMateria, nomeAluno, idadeAluno, matricula, nota);
                    } else {
                        System.out.println("Limite de cadastros atingido.");
                    }
                    break;

                case 4:
                    System.out.println("\n--- Pessoas Cadastradas ---");
                    for (int i = 0; i < totalCadastrados; i++) {
                        System.out.println("\nCadastro " + (i + 1) + ":");
                        lista[i].exibirDados();
                    }
                    break;

                case 5:
                    System.out.println("\n--- Apenas Alunos e Materias ---");
                    for (int i = 0; i < totalCadastrados; i++) {
                        if (lista[i] instanceof Aluno) {
                            System.out.println("\nAluno " + (i + 1) + ":");
                            lista[i].exibirDados();
                        }
                    }
                    break;

                case 6:
                    System.out.println("Saindo do programa...");
                    sc.close();
                    return;

                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        }
    }
}


class Pessoa {
    private String nome;
    private int idade;
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() { return nome; }
    public int getIdade() { return idade; }

    public void setNome(String nome) { this.nome = nome; }
    public void setIdade(int idade) { this.idade = idade; }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}


class Aluno extends Pessoa {
    private String matricula;
    private double notaFinal;

    public Aluno(String nome, int idade, String matricula, double notaFinal) {
        super(nome, idade);
        this.matricula = matricula;
        this.notaFinal = notaFinal;
    }

    public double getNotaFinal() { return notaFinal; }

    @Override //O @Override é uma anotação (annotation) em Java que serve para indicar que um método em uma subclasse está sobrescrevendo (ou sobrepondo) um método de sua superclasse.
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nota Final: " + notaFinal);
    }
}

class Materia extends Aluno {
    private String nomeMateria;

    public Materia(String nomeMateria, String nome, int idade, String matricula, double notaFinal) {
        super(nome, idade, matricula, notaFinal);
        this.nomeMateria = nomeMateria;
    }

    @Override
    //Sobrescrever um método é quando uma subclasse cria sua própria versão de um método que já existe na superclasse.
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Matéria: " + nomeMateria);
    }
}
