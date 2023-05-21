package aula02;
import java.util.*;

import utils.Input;

public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p1x, p1y, p2x, p2y;
        double dist;
        System.out.print("P1(x): ");
        p1x = sc.nextInt();
        System.out.print("P1(y): ");
        p1y = sc.nextInt();
        System.out.print("P2(x): ");
        p2x = sc.nextInt();
        System.out.print("P2(y): ");
        p2y = sc.nextInt();
        p1x = Input.inputInt("P1(x): ", sc);
        p2x = Input.inputInt("P2(x): ", sc);
        p1y = Input.inputInt("P1(Y): ", sc);
        p2y = Input.inputInt("P2(Y): ", sc);
        dist = Math.sqrt(Math.pow(p2x - p1x, 2) + Math.pow(p2y - p1y, 2));
        System.out.printf("Distância entre P1 e P2: %.2f\n", dist);
        sc.close();
    }
}
