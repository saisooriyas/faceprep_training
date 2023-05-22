package data_structure.algorithm;

import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {
    public static void sort(int[] arr, int bucketSize) {
        if (arr.length == 0) {
            return;
        }
        int minValue = arr[0];
        int maxValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
            } else if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        int bucketCount = (maxValue - minValue) / bucketSize + 1;
        ArrayList<ArrayList<Integer>> buckets = new ArrayList<>(bucketCount);
        for (int i = 0; i < bucketCount; i++) {
            buckets.add(new ArrayList<Integer>());
        }
        for (int j : arr) {
            int bucketIndex = (j - minValue) / bucketSize;
            buckets.get(bucketIndex).add(j);
        }
        int currentIndex = 0;
        for (int i = 0; i < bucketCount; i++) {
            ArrayList<Integer> bucket = buckets.get(i);
            Collections.sort(bucket);
            for (Integer integer : bucket) {
                arr[currentIndex] = integer;
                currentIndex++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {29, 25, 3, 49, 9, 37, 21, 43};
        BucketSort.sort(arr, 10);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
