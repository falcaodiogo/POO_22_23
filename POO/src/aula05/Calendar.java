package aula05;

public class Calendar {
    
    private int weekday;
    private DateYMD date;
    private static int month;
    private int year;
    private int dia;
    private int days;

    public Calendar(int weekday, DateYMD date) {
        this.weekday = weekday;
        this.date = date;
        Calendar.month = date.getMonth();
        this.year = date.getYear();
        this.dia = getFirstWeekday();
        this.days = monthDays(month, year);
    }

    public Calendar(int dia2, aula06.DateYMD date2) {
    }

    public static boolean validMonth(int mes) {
        if (mes < 1 || mes > 12) {
            System.out.println("Mês inválido! Tente novamente.");
            return false;
        }
        return true;
    }

    public static boolean validYear(int year) {
        if (year < 1000 || year > 9999) {
            System.out.println("Ano inválido! Tente novamente.");
            return false;
        }
        return true;
    }

    public static int monthDays(int mes, int ano) {
        int days = 0;
        switch(mes) {
            case 1:
                days = 31;
                break;
            case 2:
                if (isLeapYear(ano)) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
            case 3:
                days = 31;
                break;
            case 4:
                days = 30;
                break;
            case 5:
                days = 31;
                break;
            case 6:
                days = 30;
                break;
            case 7:
                days = 31;
                break;
            case 8:
                days = 31;
                break;
            case 9:
                days = 30;
                break;
            case 10:
                days = 31;
                break;
            case 11:
                days = 30;
                break;
            case 12:
                days = 31;
                break;
            default:
                break;
        }
        return days;
    }

    public static boolean validWeekDay(int w) {
        if (w > 7 || w < 1) {
            return false;
        }
        return true;
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
    
    public static boolean validDate(int d, int m, int y, int w) {
        if (d <= monthDays(m, y) && validMonth(m) && validYear(y) && validWeekDay(w)) {
            return true;
        }
        return false;
    }

    public int getFirstWeekday() {
        DateYMD firstDay = new DateYMD(year, month, 1);
        return firstDay.getWeekday();
    }

    public static String getMonthName() {
        String mes = "";
        switch(month) {
            case 1:
                mes = "January";
                break;
            case 2:
                mes = "February";
                break;
            case 3:
                mes = "March";
                break;
            case 4:
                mes = "April";
                break;
            case 5:
                mes = "May";
                break;
            case 6:
                mes = "June";
                break;
            case 7:
                mes = "July";
                break;
            case 8:
                mes = "August";
                break;
            case 9:
                mes = "September";
                break;
            case 10:
                mes = "October";
                break;
            case 11:
                mes = "November";
                break;
            case 12:
                mes = "December";
                break;
            default:
                break;
        }
        return mes;
    }

    @Override
    public String toString() {
        System.out.printf("%29s %d\n", "", year);
        System.out.printf("%33s\n", getMonthName());
        System.out.printf(" %3s %3s %3s %3s %3s %3s %3s\n", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
        for (int i = 1; i < getFirstWeekday(); i++) {
            System.out.printf("%3s", "");
        }
        for (int i = 1; i <= monthDays(month, year); i++) {
            System.out.printf("%3d", i);
            if (dia % 7 == 0) {
                System.out.println();
            }
            dia++;
        }
        return "";
    }

	public void printCalendarMonth() {

	}

    public void incrementData() {
        if (date.getDay() < monthDays(month, year)) {
            date.setDay(date.getDay() + 1);
        } else {
            date.setDay(1);
            if (date.getMonth() < 12) {
                date.setMonth(date.getMonth() + 1);
            } else {
                date.setMonth(1);
                date.setYear(date.getYear() + 1);
            }
        }
    }

    public int getWeekday() {
        return weekday;
    }

    public int getDays() {
        return days;
    }
}
