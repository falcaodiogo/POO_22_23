package aula07;

public class Retangulo extends Figura {
	private double  comp;
	private double larg;
	
	public Retangulo(double c, double l) {
		super("Branco");
		this.comp = c; this.larg = l;
	}
	public Retangulo(String cor, double c, double l) {
		super(cor);
		this.comp = c; this.larg = l;
	}

	public double getComp() {
		return comp;
	}
	public double getLarg() {
		return larg;
	}
	
	@Override
	public double area() {
		return comp*larg;
	}

	@Override
	public double perimetro() {
		return 2*comp + 2*larg;
	}
	@Override
	public String toString() {
		return "Retangulo [comprimento =" + comp + ", largura =" + larg + ", cor =" + getCor() + "]";
	}

}