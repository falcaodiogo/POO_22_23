package aula11;

import java.io.*;
import java.util.*;

public class Ex1 {
    
    public static void main(String[] args) throws IOException{

        Scanner file = new Scanner(new FileReader("./aula11/ficheiros/aula11/major.txt"));
        file.useDelimiter("[\\p{Punct}\\s]+");
        ArrayList <String> words = new ArrayList<>(); 
        Map <String, Map <String, Integer>> map = new HashMap<>();

        while(file.hasNext()) {
            String word = file.next();
            if (word.length() > 2) {
                words.add(word);
            }
        }

        for (int i=0; i<words.size()-1; i++) {
            
            String current = words.get(i);
            String next = words.get(i+1);

            if (!map.containsKey(current)) {
                Map <String, Integer> temp = new HashMap<>();
                temp.put(next, 1);
                map.put(current, temp);
            } else {
                if(map.get(current).containsKey(next)) {
					map.get(current).replace(next, map.get(current).get(next) , map.get(current).get(next)+1);
				} else {
					map.get(current).put(next, 1);
				}
            }
        }

        for(int i = 0; i < map.size(); i++) {
			System.out.println(map.entrySet().toArray()[i].toString());
			
		}

        // for (String i : words) {
        //     System.out.println("Word: " + i);
        // }

	}

}
