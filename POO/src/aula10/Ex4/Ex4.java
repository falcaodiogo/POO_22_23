package aula10.Ex4;

import java.io.*;
import java.util.*;

public class Ex4 {

    public static void main(String[] args) throws IOException{ 

        Scanner input = new Scanner(new FileReader("words.txt")); 
        ArrayList <String> mq2 = new ArrayList<String>();

        while (input.hasNext()) { 
            String word = input.next(); 
            if (word.length() >= 2 && word.endsWith("s") && word.matches("\\w*")) {
                mq2.add(word);
            }
        } 

       System.out.println(mq2);

    }
    
}
