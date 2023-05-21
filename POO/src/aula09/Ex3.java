package aula09;

import java.util.*;

import utils.Input;

public class Ex3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PlaneManager pm = new PlaneManager();
        int choice;
        String id;
        String fabricante;
        String model;
        int yearProduction;
        int maxPassengers;
        int maxSpeed;
        int numTribulantes;
        int numeroMunicoes;
        String tipo;
        
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar avião");
            System.out.println("2. Remover avião");
            System.out.println("3. Procurar avião");
            System.out.println("4. Imprimir aviões");
            System.out.println("5. Imprimir aviões comerciais ou militares");
            System.out.println("6. Imprimir as informações do avião mais rápido da frota");
            System.out.println("7. Exit");

            System.out.print("Opção: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:

                    System.out.println("Adicionar avião");
                    id = Input.inputString("ID: ", scanner);
                    fabricante = Input.inputString("Fabricante: ", scanner);
                    model = Input.inputString("Modelo: ", scanner);
                    yearProduction = Input.inputInt("Year of production: ", scanner);
                    maxPassengers = Input.inputInt("Max passangers: ", scanner);
                    maxSpeed = Input.inputInt("Max speed", scanner);

                    tipo = Input.inputString("O avião é (C)omercial,  (M)ilitar ou (N)ormal?", scanner);
                    if (tipo.equals("C")) {
                        numTribulantes = Input.inputInt("Número de tribulantes: ", scanner);
                        CommercialPlane cp = new CommercialPlane(id, fabricante, model, yearProduction, maxPassengers, maxSpeed, numTribulantes);
                        pm.addPlane(cp);
                    } else if (tipo.equals("M")) {
                        numeroMunicoes = Input.inputInt("Numero de munições: ", scanner);
                        MilitarPlane mp = new MilitarPlane(id, fabricante, model, yearProduction, maxPassengers, maxSpeed, numeroMunicoes);
                        pm.addPlane(mp);
                    } else if (tipo.equals("N")) {
                        Plane p = new Plane(id, fabricante, model, yearProduction, maxPassengers, maxSpeed);
                        pm.addPlane(p);
                    } else {
                        System.out.println("Tipo incorreto. Avião descartado");
                    }

                    break;

                case 2:

                    System.out.println("Remover avião");
                    id = Input.inputString("ID: ", scanner);
                    pm.removePlane(id);
                    break;

                case 3:

                    System.out.println("Procurar avião");
                    id = Input.inputString("ID: ", scanner);
                    pm.searchPlane(id);
                    break;

                case 4:

                    System.out.println("Imprimir aviões");
                    pm.printAllPlanes();
                    break;

                case 5:

                    System.out.println("Imprimir aviões comerciais ou militares");
                    tipo = Input.inputString("O avião é (C)omercial ou  (M)ilitar?", scanner);
                    if (tipo == "C") {
                        pm.getCommercialPlanes();
                    } else if (tipo == "M") {
                        pm.getMilitarPlanes();
                    }
                    else {
                        System.out.println("Opção inválida");
                    }
                    break;

                case 6:

                    System.out.println("Imprimir as informações do avião mais rápido da frota");
                    pm.getFastestPlane();
                    break;

                default:

                    System.out.println("\nOpção incorreta!");
                    break;
                
            }
            
        } while (choice != 7);
        scanner.close();
    }
    
}
