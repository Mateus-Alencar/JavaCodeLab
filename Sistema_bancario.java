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


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<ContaBancaria> contas = new ArrayList<>();
        
        // Contas iniciais
        contas.add(new ContaBancaria("João", 10250.00f, 1232));
        contas.add(new ContaBancaria("Paulo", 45460.00f, 7428));
        contas.add(new ContaBancaria("Sergio", 750200.00f, 6472));
        
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
            
            System.out.print("Escolha uma opção: ");
            op = input.nextInt();
            
            switch (op) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = input.next();
                    System.out.print("Valor: ");
                    float valor = input.nextFloat();
                    System.out.print("Número da conta: ");
                    int num_conta = input.nextInt();
                    contas.add(new ContaBancaria(nome, valor, num_conta));
                    System.out.println("Conta criada com sucesso!");
                    break;
                case 2:
                    for (ContaBancaria conta : contas) {
                        conta.usuario();
                    }
                    break;
                case 3:
                    System.out.print("Número da conta para saque: ");
                    int contaSaque = input.nextInt();
                    System.out.print("Valor a sacar: ");
                    float valorSaque = input.nextFloat();
                    for (ContaBancaria conta : contas) {
                        if (conta.getNumeroConta() == contaSaque) {
                            conta.sacar(valorSaque);
                        }
                    }
                    break;
                case 4:
                    System.out.print("Número da conta para depósito: ");
                    int contaDeposito = input.nextInt();
                    System.out.print("Valor a depositar: ");
                    float valorDeposito = input.nextFloat();
                    for (ContaBancaria conta : contas) {
                        if (conta.getNumeroConta() == contaDeposito) {
                            conta.depositar(valorDeposito);
                        }
                    }
                    break;
                case 5:
                    System.out.print("Número da conta remetente: ");
                    int contaRemetente = input.nextInt();
                    System.out.print("Número da conta destinatária: ");
                    int contaDestinataria = input.nextInt();
                    System.out.print("Valor a transferir: ");
                    float valorTransferencia = input.nextFloat();
                    ContaBancaria remetente = null, destinatario = null;
                    for (ContaBancaria conta : contas) {
                        if (conta.getNumeroConta() == contaRemetente) {
                            remetente = conta;
                        }
                        if (conta.getNumeroConta() == contaDestinataria) {
                            destinatario = conta;
                        }
                    }
                    if (remetente != null && destinatario != null) {
                        remetente.transferencia(valorTransferencia, destinatario);
                    } else {
                        System.out.println("Conta não encontrada!");
                    }
                    break;
                case 6:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção Inválida!");
            }
        } while (op != 6);
        input.close();
    }
}

class ContaBancaria {
    private String titular;
    private Float saldo;
    private int numero_conta;

    public ContaBancaria(String titular, Float saldo, int numero_conta) {
        this.titular = titular;
        this.saldo = saldo;
        this.numero_conta = numero_conta;
    }
    
    public int getNumeroConta() {
        return numero_conta;
    }
    
    public void usuario() {
        System.out.println("Usuário: " + this.titular + " ###### Saldo: R$" + this.saldo + " ###### Número da conta: " + this.numero_conta);
    }
    
    public void depositar(float valor) {
        this.saldo += valor;
        System.out.println("Depósito realizado com sucesso!");
    }
    
    public void sacar(float valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
    
    public void transferencia(float valor, ContaBancaria destinatario) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            destinatario.depositar(valor);
            System.out.println("Transferência realizada com sucesso!");
        } else {
            System.out.println("Saldo insuficiente para transferência!");
        }
    }
}

