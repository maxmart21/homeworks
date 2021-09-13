package pro.sky.java.course1.lesson6;

import java.util.Locale;

public class Number6 {
    public static void main(String[] args) {
        String fullName = "ivanov ivan ivanovich";
        String result1 = fullName.substring(0, 1).toUpperCase(Locale.ROOT) + fullName.substring(1, 6);
        String result2 = result1 + fullName.substring(6, 8).toUpperCase(Locale.ROOT) + fullName.substring(8, 11);
        String result3 = result2 + fullName.substring(11, 13).toUpperCase(Locale.ROOT) + fullName.substring(13, 21);
        System.out.println("Верное написание ФИО сотрудника с заглавных букв –  " + result3);
    }
}
