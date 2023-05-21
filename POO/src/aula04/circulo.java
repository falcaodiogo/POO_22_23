package aula04;

import utils.Input;

public class circulo {
    int raio;

    public circulo(int raio) {
        this.raio = raio;
    }    

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        if ( Input.isInt(Integer.toString(raio)) ) {
            this.raio = raio;
        } else {
            System.out.println("ERRO: Raio não é um int");
            System.exit(0);
        }
    }

    public double getArea() {
        return (Math.PI * Math.pow(raio, 2)); 
    }

    public double getPerimetro() {
        return (Math.PI * this.raio * 2);
    }

    public String toString() {
        return "Círculo com raio " + getRaio();
    }
    
}
