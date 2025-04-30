public class Main
{
	public static void main(String[] args) {
		FiguraPlana t = new Triangulo(5, 10, "Triângulo");
        FiguraPlana q = new Quadrado(4, "Quadrado");

        System.out.println(t.getNomeFigura() + " - Área: " + t.calcularArea());
        System.out.println(q.getNomeFigura() + " - Área: " + q.calcularArea());
	}
}

abstract class FiguraPlana {
    private String nomeFigura;
    public FiguraPlana(String nomeFigura){
        this.nomeFigura = nomeFigura;
    }
    
    public String getNomeFigura(){
        return nomeFigura;
    }
    public void setNomeFigura(String n){
        this.nomeFigura = n;
    }
    
    public abstract double calcularArea();
}

class Triangulo extends FiguraPlana {
    private double base;
    private double altura;

    public Triangulo(double base, double altura, String nomeFigura) {
        super(nomeFigura);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularArea() {
        return (base * altura) / 2;
    }
}

class Quadrado extends FiguraPlana {
    private double lado;

    public Quadrado(double lado, String nomeFigura) {
        super(nomeFigura);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double calcularArea() {
        return lado * lado;
    }
}

