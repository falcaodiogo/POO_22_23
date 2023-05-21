package aula05;

import java.util.*;

import aula06.DateYMD;
import utils.Input;

public class Ex2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DateYMD date = new DateYMD(0, 0, 0);
        Calendar cal;
        int op, year, dia;

        String menu = "Calendar operations:\n" +
                       "1 - create new calendar month\n" +
                       "2 - show current date\n" +
                       "3 - print calendar\n" +
                       "0 - exit\n";

        System.out.println(menu);

        do {

            op = Input.inputInt("Option: ", sc);
            
            switch (op) {

                case 1:        
                    do {       
                        year = Input.inputInt("Year: ", sc); 
                        do {
                            dia = Input.inputInt("1º dia da semana - entre 1 e 7: ", sc);
                        } while (dia < 1 || dia > 7);
                        date = new DateYMD(1, 1, year);
                    } while (!DateYMD.validDate(1, 1, year));
                    cal = new Calendar(dia, date);
                    System.out.println("Calendar created!");
                    break;

                case 2:
                    for (int i = 0; i < 12; i++) {
                        System.out.println(cal.toString());
                        cal.incrementData();
                    }                              
                    break;

                case 3:
                    cal.printCalendarMonth();
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
