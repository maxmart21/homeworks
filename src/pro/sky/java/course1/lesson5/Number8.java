package pro.sky.java.course1.lesson5;

public class Number8 {
    public static void main(String[] args) {
        int[] arr = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int b = i + 1; b < arr.length; b++) {
                if (arr[i] + arr[b] == -2) {
                    System.out.println(arr[i] + " " + arr[b]);
                }
            }
        }
    }
}


