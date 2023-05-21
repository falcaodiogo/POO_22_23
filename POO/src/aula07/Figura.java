package aula07;

public abstract class Figura {
	private String cor;
	
	public Figura(String cor) {
		this.cor = cor;
	}
	
	public abstract double area();
	public abstract double perimetro();

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

}