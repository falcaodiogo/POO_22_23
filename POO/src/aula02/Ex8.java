package aula02;
import java.util.*;

import utils.Input;

public class Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A, B, C;

        A = Input.inputDouble("Lado A: ", sc);
        B = Input.inputDouble("Lado B: ", sc);

        if ( A <= 0 || B <= 0) {
            System.out.print("Valores têm de ser positivos");
            System.exit(0);
        }
        C = Math.sqrt( Math.pow(A, 2) + Math.pow(B, 2) );
        System.out.printf("Lado C: %.2f\n", C);
        sc.close();
    }
}
