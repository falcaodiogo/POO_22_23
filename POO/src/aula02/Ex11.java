package aula02;
import java.util.*;
import utils.Input;

public class Ex11 {

    // função pede ao utilizador um valor inteiro através do método value()
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String palavra = Input.inputString("String: ", sc);
        System.out.println(palavra);

        Double numero = Input.inputDouble("Double: ", sc);
        System.out.println(numero);

        Integer numero2 = Input.inputInt("Int: ", sc);
        System.out.println(numero2);

        Boolean intervalo = Input.inInterval("Intervalo entre -2.3 e 3.4", -2.3, 3.4, sc);
        System.out.println(intervalo);

        sc.close();
    }  

}