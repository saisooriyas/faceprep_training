package data_structure.queue;

import java.util.Scanner;
//priority of the value is based on the value which is greater.
public class priority_arr {
    static int front = -1;
    static int rear = -1;
    static int size;
    static int[] arr;
    public static void insert(int d){
        if(rear == size-1){
            System.out.println("Queue is full");
        }
        else{
            if(front == -1){
                front = 0;
            }
            rear++;
            arr[rear] = d;
            //try to insert by pushing lesser values to right
            for(int i = front;i<rear;i++){
                for(int j = i+1;j<=rear;j++){
                    if(arr[i]<arr[j]){
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            System.out.println("Element inserted");
        }
    }
    public static void delete(){
        if(front == -1 || front>rear){
            System.out.println("Queue is empty");
        }
        else{
            System.out.println("Element deleted:"+arr[front]);
            front++;
        }
    }
    public static void display(){
        if(front == -1 || front>rear){
            System.out.println("Queue is empty");
        }
        else{
            System.out.println("Queue:");
            for(int i = front;i<=rear;i++){
                System.out.print(arr[i]+" ");
            }
        }
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Queue size:");
        size = s.nextInt();
        arr = new int[size];
        int ch;
        do{
            System.out.println("\n1.Insert\n2.Delete\n3.Display\n0.Exit");
            ch = s.nextInt();
            switch (ch){
                case 1:
                    System.out.println("Enter element to insert:");
                    int d = s.nextInt();
                    insert(d);
                    break;
                case 2:
                    delete();
                    break;
                case 3:
                    display();
                    break;
            }
        }while (ch!=0);
    }
}
