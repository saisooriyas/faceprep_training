package data_structure.algorithm;

import java.util.Arrays;

public class CountingSort {
    public static void sort(int[] arr) {
        int max = getMax(arr);
        int[] count = new int[max+1];

        for (int k : arr) {
            count[k]++;
        }

        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j++] = i;
                count[i]--;
            }
        }
    }

    public static int getMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 2, 10, 2, 5, 1 };
        CountingSort.sort(arr);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
