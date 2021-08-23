package pro.sky.java.course1.lesson2;

public class number2 {
    public static void main(String[] args) {
        int clientOS = 1;
        int clientDeviceYear = 2015;
        if (clientOS == 1 && clientDeviceYear < 2019) {
            System.out.println("Установите lite-версию приложения для Android по ссылке");
        } else {
            if (clientOS == 1 && clientDeviceYear >= 2019) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else if (clientOS == 0 && clientDeviceYear < 2019) {
                System.out.println("Установите lite-версию приложения для iOS по ссылке");
            } else if (clientOS == 0 && clientDeviceYear >= 2019) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("К сожалению вы не сможете установить приложение.");
            }
        }
    }
}
