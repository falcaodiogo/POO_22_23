package aula04;
import java.util.Scanner;

import utils.Input;

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
        kms += distance;       
    }

}

public class CarDemo {

    static Scanner sc = new Scanner(System.in);

    static int registerCars(Car[] cars) {
        String modelo, marca;
        int ano, kms, cont = 0;
        do {
            System.out.print("A criar carro. ");
            System.out.print("Marca: ");
            marca = sc.nextLine(); // consume newline character
            if (marca.equals("")) {
                break;
            }
            modelo = Input.inputString("Modelo: ", sc);
            ano = Input.inputInt("Ano: ", sc);
            kms = Input.inputInt("Quilómetros: ", sc);
            Car carro = new Car(marca, modelo, ano, kms);
            cars[cont] = carro;
            cont++;
        } while (true);
        return cont;
   }

    static void registerTrips(Car[] cars, int numCars) {
        
        int car, kms;
        do {
            System.out.print("A criar viagem. ");
            System.out.print("Carro: ");
            car = sc.nextInt(); // consume newline character
            if (car == -1 || car >= numCars) {
                break;
            }
            kms = Input.inputInt("Quilómetros: ", sc);
            cars[car].drive(kms);
        } while (true);

    }


    static void listCars(Car[] cars) {
    System.out.println("\nCarros registados: ");
    for (int i = 0; i < cars.length; i++) {
        Car car = cars[i];
        if (car == null) {
            continue; // skip null elements
        }
        System.out.printf("%s %s, %d, kms: %d \n", car.make, car.model, car.year, car.kms);
    }
    System.out.println("\n");
}


    public static void main(String[] args) {

        Car[] cars = new Car[10];

        int numCars = registerCars(cars);

        if (numCars>0) {
            listCars(cars);
            registerTrips(cars, numCars);
            listCars(cars);
        }

        sc.close();

    }
}