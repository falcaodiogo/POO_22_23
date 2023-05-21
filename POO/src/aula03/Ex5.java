package aula03;

import java.util.Scanner;

import utils.Input;

public class Ex5 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String data;
        int dia;
        do {
            data = Input.inputString("Data no formato mm/yyyy: ", sc);
        } while (!validData(data));

        do {
            dia = Input.inputInt("1º dia da semana - entre 1 e 7: ", sc);
        } while (dia < 1 || dia > 7);

        String[] mes_ano= data.split("/");
        int mes = Integer.parseInt(mes_ano[0]);
        int ano = Integer.parseInt(mes_ano[1]);
        int days = 0;
        String mes2 = "";

        switch(mes) {

            case 1:
                mes2 = "January";
                days = 31;
                break;

            case 2:
                mes2 = "February";
                if (isLeapYear(ano) == true) {
                    days = 29;
                } else {
                    days = 28;
                }
              break;

            case 3:
                mes2 = "March";
                days = 31;
                break;

            case 4:
                mes2 = "April";
                days = 30;
                break;

            case 5:
                mes2 = "May";
                days = 31;
                break;
        
            case 6:
                mes2 = "June";
                days = 30;
                break;

            case 7:
                mes2 = "July";
                days = 31;
                break;

            case 8:
                mes2 = "August";
                days = 31;

            case 9:
                mes2 = "September";
                days = 30;

            case 10:
                mes2 = "October";
                days = 31;

            case 11:
                mes2 = "November";
                days = 30;

            case 12:
                mes2 = "December";
                days = 31;

            default:
              break;
          }

        printar(days, mes2, ano, dia);

        sc.close();

    }


    public static boolean validData(String datas) {
        
        if (datas.length() != 7) {
            return false;
        }

        String[] mes_ano= datas.split("/");
        int mes = Integer.parseInt(mes_ano[0]);
        int ano = Integer.parseInt(mes_ano[1]);

        if (mes < 0 || mes > 12 || ano < 0 || ano > 2023) {
            System.out.println("Data inválida! Tente novamente.");
            return false;
        }

        return true;
    }

    
    public static boolean isLeapYear(int year) {
        
        boolean leap = false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                leap = true;
                else
                leap = false;
            } else
                leap = true;
        } else
            leap = false;

        return leap;
    }


    public static void printar(int days, String month, int year, int dia) {
        System.out.printf("%10s %d\n", month, year);
        System.out.printf(" %2s %2s %2s %2s %2s %2s %2s\n", "Su", "Mo", "Tu", "We", "Th", "Fr", "Sa");
        switch (dia) {

            case 2:
                System.out.printf("%2s", "");    
                break;

            case 3:
                System.out.printf("%2s %2s", "", "");  
                break;

            case 4:
                System.out.printf("%2s %2s %2s", "", "", "");  
                break;

            case 5:
                System.out.printf("%2s %2s %2s %2s", "", "", "", "");  
                break;

            case 6:
                System.out.printf("%2s %2s %2s %2s %2s", "", "", "", "", "");  
                break;

            case 7:
                System.out.printf("%2s %2s %2s %2s %2s %2s", "", "", "", "", "", "");  
                break;
        
            default:
                break;
        }

        for (int i = 1; i <= days; i++) {
            System.out.printf("%3d", i);
            if ((i + dia - 1) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

}