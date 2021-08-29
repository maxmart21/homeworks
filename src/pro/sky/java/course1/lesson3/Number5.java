package pro.sky.java.course1.lesson3;

public class Number5 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c;
        System.out.println(a);
        System.out.println(b);
        for (int i = 3; i <= 10; i++) {
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }
}


