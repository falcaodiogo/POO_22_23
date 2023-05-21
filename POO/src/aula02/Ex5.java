package aula02;
import java.util.*;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double v1, v2, d1, d2, t1, t2, vm;
        System.out.print("Velocidade 1? ");
        v1 = sc.nextDouble();
        System.out.print("Velocidade 2? ");
        v2 = sc.nextDouble();
        System.out.print("Distãncia 1? ");
        d1 = sc.nextDouble();
        System.out.print("Distância 2? ");
        d2 = sc.nextDouble();
        if (v1 < 0 || v2 < 0 || d1 < 0 || d2 < 0) {
            System.out.println("Valores têm de ser positivos");
            System.exit(0);
        }
        t1 = d1/v1;
        t2 = d2/v2;
        vm = (d1+d2)/(t1+t2);
        System.out.printf("Velocidade média: %2f\n", vm);
        sc.close();
    }
}
