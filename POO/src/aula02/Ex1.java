package aula02;
import java.util.*;

public class Ex1 {
    public static void main(String[] args) {
        double kilometros;
        Scanner sc = new Scanner(System.in);
        System.out.print("Kilómetros? ");
        kilometros = sc.nextDouble();
        double milhas = kilometros/1.609;
        System.out.printf("Milhas: %.2f\n", milhas);
        sc.close();
    }
}