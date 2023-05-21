package aula12;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner file = new Scanner(new FileReader("A_cidade_e_as_serras.txt"));
        file.useDelimiter("[\\p{Punct}\\s]+");
        char ch;

        Map <String, Integer> map = new HashMap<>();

        while (file.hasNext()) {
            String word = file.next();
            if (map.containsKey(word)) {
                int number = map.get(word);
                map.remove(word);
                map.put(word, number+1);
            } else {
                map.put(word, 1);
            }
        }

        for( ch = 'a' ; ch <= 'z' ; ch++ ) {
            System.out.print(ch + ": ");
            for (String word : map.keySet()) {
                String ch2 = Character.toString(ch);
                if (word.startsWith(ch2)) {
                    System.out.print(word + ", " + map.get(word) + "; ");
                }
            }
            System.out.println("\n");
        }
    }
    
}
