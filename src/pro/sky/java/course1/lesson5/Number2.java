package pro.sky.java.course1.lesson5;

public class Number2 {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        int maxWaste = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxWaste) {
                maxWaste = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + maxWaste + " рублей");
        int minWaste = 1_000_000;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minWaste) {
                minWaste = arr[i];
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + minWaste + " рублей");
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}
