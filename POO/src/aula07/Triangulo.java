package aula07;

public class Triangulo extends Figura {
	private double l1;
	private double l2;
	private double l3;

	public Triangulo(double l1, double l2, double l3) {
		super("Branco");
		this.l1 = l1; this.l2 = l2; this.l3 = l3;
		
	}
	public Triangulo(String cor, double l1, double l2, double l3) {
		super(cor);
		this.l1 = l1; this.l2 = l2; this.l3 = l3;
		
	}

	public double getL1() {
		return l1;
	}
	public double getL2() {
		return l2;
	}
	public double getL3() {
		return l3;
	}
	
	@Override
	public String toString() {
		return "Triangulo [l1 =" + l1 + ", l2 =" + l2 + ", l3 =" + l3 + ", cor =" + getCor() + "]";
	}
	@Override
	public double area() {
		double p = this.perimetro()/2;
		return Math.sqrt(p*(p-l1)*(p-l2)*(p-l3));
	}

	@Override
	public double perimetro() {
		return (l1 + l2 + l3);
	}

}
