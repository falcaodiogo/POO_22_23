package aula04;

import utils.Input;

public class retangulo {
    int comprimento;
    int altura;

    public retangulo(int c, int a) {
        comprimento = c;
        altura = a;
    }

    public void setLados(int c, int a) {
        if ( Input.isInt(Integer.toString(c)) && Input.isInt(Integer.toString(a)) ) {
            comprimento = c;
            altura = a;
        }
    }

    public int getComprimento() {
        return comprimento;
    }

    public int getAltura() {
        return altura;
    }

    public double getArea() {
        return (comprimento*altura);
    }

    public double getPerimetro() {
        return (comprimento*2 + altura*2);
    }
    
    @Override
    public String toString() {
        return "Retângulo com comprimento: " + comprimento + " e altura: " + altura;
    }
    
}
