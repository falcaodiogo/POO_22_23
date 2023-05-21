package utils;
import java.util.*;

// ELIMINAR TODOS OS FICHEIROS .class -> find src -type f -name "*.class" -delete

public class Input {

    public static String inputString(String var_name, Scanner sc) {
        System.out.print(var_name);
        String output = sc.next();
        return output;
    }

    public static Double inputDouble(String var_name, Scanner sc) {
        String output;
        do {
            System.out.print(var_name);
            output = sc.next();
        } while (isDouble(output.toString()) == false);
        return Double.parseDouble(output);
    }

    public static Integer inputInt(String var_name, Scanner sc) {
        String output;
        do {
            System.out.print(var_name);
            output = sc.next();
        } while (isInt(output.toString()) == false);
        return Integer.parseInt(output);   
    }

    // verifica se o valor é Double
    public static boolean isDouble(String strNum) {
        try {
            Double.parseDouble(strNum);
        } catch (Exception e) {
            System.out.println("Não é número");
            return false;
        }
        return true;
    }

    public static Boolean inInterval(String var_name, Double menorNum, Double maiorNum, Scanner sc) {
        String num;
        do {
            System.out.println(var_name);
            num = sc.next();
        } while (isDouble(num) == false );
        double num2 = Double.parseDouble(num);
        if ( menorNum < num2 && num2 < maiorNum) {
            return true;
        } 
        return false;
    }
    
    // verifica se o valor é Int
    public static boolean isInt(String strNum) {
        try {
            Integer.parseInt(strNum);
        } catch (Exception e) {
            System.out.println("Não é inteiro");
            return false;
        }
        return true;
    }
}