package aula08.Ex1;

import java.util.Scanner;

import utils.Input;

public abstract class Veiculo implements KmPercorridosInterface{

    protected String matricula;
    protected String marca;
    protected String modelo;
    protected int cv;
    int distanciaTotal = 0;
    int quilometros;
    Scanner sc = new Scanner(System.in);

    public Veiculo(String matricula, String marca, String modelo, int cv) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.cv = cv;
    }

    // confirm matricula is in format XX-XX-XX
    public static boolean confirmMatricula(String matricula) {
        if (matricula.length() != 8) {
            return false;
        }
        if (matricula.charAt(2) != '-' || matricula.charAt(5) != '-') {
            return false;
        }
        for (int i = 0; i < 8; i++) {
            if (i == 2 || i == 5) {
                continue;
            }
            if (!Character.isDigit(matricula.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMarca(String mr) {
        this.marca = mr;
    }

    public void setModelo(String mo) {
        this.modelo = mo;
    }

    public void setCV(int cv) {
        this.cv = cv;
    }

    @Override
    public String toString() {
        return " - matricula: " + matricula + ", marca: " + marca + ", modelo: " + modelo + ", potência: " + cv; 
    }

    public void trajeto(int quilometros) {
        quilometros = Input.inputInt("Trajeto: ", sc);
        distanciaTotal += quilometros;
    } 

    public int ultimoTrajeto() {
        return quilometros;
    }

    public int distanciaTotal() {
        return distanciaTotal;
    }
    
}
