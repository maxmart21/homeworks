package pro.sky.java.course1.lesson3;

public class Number4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 30; i++) {

            if (i % 3 == 0 && i % 5 != 0) {
                System.out.println("Ping");
            } else if (i % 5 == 0 && i % 3 != 0) {
                System.out.println("Pong");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Ping Pong");
            } else {
                System.out.println();
            }
        }
    }
}
