package utils;

public class Datas {

    public static boolean validMonth(String mesinput) {
        
        if (mesinput.length() != 2) {
            return false;
        }

        int mes = Integer.parseInt(mesinput);

        if (mes < 0 || mes > 12) {
            System.out.println("Mês inválido! Tente novamente.");
            return false;
        }

        return true;
    }

    public static int monthDays(int mes, int ano) {

        // String mes2 = "";
        int days = 0;

        switch(mes) {

            case 1:
                // mes2 = "January";
                days = 31;
                break;

            case 2:
                // mes2 = "February";
                if (isLeapYear(ano) == true) {
                    days = 29;
                } else {
                    days = 28;
                }
              break;

            case 3:
                // mes2 = "March";
                days = 31;
                break;

            case 4:
                // mes2 = "April";
                days = 30;
                break;

            case 5:
                // mes2 = "May";
                days = 31;
                break;
        
            case 6:
                // mes2 = "June";
                days = 30;
                break;

            case 7:
                // mes2 = "July";
                days = 31;
                break;

            case 8:
                // mes2 = "August";
                days = 31;

            case 9:
                // mes2 = "September";
                days = 30;

            case 10:
                // mes2 = "October";
                days = 31;

            case 11:
                // mes2 = "November";
                days = 30;

            case 12:
                // mes2 = "December";
                days = 31;

            default:
              break;
          }

          return days;

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

    public static boolean valid(int day, int month, int year) {
        return false;
    }
    
}
