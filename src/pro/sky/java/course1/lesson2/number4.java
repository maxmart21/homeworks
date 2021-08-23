package pro.sky.java.course1.lesson2;

public class number4 {
    public static void main(String[] args) {
        int deliveryDistance = 95;
        if (deliveryDistance < 20) {
            System.out.println("Доставка составит 1 день");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Доставка составит 2 дня");
        } else {
            System.out.println("Доставка составит 3 дня");
        }
    }
}
