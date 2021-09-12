package pro.sky.java.course1.lesson5;

import java.util.Arrays;

public class Number6 {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        int[] arr2 = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr2.length; i++) {
            arr[i] = arr2[i];
            System.out.println(Arrays.toString(arr));
        }
    }
}
// Не придумал другого решения. Это решение неверное скорее всего. Жду подсказки)
