package data_structure.queue;

import java.util.Scanner;

public class queue_arr {

    static int front, rear, capacity;
    static int[] arr;
    public queue_arr(int size) {
        front = rear = 0;
        capacity = size;
        arr = new int[size];
    }

    public void queue_enq(int d){
        if(capacity == rear){
            System.out.println("\nFull");
        }
        else{
            arr[rear] = d;
            rear++;
            System.out.println("\nElement is inserted.");
        }
    }

    public void queue_deq(){
        if(front == rear){
            System.out.println("\nEmpty");
        }
        else{
            for(int i=0;i<rear-1;i++){
                arr[i] = arr[i+1];
            }
            if(rear<capacity){
                arr[rear] = 0;
            }
            System.out.println("element is deleted");
            rear--;
        }
    }

    public void queueDisplay()
    {
        int i;
        if (front == rear) {
            System.out.println("\nQueue is Empty\n");
            return;
        }
        for (i = front; i < rear; i++) {
            System.out.printf(arr[i]+" ");
        }
        return;
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of queue");
        int size = s.nextInt();
        queue_arr obj = new queue_arr(size);
        int ch,num;
        do{
           System.out.println("\n1.Enqueue\n2.Dequeue\n3.Display\n0.Exit");
           System.out.println("\nEnter your choice");
           ch = s.nextInt();
           switch (ch){
               case 1:
                   System.out.println("Enter the element to insert");
                   num = s.nextInt();
                   obj.queue_enq(num);
                   break;
               case 2:
                   obj.queue_deq();
                   break;
               case 3:
                   obj.queueDisplay();
                   break;
           }
        }while(ch != 0);
    }
}
