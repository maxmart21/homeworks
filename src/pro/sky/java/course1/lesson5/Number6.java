package pro.sky.java.course1.lesson5;

import java.util.Arrays;

public class Number6 {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        int[] arr2 = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[arr.length - 1 - i];
        }
        System.out.println(Arrays.toString(arr2));
    }
}

