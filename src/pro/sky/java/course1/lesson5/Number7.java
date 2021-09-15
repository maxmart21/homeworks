package pro.sky.java.course1.lesson5;

import java.util.Arrays;

public class Number7 {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        int head = 0;
        int tail = arr.length - 1;
        while (head < tail) {
            int t = arr[head];
            arr[head] = arr[tail];
            arr[tail] = t;
            head++;
            tail--;
        }
        System.out.println(Arrays.toString(arr));
    }
}

