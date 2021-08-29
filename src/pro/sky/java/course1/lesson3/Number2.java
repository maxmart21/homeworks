package pro.sky.java.course1.lesson3;

public class Number2 {
    public static void main(String[] args) {
        int daysInMonth = 31;
        for (int today = 5; today <= daysInMonth; today = today + 7) {
            System.out.println("Сегодня пятница, " + today + "-ое число. Необходимо подготовить отчет.");
        }
    }
}
