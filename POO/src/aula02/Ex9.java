package aula02;
import java.util.*;

import utils.Input;

public class Ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Input.inputInt("N: ", sc);
        if (N < 0) {
            System.out.println("Valor tem de ser positivo.");
            System.exit(0);
        }
        do {
            if ( N%10 == 0 ) {
                System.out.println();
                System.out.println(N);
                N--;
            } else {
                System.out.println(N);
                N--;
            }
        } while (N >= 0);
        sc.close();
    }
}