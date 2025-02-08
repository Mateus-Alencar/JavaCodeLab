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

//Criar uma classe Banco que gerencia múltiplas contas:

//Deve conter uma lista de contas.
//Deve permitir criar novas contas.
//Deve permitir buscar contas pelo número.
//Desafio extra
//Criar uma classe ContaPoupanca que herda de ContaBancaria e adiciona um método rendimento(taxa), que aumenta o saldo 
//conforme a taxa informada.
//Criar uma classe ContaCorrente que herda de ContaBancaria e permite um limite de cheque especial.

public class Main{
  public static void main(String[] args){
    
    ContaBancaria  ContaBancaria1 = new ContaBancaria("João", 10450.00, 1232);
    ContaBancaria  ContaBancaria2 = new ContaBancaria("Paulo", 43460.00, 7428);
    ContaBancaria  ContaBancaria3 = new ContaBancaria("Sergio", 756443.00, 6472);
    
  }
}

public class ContaBancaria{
  // Atributos (variáveis de instância)
    private String titular;
    private Float saldo;
    private int numero_conta;

    // Construtor
    public ContaBancaria(String titular, String saldo, int numero_conta) {
        this.titular = titular;
        this.saldo = saldo;
        this.numero_conta = numero_conta;
    }
    
    public void depositar(float valor){
      this.saldo += valor;
    }
    public void sacar(float valor){
      this.saldo -= valor;
    }
    public void transferencia(float valor){
      this.saldo -= valor;
    }
    
}
