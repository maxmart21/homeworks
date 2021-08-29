package pro.sky.java.course1.lesson3;

public class Number3 {
    public static void main(String[] args) {
        int nowadays = 2021;
        int minYear = nowadays - 200;
        int maxYear = nowadays + 100;
        for (int year = minYear; year <= maxYear; year = minYear++) {
            if (year % 79 == 0) {
                System.out.println(year + " год");
            }
        }

    }
}
