package pro.sky.java.course1.lesson5;

import java.util.Arrays;

public class Number8 {
    public static void main(String[] args) {
        int[] arr = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] + arr[i + 1] == -2) {
                System.out.println(arr[i]);
                System.out.println(arr[i + 1]);
            }
        }
    }
}
// Код не работает, но я не вижу проблему. Сдаю это дз таким сырым, потому что к сожалению больше нет времени над ним работать, необходимо приступить к следующему дз.

