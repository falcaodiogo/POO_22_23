package aula02;
import java.util.*;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double inv, tax, juro;
        System.out.println("Investimento: ");
        inv = sc.nextInt();
        System.out.println("Taxa");
        tax = sc.nextInt();
        if (inv < 0 || tax < 0 || tax > 100) {
            System.out.println("Valores têm de ser positivos e tax menor que 100");
            System.exit(0);
        }
        tax = tax/100;
        juro = inv + 3*(tax*inv);
        System.out.printf("Montante: %.2f\n", juro);
        sc.close();
    }
}
