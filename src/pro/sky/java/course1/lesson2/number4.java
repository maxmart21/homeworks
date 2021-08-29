package pro.sky.java.course1.lesson2;

public class Number4 {
    public static void main(String[] args) {
        int deliveryDistance = 95;
        int minTime = 1;
        if (deliveryDistance > 20 && deliveryDistance < 60) {
            int timeForDelivery = minTime + 1;
            System.out.println("Доставка составит " + timeForDelivery + " дня");
        } else if (deliveryDistance >= 60) {
            int timeForDelivery = minTime + 2;
            System.out.println("Доставка составит " + timeForDelivery + " дня");
        } else {
            int timeForDelivery = minTime;
            System.out.println("Доставка составит " + timeForDelivery + " день");
        }
    }
}
