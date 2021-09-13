package pro.sky.java.course1.lesson6;

public class Number7 {
    public static void main(String[] args) {
        String a = "135";
        String b = "246";
        StringBuilder newA = new StringBuilder(a);
        StringBuilder newB = new StringBuilder(b);
        newA.append(newB);
        newA.setCharAt(1, '2');
        newA.setCharAt(2, '3');
        newA.setCharAt(3, '4');
        newA.setCharAt(4, '5');
        newA.setCharAt(5, '6');
        System.out.println(newA);
    }
}
