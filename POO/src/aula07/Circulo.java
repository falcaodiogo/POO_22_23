package aula07;

public class Circulo extends Figura {
	private Ponto centro;
	private double raio;
	
	public Circulo(Ponto c, double r) {
		super("Branco");
		this.centro = c; this.raio = r;
	}
	public Circulo(String cor, Ponto c, double r) {
		super(cor);
		this.centro = c; this.raio = r;
	}

	public Ponto getCentro() {
		return centro;
	}
	public double getRaio() {
		return raio;
	}
	
	@Override
	public String toString() {
		return "Circulo [centro =" + centro + ", raio =" + raio + ", cor =" + getCor() + "]";
	}
	
	@Override
	public double area() {
		return Math.PI * Math.pow(this.raio, 2);
	}

	@Override
	public double perimetro() {
		return Math.PI * 2 * this.raio;
	}
	
	public boolean intersectsWith(Circulo c) {
		double d = this.centro.distanceTo(c.centro);
		
		if(d < this.raio + c.raio) {
			return true;
		}
		else {
			return false;
		}
	}

}