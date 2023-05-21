package aula03;
import java.util.*;
import utils.Input;

public class Ex2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer montante;
        Double juro, valor;

        do {
            montante = Input.inputInt("Montante (maior que zero e múltiplo de 1000): ", sc);
        } while (!(montante>0 && montante%1000==0 && Input.isInt(montante.toString())));
        do {
            juro = Input.inputDouble("Taxa de juro mensal (ex: 0.0X%): ", sc);
        } while (!(juro >= 0.00 && juro<=0.05 && Input.isDouble(juro.toString())));

        // valor_mensal = montante_investido * (1 + taxa_juros_mensal) ^ n, onde n é o número de meses.
        for (int i=1 ; i<=12; i++) {
            valor = montante * Math.pow((1 + juro), i);
            System.out.printf("Valor no mês %d: %.2f\n", i, valor);
        }

    }
    
}
