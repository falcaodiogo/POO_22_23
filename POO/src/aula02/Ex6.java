package aula02;
import java.util.*;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sec, sec1, min, hour;
        System.out.print("Segundos: ");
        sec = sc.nextInt();
        if (sec < 0) {
            System.out.println("Segundos tem de ser um valor positivo.");
            System.exit(0);
        }
        hour = sec / 3600;
        min = (sec % 3600) / 60;
        sec1 = sec % 60;
        System.out.printf("%d segundos corresponde a %d:%d:%d\n", sec, hour, min, sec1);
        sc.close();
    }
}
