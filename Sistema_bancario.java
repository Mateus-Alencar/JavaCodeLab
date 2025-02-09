//Exercício: Sistema de Controle de Contas Bancárias

//Crie um sistema bancário simples em Java que permita criar contas bancárias, depositar dinheiro, 
//sacar dinheiro e transferir entre contas.

//Requisitos
//Criar uma classe ContaBancaria com os seguintes atributos:

//titular (nome do titular da conta)
//saldo (saldo da conta, inicia com 0)
//numero_conta (um identificador único para a conta)

//Métodos da classe ContaBancaria:

//depositar(valor): adiciona um valor ao saldo.
//sacar(valor): subtrai um valor do saldo, caso tenha saldo suficiente.
//transferir(valor, destino): transfere um valor para outra conta.


import java.util.Scanner;


public class Main{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    ContaBancaria  ContaBancaria1 = new ContaBancaria("João", 10250.00f, 1232);
    ContaBancaria  ContaBancaria2 = new ContaBancaria("Paulo", 45460.00f, 7428);
    ContaBancaria  ContaBancaria3 = new ContaBancaria("Sergio", 750200.00f, 6472);
    
    ContaBancaria1.usuario();
    ContaBancaria2.usuario();
    ContaBancaria3.usuario();
    
    int op;
    do {
      System.out.println("""
    
      ----- Menu de Opções -----
    
      1 - Criar conta bancária 
      2 - Consultar Conta
      3 - Sacar
      4 - Depositar
      5 - Transferir
      6 - Sair
      """);
    
      System.out.print("Escolha uma opção:");
      op = input.nextInt();
      
      switch(op){
        case 1:
            System.out.print("Nome: ");
            String nome = input.next();
            System.out.print("Valor:");
            float valor = input.nextInt();
            System.out.print("Número da conta:");
            int num_conta = input.nextInt();
            ContaBancaria ContaBancaria = new ContaBancaria(nome, valor, num_conta);
            break;
            
        case 2:
          ContaBancaria1.usuario();
          break;
        case 3:
            break;
        case 4:
            break;
        case 5:
            break;
        case 6:
          System.out.println("Saindo do sistema...");
          break;
          
        default:
          System.out.println("Opção Inválida!");
          
      }
    } while (op != 6);
    
    input.close();
    ContaBancaria1.usuario();
    
  }
}

class ContaBancaria{
  // Atributos (variáveis de instância)
    private String titular;
    private Float saldo;
    private int numero_conta;

    // Construtor
    public ContaBancaria(String titular, Float saldo, int numero_conta) {
        this.titular = titular;
        this.saldo = saldo;
        this.numero_conta = numero_conta;
    }
    
    public void usuario(){
      System.out.println("Usuário: " + this.titular + " ###### Saldo: R$"+ this.saldo +" ###### Número da conta: "+ this.numero_conta);
    }
    
    public void depositar(float valor){
      this.saldo += valor;
    }
    public void sacar(float valor){
      this.saldo -= valor;
    }
    public void transferencia(float valor, String remetente, String destinatario){
      this.saldo -= valor;
    }
    
}
