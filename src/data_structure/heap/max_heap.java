package data_structure.heap;

import java.util.ArrayList;
import java.util.Scanner;

public class max_heap {

    public static void insert(int data, ArrayList<Integer> arr){
        arr.add(data);
        if(arr.size()>1){
            int curi = arr.size()-1;
            int p = p(curi);
            while(arr.get(p)<arr.get(curi)){
                int swap = arr.get(p);
                arr.set(p,arr.get(curi));
                arr.set(curi,swap);
                curi = p;
                p = p(p);
            }
        }
        System.out.println("Inserted");
    }

    private static int p(int curi) {
        return (curi-1)/2;
    }

    public static void delete(ArrayList<Integer> heap){
        if(heap.size() == 0){
            System.out.println("Heap is empty");
            return;
        }
        int i = heap.size()-1;
        heap.set(0, heap.get(i));
        heap.set(i, 0);
        heap.remove(i);
        int curi = 0;
        int l = 1;
        int r = 2;
        int size = heap.size();
        if(size-1 < r){
            if (size - 1 >= l) {
                if (heap.get(curi) < heap.get(l)) {
                    int swap = heap.get(curi);
                    heap.set(curi, heap.get(l));
                    heap.set(l, swap);
                }
            }
            System.out.println("Deleted");
            return;
        }
        while(heap.get(curi)<heap.get(l) || heap.get(curi)<heap.get(r)){
            if(heap.get(l)>heap.get(r)){
                int swap = heap.get(curi);
                heap.set(curi,heap.get(l));
                heap.set(l,swap);
                curi = l;
            }
            else{
                int swap = heap.get(curi);
                heap.set(curi,heap.get(r));
                heap.set(r,swap);
                curi = r;
            }
            l = 2*curi+1;
            r = 2*curi+2;
            if(l >= size || r >= size) {
                if(! (l>=size)){
                    if(heap.get(curi)<heap.get(l)){
                        int swap = heap.get(curi);
                        heap.set(curi,heap.get(l));
                        heap.set(l,swap);
                    }
                }
                break;
            }
        }
        System.out.println("Deleted");
    }

    public static void size(ArrayList<Integer> heap){
        System.out.println("Size of heap is: "+heap.size());
    }


    public static void display(ArrayList<Integer> heap){
        if(heap.size() == 0)
            System.out.println("Heap is empty");
        else{
            for (int j : heap) {
                System.out.print(j + " ");
            }
        }
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of the heap: ");
        ArrayList<Integer> arr = new ArrayList<>();
        int ch;
        do{
            System.out.println("\n1. Insert\n2.Delete\n3. Display\n0. Exit");
            System.out.print("Enter your choice: ");
            ch = s.nextInt();
            switch (ch){
                case 1:
                    System.out.print("Enter the element to insert: ");
                    int val = s.nextInt();
                    insert(val,arr);
                    break;
                case 2:
                    delete(arr);
                    break;
                case 3:
                    display(arr);
                    break;
                case 4:
                    size(arr);
            }
        }while(ch!=0);
    }
}
