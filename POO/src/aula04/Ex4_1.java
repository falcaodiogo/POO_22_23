package aula04;

import java.util.*;
import java.util.Scanner;

import utils.Input;

public class Ex4_1 {

    public static void main(String[] args) {

        String op, op2;
        ArrayList <retangulo> rec = new ArrayList<>();
        ArrayList <triangulo> tri = new ArrayList<>();
        ArrayList <circulo> cir = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        String menu = "\nCriar (T)riângulo\n" +
                      "Criar (R)etângulo\n" + 
                      "Criar (C)írculo\n"  +
                      "(M)ostrar formas\n" +
                      "(S)air";
                      
        String triangulo_opt = "\n(A)rea do triângulo\n" +
                               "(P)erímetro do triângulo\n";

        String retangulo_opt = "\n(A)rea do retangulo\n" +
                               "(P)erímetro do retângulo\n";

        String circulo_opt = "\n(A)rea do círculo\n" +
                             "(P)erímetro do círculo\n";

        do {
            System.out.println(menu);
            op = Input.inputString("Option: ", sc);
            switch (op) {
                case "T":

                    System.out.println("T");

                    int lado1;
                    int lado2;
                    int lado3;

                    do {
                        lado1 = Input.inputInt("Lado 1: ", sc);
                    } while (lado1 < 0);
                    do {
                        lado2 = Input.inputInt("Lado 2: ", sc);
                    } while (lado2 < 0);
                    do {
                        lado3 = Input.inputInt("Lado 3: ", sc);
                    } while (lado3 < 0);

                    triangulo t = new triangulo(lado1, lado2, lado3);

                    tri.add(t);

                    System.out.println(triangulo_opt);

                    op2 = Input.inputString("T op: ", sc);

                    switch (op2) {
                        case "A":
                            double a = t.getArea();
                            System.out.printf("Area: %.2f\n", a);
                            break;

                        case "P":
                            double p = t.getPerimetro();
                            System.out.printf("Area: %.2f\n", p);
                            break;
                    
                        default:
                            System.out.println("Opção errada!");
                            break;
                    }
                    break;

                case "R":

                    System.out.println("R");

                    int comprimento;
                    int altura;

                    do {
                        comprimento = Input.inputInt("Comprimento: ", sc);
                    } while (comprimento < 0);
                    do {
                        altura = Input.inputInt("Altura: ", sc);
                    } while (comprimento < 0);

                    retangulo r = new retangulo(comprimento, altura);

                    rec.add(r);

                    System.out.println(retangulo_opt);

                    op2 = Input.inputString("Option: ", sc);

                    switch (op2) {
                        case "A":
                            double a = r.getArea();
                            System.out.printf("Area: %.2f\n", a);
                            break;

                        case "P":
                            double p = r.getPerimetro();
                            System.out.printf("Area: %.2f\n", p);
                            break;
                    
                        default:
                            System.out.println("Opção errada!");
                            break;
                    }
                    break;

                case "C":

                    System.out.println("C");

                    int raio;

                    do {
                        raio = Input.inputInt("Raio: ", sc);
                    } while (raio < 0);

                    circulo c = new circulo(raio);

                    cir.add(c);

                    System.out.println(circulo_opt);

                    op2 = Input.inputString("Option: ", sc);

                    switch (op2) {
                        case "A":
                            double a = c.getArea();
                            System.out.printf("Area: %.2f\n", a);
                            break;

                        case "P":
                            double p = c.getPerimetro();
                            System.out.printf("Area: %.2f\n", p);
                            break;
                    
                        default:
                            System.out.println("Opção errada!");
                            break;
                    }
                    break;

                case "M":
                    int i;

                    System.out.println("Circulo: ");
                    for (i = 0; i < cir.size(); i++) {
                        System.out.println(cir.get(i));
                    }

                    System.out.println("Triângulo: ");
                    for (i = 0; i < tri.size(); i++) {
                        System.out.println(tri.get(i));
                    }

                    System.out.println("Retângulo: ");
                    for (i = 0; i < rec.size(); i++) {
                        System.out.println(rec.get(i));
                    }

                    break;

                case "S":
                    System.out.println("A sair do programa.");
                    System.exit(0);
            
                default:
                    System.out.println("Opção errada!");
                    break;
            } 
        } while (op != "S");


    }
    
}
