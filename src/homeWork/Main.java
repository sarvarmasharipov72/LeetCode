package homeWork;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        System.out.println("satr va ustunlar sonini kiriting");
        int n = in.nextInt(), m = in.nextInt();
        int[][] matrix = new int[n][m];
        System.out.println("matrisa elementlarini kiriting");
        // matrisani elementlarini o'qib oladi
        // matrisani satrlarini indexsiga javob beradi
        for (int i = 0; i < n; i++) {
            // matrisani ustunlariga indexsiga javob beradi
            for (int j = 0; j < m; j++) {
                //matrisani[i][j] ga qiymatni o'qib oladi
                matrix[i][j] = in.nextInt();
            }
        }
        // satrlar bo'yicha minimumini hisoblash uchun sikl orqali eng katta qiymatni k ga yozib oladi
        int k = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                //matrisani[
                if (k > matrix[i][j]) {
                    k = matrix[i][j];
                }
            }
        }
        System.out.print("satrlar bo'yicha minimumi " + k);
        // ustunlar bo'yicha maksimumini hisoblash uchun sikl orqali eng katta qiymatni l ga yozib oladi
        int l = Integer.MIN_VALUE;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (l < matrix[j][i]) {
                    l = matrix[j][i];
                }
            }
        }
        System.out.println("\nustun bo'yicha maksimumi " + l);
        //o'rtacha qiymat
        int sum = 0;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sum += matrix[i][j];
                cnt++;
            }
        }

        System.out.println("o'rtacha qiymat" + sum * 1.0 / cnt);

    }
}
//Lab 1
//System.out.println("matrix eni va bo'yini kiriting");
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int m = in.nextInt();
//        int length = 0;
//        int[][] matrix = new int[n][m];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                int cnt = in.nextInt();
//                matrix[i][j] = cnt;
//                if (cnt % 2 == 0) {
//                    length++;
//                }
//            }
//        }
//        int max = 0;
//        int sum = 0;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                if (matrix[i][j] % 2 == 0) {
//                    if (max < matrix[i][j]) {
//                        max = matrix[i][j];
//                    }
//                }
//                sum += matrix[i][j];
//            }
//        }
//        System.out.println(sum * 1.0/max);
