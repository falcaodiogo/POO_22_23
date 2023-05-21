package aula11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gradebook {

    ArrayList <Student> turma = new ArrayList<>();
    List <Double> grades = new ArrayList<>();
    Student aluno;

    public void load(String file) {
        try {
            Scanner input = new Scanner(new File(file));
            while (input.hasNextLine()) {
                String line = input.nextLine();
                String[] parts = line.split("\\|");
                String name = parts[0];
                List<Double> grades = new ArrayList<>(); // Create a new list for each student
                for (int i = 1; i <= 3; i++) {
                    grades.add(Double.valueOf(parts[i]));
                }
                Student aluno = new Student(name, grades);
                turma.add(aluno);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Ficheiro não existente!");
        }
    }
    

    public void addStudent(Student newStudent) {
        turma.add(newStudent);
    }

    public void removeStudent(String name) {
        for (Student i : turma) {
            if (i.getName() == name) {
                turma.remove(i);
            }
        }
    }

    public Student getStudent(String name) {
        for (Student i : turma) {
            if (i.getName() == name) {
                return i;
            }
        }
        return null;
    }

    public double calculateAverageGrade(String name) {
        double total = 0;
        double avg = 0;
        int cont = 0;
        for (Student i : turma) {
            if (i.getName() == name) {
                for (double x : i.getGrades()) {
                    total+=x;
                    cont += 1;
                }
                avg = total/cont;
            }
        }
        return avg;
    }

    public void printAllStudents() {
        for (Student i : turma) {
            System.out.println(i);
        }
    }

}
