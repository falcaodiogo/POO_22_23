package aula02;
import java.util.*;;

public class Ex3 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double energy, water, start, end;
        System.out.print("Água (em kilogramas): ");
        water = sc.nextDouble();
        System.out.print("Temp. inicial (graus celcius): ");
        start = sc.nextDouble();
        System.out.print("Temp. final (graus celcius): ");
        end = sc.nextDouble();
        if (water < 0 || start <0 || end <0) {
            System.out.println("Valor não pode ser menor que zero");
            System.exit(0);
        }
        energy = water * (end - start) * 4184;
        System.out.printf("São precisos %.2f joules\n", energy);
        sc.close();
    }

}
