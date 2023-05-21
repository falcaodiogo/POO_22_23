package aula04;
import java.util.Scanner;

class Car {
    public String make;
    public String model;
    public int year;
    public int kms;

    public Car(String make, String model, int year, int kms) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.kms = kms;
    }

    public void drive(int distance) {
        // acrescenta a distância à kilometragem total
        kms += distance;
    }
}

public class SimpleCarDemo {

    static Scanner sc = new Scanner(System.in);

    static void listCars(Car[] cars) {
        System.out.println("Lista de carros:");
        for (int i=0; i<cars.length; i++) {
            System.out.printf("%d: %s %s %d (%d kms)\n", i, cars[i].make, cars[i].model, cars[i].year, cars[i].kms);
        }
    }

    public static void main(String[] args) {

        Car[] cars = new Car[3];
        cars[0] = new Car("Tesla", "Y", 2022, 200);
        cars[1] = new Car("Mercedes", "EQC", 2018, 3200);
        cars[2] = new Car("Hundai", "Ioniq 5", 2020, 21202);

        listCars(cars);

        // Adicionar 10 viagens geradas aleatoriamente
        for (int i=0; i<10; i++) {
            int j = (int)Math.round(Math.random()*2); // escolhe um dos 3 carros
            int kms = (int)Math.round(Math.random()*1000); // viagem até 1000 kms
            System.out.printf("Carro %d viajou %d quilómetros.\n", j, kms);
            cars[j].drive(kms);
        }

        listCars(cars);

        sc.close();

    }
}