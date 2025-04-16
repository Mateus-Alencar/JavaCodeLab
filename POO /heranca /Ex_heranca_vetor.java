public class Main {
    public static void main(String[] args) {
        Pessoa[] lista = new Pessoa[10];

        lista[0] = new Pessoa("João", 30);
        lista[1] = new Pessoa("Maria", 25);
        lista[2] = new Pessoa("Carlos", 40);
        lista[3] = new Pessoa("Ana", 22);
        lista[4] = new Pessoa("Pedro", 35);

        lista[5] = new Aluno("Lucas", 20, "A001", 8.5);
        lista[6] = new Aluno("Juliana", 19, "A002", 9.0);
        lista[7] = new Aluno("Bruna", 21, "A003", 7.8);
        lista[8] = new Aluno("Rafael", 23, "A004", 6.5);
        lista[9] = new Aluno("Fernanda", 20, "A005", 10.0);
        

        for (int i = 0; i < lista.length; i++) {
            System.out.println("\n--- Pessoa " + (i + 1) + " ---");
            lista[i].exibirDados();
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

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void exibirDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
    }
}

class Aluno extends Pessoa{
    private String matricula;
    private double notaFinal;
    
    public Aluno(String nome, int idade, String matricula, double notaFinal){
        super(nome, idade);
        this.matricula = matricula;
        this.notaFinal = notaFinal;
    }
    @Override
    public void exibirDados(){
        super.exibirDados();
        System.out.println("Matriculo: "+ matricula);
        System.out.println("Nota Final: "+ notaFinal);
    }
}



