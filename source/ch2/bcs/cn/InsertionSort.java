package ch2.bcs.cn;

import java.util.Scanner;

public class InsertionSort {
    static int[] sort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            for (int j = i; j > 0 && a[j] < a[j - 1]; j--) {
                int t = a[j];
                a[j] = a[j-1];
                a[j-1] = t;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        array = sort(array);

        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
