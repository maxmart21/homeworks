package pro.sky.java.course1.lesson5;

public class Number5 {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == 0 && j == 1 || i == 1 && j == 0 || i == 2 && j == 1 || i == 1 && j == 2) {
                    arr[i][j] = 0;
                } else arr[i][j] = 1;
            }
        }
        {
            for (int[] row : arr) {
                for (int column : row) {
                    System.out.print(column + " ");
                }
                System.out.println();
            }
        }
    }
}
