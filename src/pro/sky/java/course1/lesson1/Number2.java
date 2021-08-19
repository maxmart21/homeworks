package pro.sky.java.course1.lesson1;

public class Number2 {
    public static void main(String[] args) {
        float firstBoxerWeight = 78.2f;
        float secondBoxerWeight = 82.7f;
        float bothWeight = firstBoxerWeight + secondBoxerWeight;
        float difference = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Общий вес бойцов " + bothWeight + " кг");
        System.out.println("Разница в весе " + difference + " кг");
    }
}
