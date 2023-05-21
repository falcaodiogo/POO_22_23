package aula05;

public class DateYMD {

    public static boolean validMonth(int mes) {
        
        // if (mesinput.length() != 2) {
        //     return false;
        // }

        // int mes = Integer.parseInt(mesinput);

        if (mes < 0 || mes > 12) {
            System.out.println("Mês inválido! Tente novamente.");
            return false;
        }

        return true;
    }

    public static boolean validYear(int year) {
        
        // if (mesinput.length() != 2) {
        //     return false;
        // }

        // int mes = Integer.parseInt(mesinput);

        if (year < 1000 || year > 2023) {
            System.out.println("Ano inválido! Tente novamente.");
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

            case 3:
                // mes2 = "March";
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

    public static boolean validDate(int d, int m, int y) {
        if (d <= monthDays(m, y) && validMonth(m) && validYear(y)) {
            return true;
        }
        return false;
    }

    public static boolean validWeekDay(int w) {
        if (w > 7 || w < 1) {
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


    private int day, month, year;

    public DateYMD(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void setDate(int d, int m, int y) {
        if (d <= monthDays(m, y) && validMonth(m) && validYear(y) ){
            day = d;
            month = m;
            year = y;
        }
    }

    public void incrementData() {
        if (day != monthDays(this.month, this.year)) {
            day += 1;
        } else {
            if (month == 12) {
                day = 1;
                month = 1;
                year += 1;
            } else {
                day = 1;
                month += 1;
            }
        }    
    } 

    // incompleta
    public void decrementData() {
        if (day != 1) {
            day -= 1;
        } else {
            if (month == 1) {
                month = 12;
                day = monthDays(month, year);
            } else {
                month -= 1;
                day = monthDays(month, year);
            }
        }
    } 

    @Override
    public String toString() {
        return String.format("%d-%d-%d", year, month, day);
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public int getWeekday() {
        int weekday = 0;
        int y = this.year;
        int m = this.month;
        int d = this.day;

        if (m == 1 || m == 2) {
            m += 12;
            y -= 1;
        }

        weekday = (d + 2*m + 3*(m+1)/5 + y + y/4 - y/100 + y/400) % 7;

        return weekday;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int i) {
        day = i;
    }

    public void setMonth(int i) {
        month = i;
    }

    public void setYear(int i) {
        year = i;
    }
    
}
