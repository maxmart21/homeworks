package pro.sky.java.course1.lesson2;

public class number1 {
    public static void main(String[] args) {
        int clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else {
            System.out.println("Извините, Ваша ОС не подходит для скачивания.");
        }
    }
}
