package aula07;

public class Ex1 {

	public static void main(String[] args) {

		Figura[] f = new Figura[10];
		
		Ponto p1 = new Ponto(0,0);
		Ponto p2 = new Ponto(0,6);
		f[0] = new Circulo(p1, 3);
		f[1] = new Circulo(p2, 4);
		f[2] = new Triangulo("Vermelho", 5, 4, 8);
		
		for(int i=3; i<f.length; i++) {
			f[i] = new Retangulo("Azul", rnd(), rnd());
		}
		
		System.out.println(f[0].area());
		System.out.println(f[1].perimetro());
		System.out.println(f[2].area());
		System.out.println(f[2].getCor());
		
		for(int i=0; i<f.length; i++) {
			System.out.println(f[i]);
		}

	}
	
	public static double rnd() {
		double num = (Math.random() * 15) + 1;
		return num;
	}

}
