package aula12;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner file = new Scanner(new FileReader("major.txt"));
        file.useDelimiter("[\\p{Punct}\\s]+");
        ArrayList<String> words = new ArrayList<String>();
        int count_different = 0;
        int count = 0;

        while (file.hasNext()) {
            String word = file.next();
            if (!words.contains(word)) {
                words.add(word);
                count_different++;
            }
            count++;
        }      
        
        System.out.println("Número Total de palavras: " + count + "\nNúmero de Diferentes Palavras: " + count_different);
    

    }
    
}
