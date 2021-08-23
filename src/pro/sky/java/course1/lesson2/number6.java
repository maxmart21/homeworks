package pro.sky.java.course1.lesson2;

public class number6 {
    public static void main(String[] args) {
        int age = 25;
        int salary = 49000;
        if (age >= 23 && salary >= 50000 && salary < 80000) {
            var limit = salary * 3 + salary * 1.2;
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + limit + " руб.");
        } else if (age < 23 && salary >= 50000 && salary < 80000) {
            var limit = salary * 2 + salary * 1.2;
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + limit + " руб.");
        } else if (age >= 23 && salary >= 80000) {
            var limit = salary * 3 + salary * 1.5;
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + limit + " руб.");
        } else if (age < 23 && salary >= 80000) {
            var limit = salary * 2 + salary * 1.5;
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + limit + " руб.");
        } else if (age >= 23 && salary < 50000) {
            var limit = salary * 3;
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + limit + " руб.");
        } else if (age < 23 && salary < 50000) {
            var limit = salary * 2;
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + limit + " руб.");
        }
    }
}
// Решение задачи мне не нравится, но я не смог придумать ничего более стоящего. Sorry. С номером семь я не справился.