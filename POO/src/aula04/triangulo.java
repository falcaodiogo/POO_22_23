package aula04;

import utils.Input;

public class triangulo {
    int lado1, lado2, lado3;

    // construtor
    public triangulo(int l1, int l2, int l3) {
        lado1 = l1;
        lado2 = l2;
        lado3 = l3;
    }

    public void setLados(int l1, int l2, int l3) {
        if ( Input.isInt(Integer.toString(lado1)) && 
             Input.isInt(Integer.toString(lado2)) && 
             Input.isInt(Integer.toString(lado3)) ) {
            if ( Math.pow(lado1, 2) == Math.sqrt( Math.pow(lado2, 2) + Math.pow(lado3, 2)) || 
                 Math.pow(lado2, 2) == Math.sqrt( Math.pow(lado1, 2) + Math.pow(lado3, 2)) || 
                 Math.pow(lado3, 2) == Math.sqrt( Math.pow(lado2, 2) + Math.pow(lado1, 2))) {
                    lado1 = l1;
                    lado2 = l2;
                    lado3 = l3;
                 } else {
                    System.out.println("Triângulo não válido");
                    System.exit(1);
                 }
        } else {
            System.out.println("ERRO: Lado 1 não é int");
            System.exit(0);
        }
    }

    public int getLado1() {
        return lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public int getLado3() {
        return lado3;
    }


    public double getArea() {
        // fórmula de Heron
        double area, s;
        s = 0.5*(this.lado1 + this.lado2 + this.lado3);
        area = Math.sqrt(s * (s-this.lado1) * (s-this.lado2) * (s-this.lado3));
        return area;
    }

    public double getPerimetro() {
        double perimetro;
        perimetro = this.lado1 + this.lado2 + this.lado3;
        return perimetro;
    }

    public String toString() {
        return "Triângulo com lado 1: " + lado1 + " ,lado 2: " + lado2 + " e lado 3: " + lado3;
    }
    
}
