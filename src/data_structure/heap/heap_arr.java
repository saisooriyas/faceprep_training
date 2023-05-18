package data_structure.heap;

import java.util.Scanner;

public class heap_arr {
    private int[] heap;
    private int size;
    private int capacity;

    public heap_arr(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.heap = new int[capacity];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    public void insert(int data) {
        if (size == capacity) {
            System.out.println("Heap is full. Cannot insert more elements.");
            return;
        }

        heap[size] = data;
        heapifyUp(size);
        size++;
        System.out.println("Inserted");
    }

    public void delete() {
        if (size == 0) {
            System.out.println("Heap is empty. Cannot delete.");
            return;
        }

        int deletedElement = heap[0];
        heap[0] = heap[size - 1];
        size--;
        heapifyDown(0);
        System.out.println("Deleted: " + deletedElement);
    }

    private void heapifyUp(int index) {
        int parent = (index - 1) / 2;

        while (index > 0 && heap[index] > heap[parent]) {
            swap(index, parent);
            index = parent;
            parent = (index - 1) / 2;
        }
    }

    private void heapifyDown(int index) {
        int largest = index;
        int leftChild = 2 * index + 1;
        int rightChild = 2 * index + 2;

        if (leftChild < size && heap[leftChild] > heap[largest]) {
            largest = leftChild;
        }

        if (rightChild < size && heap[rightChild] > heap[largest]) {
            largest = rightChild;
        }

        if (largest != index) {
            swap(index, largest);
            heapifyDown(largest);
        }
    }

    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    public void display() {
        if (size == 0) {
            System.out.println("Heap is empty.");
            return;
        }

        for (int i = 0; i < size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the heap: ");
        int capacity = scanner.nextInt();

        heap_arr maxHeap = new heap_arr(capacity);

        int choice;
        do {
            System.out.println("\n1. Insert\n2. Delete\n3. Display\n0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to insert: ");
                    int element = scanner.nextInt();
                    maxHeap.insert(element);
                    break;
                case 2:
                    maxHeap.delete();
                    break;
                case 3:
                    maxHeap.display();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);

        scanner.close();
    }
}

