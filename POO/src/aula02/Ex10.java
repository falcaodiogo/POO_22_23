package aula02;
import java.util.*;
import utils.Input;

public class Ex10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Integer> num = new ArrayList<Integer>();
        double sum = 0;

        int temp = Input.inputInt("Número: ", sc);
        num.add(temp);
        int count = 1;
        
        do {
            System.out.print("Número: ");
            int temp2 = sc.nextInt();
            num.add(temp2);
            count++;
        }
        while ( num.get(num.size() - 1) != num.get(0) ); // do (input) while (o último elemento da lista não for igual ao primeiro)

        // média
        for (int i = 0; i < num.size(); i++) {
            sum += num.get(i);
        }

        System.out.printf("Max: %d\n", Collections.max(num));
        System.out.printf("Min: %d\n", Collections.min(num));
        System.out.printf("Média: %.2f\n", sum/count);
        sc.close();
    }
}
