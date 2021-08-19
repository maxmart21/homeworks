package pro.sky.java.course1.lesson1;

public class Number6 {
    public static void main(String[] args) {
        byte a = 12;
        byte b = 27;
        byte c = 44;
        byte d = 15;
        byte e = 9;
        int result = a * (b + (c - d * e));
        int finalResult = -1 * result;
        System.out.println("Ответ " + finalResult);
    }
}
