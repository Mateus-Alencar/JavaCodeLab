// Mateus da Silva Alencar e Nathan Henrique
public class Main
{
	public static void main(String[] args) {
		Funcionario Nathan = new Funcionario("Nathan", 1800.00, 3, 90.00, 0, 120.00, 1, 100.00, 5, 17, 180.00);
        Nathan.mostraFolhaDePagamento();
	}
}

class Funcionario {
    private String nome;
    private double salarioBase;
    private double horasExtras;
    private double valorHoraExtra;
    private int faltas;
    private double valorDescontoFalta;
    private int numeroDependentes;
    private double valorPorDependente;
    private int anuenio;
    private int anosTrabalhados;
    private double descontos;

    public Funcionario(String nome, double salarioBase, double horasExtras, double valorHoraExtra, int faltas, double valorDescontoFalta, int numeroDependentes, double valorPorDependente, int anuenio, int anosTrabalhados, double descontos) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.horasExtras = horasExtras;
        this.valorHoraExtra = valorHoraExtra;
        this.faltas = faltas;
        this.valorDescontoFalta = valorDescontoFalta;
        this.numeroDependentes = numeroDependentes;
        this.valorPorDependente = valorPorDependente;
        this.anuenio = anuenio;
        this.anosTrabalhados = anosTrabalhados;
        this.descontos = descontos;
    }
    
    public double calcularAnuenio() {
        return (salarioBase * anuenio * anosTrabalhados) / 100.0;

    }
    public double calcularBonusTempoDeEmpresa(){
        if (anosTrabalhados >= 10) {
            return salarioBase * 0.05;  
        }
        return 0.0;
    }
    public double calcularValorHorasExtras(){
        double totalHorasExtras = horasExtras * valorHoraExtra;
        if (faltas >= 3){
            totalHorasExtras = totalHorasExtras / 2;
        }
        return totalHorasExtras;
    }
    public double calcularDescontoFaltas(){
        double descontoFaltas =  faltas * valorDescontoFalta;
        if (faltas >= 5){
            return descontoFaltas * 1.5;
        }
        return descontoFaltas;
    }
    public double calcularBeneficioDependentes(){
        return numeroDependentes * valorPorDependente;

    }
    public double calcularImposto(){
        if (salarioBase < 2500) {
            return 0.0; 
        } else if (salarioBase >= 2500 && salarioBase < 5000) {
            return salarioBase * 0.10;  
        } else {
            return salarioBase * 0.15;  
        }
    }
    public double calcularSalarioLiquido(){
        double bonus = calcularBonusTempoDeEmpresa();
        double horasExtras = calcularValorHorasExtras();
        double beneficioDependentes = calcularBeneficioDependentes();
        double descontoFaltas = calcularDescontoFaltas();
        double imposto = calcularImposto();

        return salarioBase + calcularAnuenio() + bonus + horasExtras + beneficioDependentes - descontoFaltas - imposto;    
        
    }
    public void mostraFolhaDePagamento(){
        System.out.println("----- Folha de Pagamento -----");
        System.out.println("Nome: " + nome);
        System.out.println("Salário Base: " + salarioBase);
        System.out.println("Anuênio: " + calcularAnuenio());
        System.out.println("Bônus de Tempo de Empresa: " + calcularBonusTempoDeEmpresa());
        System.out.println("Valor das Horas Extras: " + calcularValorHorasExtras());
        System.out.println("Benefício por Dependentes: " + calcularBeneficioDependentes());
        System.out.println("Desconto por Faltas: " + calcularDescontoFaltas());
        System.out.println("Imposto: " + calcularImposto());
        System.out.println("Salário Líquido: " + calcularSalarioLiquido());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(double horasExtras) {
        this.horasExtras = horasExtras;
    }

    public double getValorHoraExtra() {
        return valorHoraExtra;
    }

    public void setValorHoraExtra(double valorHoraExtra) {
        this.valorHoraExtra = valorHoraExtra;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    public double getValorDescontoFalta() {
        return valorDescontoFalta;
    }

    public void setValorDescontoFalta(double valorDescontoFalta) {
        this.valorDescontoFalta = valorDescontoFalta;
    }

    public int getNumeroDependentes() {
        return numeroDependentes;
    }

    public void setNumeroDependentes(int numeroDependentes) {
        this.numeroDependentes = numeroDependentes;
    }

    public double getValorPorDependente() {
        return valorPorDependente;
    }

    public void setValorPorDependente(double valorPorDependente) {
        this.valorPorDependente = valorPorDependente;
    }

    public int getAnuenio() {
        return anuenio;
    }

    public void setAnuenio(int anuenio) {
        this.anuenio = anuenio;
    }

    public int getAnosTrabalhados() {
        return anosTrabalhados;
    }

    public void setAnosTrabalhados(int anosTrabalhados) {
        this.anosTrabalhados = anosTrabalhados;
    }

    public double getDescontos() {
        return descontos;
    }

    public void setDescontos(double descontos) {
        this.descontos = descontos;
    }
}


