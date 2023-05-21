package aula03;
import java.util.*;
import utils.Input;

public class Ex3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Integer rand = (int) (Math.random() * (100 +  1));
        
        // System.out.println(rand);
        
        Integer num = Input.inputInt("Número entre 0 e 100: ", sc);

        while(num != rand) {
            String sim = Input.inputString("Deseja continuar? Prima (S)im", sc);
            if (sim!="S" || sim!="Sim") {
                System.out.println("A sair");
                System.exit(0);
            }
        }

        System.out.println("Acertou! O número era: " + rand);
        
        sc.close();
    }

}
