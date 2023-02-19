// enum declaration 
enum DayOfWeek {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}

public class Main {
    public static void main(String[] args) {
        for (DayOfWeek day : DayOfWeek.values()) {
            System.out.println(day);
        }
    }
}

/*
// enum currency declaration
enum Currency {
    USD, EUR, GBP, RUB, UAH, KZT, CAD, JPY, CNY;
}

*/
