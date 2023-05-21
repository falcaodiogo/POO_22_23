package aula12;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map.Entry;

import utils.Input;

public class Ex3 {

    public static void main(String[] args) throws FileNotFoundException{

        Scanner file = new Scanner(new FileReader("movies.txt"));
        Scanner sc = new Scanner(System.in);

        ArrayList <Movie> movies = new ArrayList<>();

        Movie m;

        while (file.hasNext()) {
            file.nextLine();
            String line = file.nextLine();
            String[] line2 = line.split("\t");
            m = new Movie(line2[0], Float.parseFloat(line2[1]), line2[2], line2[3], Integer.valueOf(line2[4]));
            movies.add(m);
        }

        System.out.println("\nc)Sort by score ************************\n");
        TreeMap <Integer, Movie> scores = new TreeMap<>();

        // sort by score
        for (Movie m1 : movies) {
            scores.put((int) m1.getScore(), m1);
        }
        for (Movie m1 : scores.values()) {
            System.out.println(m1);
        }

        System.out.println("\nc) Sort by running time ************************\n");
        TreeMap <Integer, Movie> run_time = new TreeMap<>();

        //sort by running time
        for (Movie m1 : movies) {
            run_time.put((int) m1.getRunning_time(), m1);
        }
        for (Movie m1 : run_time.values()) {
            System.out.println(m1);
        }

        System.out.println("\nd) Sort by genre ************************\n");
        HashMap <String, ArrayList <Movie>> map = new HashMap<>();
                // genre           // movies

        // Order by genres
        for (Movie m1 : movies) {
            if (map.containsKey(m1.getGenre())) {
                map.get(m1.getGenre()).add(m1);
            } else {
                ArrayList <Movie> aux = new ArrayList<>();
                aux.add(m1);
                map.put(m1.getGenre(), aux);
            }
        }
        
        for( Entry<String, ArrayList<Movie>> entry : map.entrySet() ){
            System.out.println( entry.getKey() + " = " + entry.getValue() + "\n" );
        }


        System.out.println("\ne) Wrinting on file ************************\n");

        try {

            FileWriter myWriter = new FileWriter("filename.txt");

            // exercício e) -> scores > 60 && pertence a um género
            String genre_op = Input.inputString("Género: ", sc);
            genre_op = genre_op.toLowerCase();
            for( Entry<String, ArrayList<Movie>> entry : map.entrySet() ){
                // System.out.println( entry.getKey() + " = " + entry.getValue() + "\n" );
                System.out.println(entry.getKey() + " + " + genre_op);
                if (entry.getKey().equals(genre_op)) {
                    myWriter.write(entry.getKey() + " = " + entry.getValue() + "\n" );
                }
            }
            myWriter.close();

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    
}
