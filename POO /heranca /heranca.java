class Pessoa {
    private String nome;
    private String endereco;
    private String telefone;

    public Pessoa(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public String getTelefone() {
        return telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}

class Fornecedor extends Pessoa {
    private double valorCredito;
    private double valorDivida;

    public Fornecedor(double valorCredito, double valorDivida, String nome, String endereco, String telefone) {
        super(nome, endereco, telefone); // Chama o método construtor da super classe.
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }

    public double getValorCredito() {
        return valorCredito;
    }
    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }
    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    public double obterSaldo() {
        return valorCredito - valorDivida;
    }
}

class Empregado extends Fornecedor {
    private int codigoSetor;
    private double salarioBase;
    private double percentualImposto;

    public Empregado(int codigoSetor, double salarioBase, double percentualImposto, double valorCredito, double valorDivida, String nome, String endereco, String telefone) {
        super(valorCredito, valorDivida, nome, endereco, telefone);
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.percentualImposto = percentualImposto;
    }

    public int getCodigoSetor() {
        return codigoSetor;
    }
    public double getSalarioBase() {
        return salarioBase;
    }
    public double getPercentualImposto() {
        return percentualImposto;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setPercentualImposto(double percentualImposto) {
        this.percentualImposto = percentualImposto;
    }

    public double calcularSalarioLiquido() {
        return salarioBase - (salarioBase * percentualImposto / 100);
    }
}

class Administradora extends Empregado {
    private double ajudaDeCusto;

    public Administradora(int codigoSetor, double salarioBase, double percentualImposto, double valorCredito, double valorDivida, String nome, String endereco, String telefone, double ajudaDeCusto) {
        super(codigoSetor, salarioBase, percentualImposto, valorCredito, valorDivida, nome, endereco, telefone);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    //Se a subclasse quiser modificar o comportamento de um método herdado da superclasse, 
    //ela pode sobrescrever esse método (sobrescrita de métodos). 
    //Isso é feito criando um novo método com a mesma assinatura na subclasse.
    @Override
    public double calcularSalarioLiquido() {
        double salarioAdministrador = super.calcularSalarioLiquido() + ajudaDeCusto;
        return salarioAdministrador;
    }

    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void exibirInfoAdministradora() {
        System.out.println("Nome: " + getNome());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Valor Crédito: " + getValorCredito());
        System.out.println("Valor Dívida: " + getValorDivida());
        System.out.println("Saldo: " + obterSaldo());
        System.out.println("Código Setor: " + getCodigoSetor());
        System.out.println("Salário Base: " + getSalarioBase());
        System.out.println("Percentual de Imposto: " + getPercentualImposto());
        System.out.println("Salário Líquido: " + calcularSalarioLiquido());
        System.out.println("Departamento: " + getDepartamento());
        System.out.println("Ajuda de Custo: " + getAjudaDeCusto());
    }
}

public class Main {
    public static void main(String[] args) {

    }
}
