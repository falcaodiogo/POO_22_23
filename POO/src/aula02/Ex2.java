package aula02;
import java.util.*;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cel, far;
        System.out.print("Celcius? ");
        cel = sc.nextDouble();
        far = 1.8 * cel + 32;
        System.out.printf("Farenheit: %.2fº\n", far);
        sc.close();
    }

}
