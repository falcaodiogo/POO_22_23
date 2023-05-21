package aula10.Ex3;

import java.util.*;
import java.util.Scanner;


public class Ex3 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Frase: ");
            String frase = sc.nextLine();
            String now;
            int current;

            HashMap<String, Integer> letras = new HashMap<String, Integer>();
            
            for (int i = 0; i<frase.length(); i++) {
                now = Character.toString(frase.charAt(i));
                if (!letras.containsKey(now)) {
                    letras.put(now, 1);
                } else {
                    current = letras.get(now);
                    letras.put(now, 1 + current);
                }
            }

            System.out.println(letras);
        }

    }
    
}
