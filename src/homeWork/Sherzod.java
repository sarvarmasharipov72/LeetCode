package homeWork;

import java.util.Scanner;

public class Sherzod {
    public static void main(String[] args) {
        System.out.println("matrix ustun va satr kiriting");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int cnt = in.nextInt();
                matrix[i][j] = cnt;
            }
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            max += Math.pow(matrix[i][i], 2);
        }


        System.out.println("dioganal kvadrat yig'indisi " + max);
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += matrix[i][0];
        }
        System.out.println("ustun elementlarini yig'indisi " + sum);

    }
}
