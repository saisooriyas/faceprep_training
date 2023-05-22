package data_structure.algorithm;

import java.util.Scanner;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class lcu {
    static void lru(int[] arr, int n, int c) {
        Queue<Integer> q = new LinkedList<>();
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (q.size() < c) {
                if (!map.containsKey(arr[i])) {
                    q.add(arr[i]);
                    map.put(arr[i], true);
                } else {
                    q.remove(arr[i]);
                    q.add(arr[i]);
                }
            } else {
                if (!map.containsKey(arr[i])) {
                    int temp = q.poll();
                    map.remove(temp);
                    q.add(arr[i]);
                    map.put(arr[i], true);
                } else {
                    q.remove(arr[i]);
                    q.add(arr[i]);
                }
            }
        }
        while (!q.isEmpty()) {
            System.out.print(q.poll() + " ");
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int c = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        lru(arr, n, c);
    }
}
    /*private Queue<Integer> queue;
    private HashMap<Integer, Integer> map;
    private final int maxCapacity;

    public lcu(int capacity) {
        this.maxCapacity = capacity;
        queue = new LinkedList<Integer>();
        map = new HashMap<Integer, Integer>();
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            queue.remove(key);
            queue.add(key);
            return map.get(key);
        }
        return -1;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            queue.remove(key);
        } else {
            if (map.size() == maxCapacity) {
                int leastUsedKey = queue.poll();
                map.remove(leastUsedKey);
            }
        }
        queue.add(key);
        map.put(key, value);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int capacity = s.nextInt();
        lcu cache = new lcu(capacity);
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            String command = s.next();
            if (command.equals("get")) {
                int key = s.nextInt();
                System.out.println(cache.get(key));
            } else if (command.equals("put")) {
                int key = s.nextInt();
                int value = s.nextInt();
                cache.put(key, value);
            }
        }
        s.close();
    }*/
