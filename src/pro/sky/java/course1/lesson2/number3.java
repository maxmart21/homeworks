package pro.sky.java.course1.lesson2;

public class number3 {
    public static void main(String[] args) {
        int year = 2021;
        if (year % 4 != 0 || year % 100 == 0 && year % 400 != 0) {
            System.out.println("Год является обычным");
        } else System.out.println("Год является високосным");
    }
}
