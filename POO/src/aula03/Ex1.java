package aula03;
import utils.Input;
import java.util.*;

public class Ex1 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Integer num = Input.inputInt("Número: ", sc);

        int count = 0;
        for (int i=1 ; i<= num; i++) {
            if (isPrimo(i)) {
                count += i;
            } else {
                continue;
            }
        }

        System.out.println("Soma dos n primos: " + count);

        sc.close();
        
    }

    public static boolean isPrimo(int N) {
        int count = 0;
        for (int i=1 ; i<=N; i++) {
            if (N%i==0) {
                count+=1;
            }
        } 
        if (count == 2) {
            return true;
        } else {
            return false;
        }
    }

}
