package aula09;

import java.util.*;
import aula06.*;

public class ALDemo {
    public static void main(String[] args) {

        ArrayList<Integer> c1 = new ArrayList<>();
        for (int i = 10; i <= 100; i+=10) 
            c1.add(i);
        System.out.println("Size: " + c1.size());
        for (int i = 0; i < c1.size(); i++) 
            System.out.println("Elemento: " + c1.get(i));
            
        ArrayList<String> c2 = new ArrayList<>();
        c2.add("Vento");
        c2.add("Calor");
        c2.add("Frio");
        c2.add("Chuva");
        System.out.println(c2);
        Collections.sort(c2);
        System.out.println(c2);
        c2.remove("Frio"); 
        c2.remove(0);
        System.out.println(c2);
        System.out.println(c2.contains("Chuva"));
        System.out.println(c2.lastIndexOf("Chuva"));
        c2.clear();
        System.out.println(c2);

        Set<Aluno> c3 = new HashSet<>();
        DateYMD D1 = new DateYMD(12, 1, 2004);
        DateYMD D2 = new DateYMD(25 , 12, 2003);
        DateYMD D3 = new DateYMD(1, 5, 2020);
        DateYMD D4 = new DateYMD(8, 7, 1999);
        Aluno a1 = new Aluno("Diana", 222, D1);
        Aluno a2 = new Aluno("João", 222, D2);
        Aluno a3 = new Aluno("Zé", 222, D3);
        Aluno a4 = new Aluno("Rúben", 222, D4);
        c3.add(a1);
        c3.add(a2);
        c3.add(a3);
        c3.add(a4);
        System.out.println(c3.contains(a1));
        c3.add(a1);
        for (Aluno a : c3) 
            System.out.println(a);

        // Set <Date> c4 = new TreeSet<>();
        // Date d1 = new Date(2020, 1, 1);
        // Date d2 = new Date(2020, 1, 2);
        // Date d3 = new Date(2020, 1, 3);
        // Date d4 = new Date(2020, 1, 4);
        // c4.add(d1);
        // c4.add(d2);
        // c4.add(d3);
        // c4.add(d4);
        // for (Date d : c4) 
        //     System.out.println(d);

    }
}