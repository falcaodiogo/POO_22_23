package aula05;

import java.util.Scanner;

import aula06.DateYMD;
import utils.Input;

public class Ex1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DateYMD date = new DateYMD(0, 0, 0);
        int op, day, month, year;
        
        String menu = "Date operations:\n" +
                       "1 - create new date\n" +
                       "2 - show current date\n" +
                       "3 - increment date\n" +
                       "4 - decrement date\n" +
                       "0 - exit\n";

        System.out.println(menu);

        do {

            op = Input.inputInt("Option: ", sc);
            
            switch (op) {

                case 1:        
                    do {       
                        day = Input.inputInt("Day: ", sc);  
                        month = Input.inputInt("Month: ", sc);  
                        year = Input.inputInt("Year: ", sc); 
                        date = new DateYMD(day, month, year);
                    } while (!DateYMD.validDate(day, month, year));
                    System.out.println("Date created!");
                    break;

                case 2:
                    System.out.println("Current date: " + date.toString());
                    break;

                case 3:
                    date.incrementData();
                    System.out.println(date);
                    break;

                case 4:
                    date.decrementData();
                    System.out.println(date);
                    break;

                case 0:
                    break;
            
                default:
                    System.out.println("\nOpção errada.\n");
                    System.out.println(menu);
                    break;
            }
        
        } while (op != 0);

        System.out.println("Exiting... ");

        sc.close();

    }
    
}
