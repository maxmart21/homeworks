package pro.sky.java.course1.lesson3;

public class Number6 {
    public static void main(String[] args) {
        int age = 19;
        int salary = 58000;
        if (age >= 23) {
            if (salary >= 50000 && salary < 80000) {
                float limit = salary * 1.2f * 3;
                System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + limit + " руб.");
            } else if (salary >= 80000) {
                float limit = salary * 1.5f * 3;
                System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + limit + " руб.");
            } else {
                float limit = salary * 3;
                System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + limit + " руб.");
            }
        } else {
            if (salary >= 50000 && salary < 80000) {
                float limit = salary * 1.2f * 2;
                System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + limit + " руб.");
            } else if (salary >= 80000) {
                float limit = salary * 1.5f * 2;
                System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + limit + " руб.");
            } else {
                float limit = salary * 2;
                System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + limit + " руб.");
            }
        }
    }
}
// Постарался исправить, if-elseif стало меньше, но мне кажется особого успеха у меня нет. Все также некрасиво