package aula03;

import java.util.Scanner;

import utils.Input;

public class Ex4 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int numero_alunos;
        double[][] notas;

        numero_alunos = Input.inputInt("Número de aluno: ", sc);

        notas = new double [numero_alunos][2];

        for (int i=0; i<numero_alunos; i++) {
            for (int j=0; j<2; j++) {
                Double rand1 = (Math.random() * (20 +  1));
                double roundOff = Math.round(rand1 * 100.0) / 100.0;
                notas[i][j] = roundOff;
            }
        }

        // print
        System.out.printf("%10s %10s %10s\n", "NotaT", "NotaP", "Pauta");
        for (int i=0; i<numero_alunos; i++) { 
            double nt = notas[i][0];
            double np = notas[i][1];
            double nf = nt*0.4+np*0.6;
            if (nt < 7.0 || np < 7.0){
                System.out.printf("%10.2f %10.2f %10s\n", np, nt, "66");
            } else {
                System.out.printf("%10.2f %10.2f %10.2f\n", np, nt, nf);
            }
        }      

        sc.close();

    }
    
}
