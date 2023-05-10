package data_structure.queue;

import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
public class queue_ll {
    Node head,rear;

    public void enq(int d){
        Node n = new Node(d);
        if (head == null)
            head = n;
        else
            rear.next = n;

        rear = n;
        rear.next = head;
    }

    public void deQueue()
    {
        if (head == null) {
            System.out.println("Queue is empty");
        }
        else {
            int value;
            if (head == rear) {
                value = head.data;
                head = null;
                rear = null;
            } else {
                Node temp = head;
                value = temp.data;
                head = head.next;
                rear.next = head;
            }
            System.out.println(value);
        }
    }

    public void display(){
        if(head == null){
            System.out.println("\nEmpty");
        }
        else{
            Node temp = head;
            do{
                System.out.print(temp.data+" ");
                temp = temp.next;
            }while(temp!=head);
        }
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        queue_ll  obj = new queue_ll();
        int ch,num;
        do{
            System.out.println("\n1.Enqueue\n2.Dequeue\n3.Display\n0.Exit");
            System.out.println("\nEnter your choice:");
            ch = s.nextInt();
            switch (ch){
                case 1:
                    System.out.println("\nEnter the element to be inserted:");
                    num = s.nextInt();
                    obj.enq(num);
                    break;
                case 2:
                    obj.deQueue();
                    break;
                case 3:
                    obj.display();
                    break;
            }
        }while(ch != 0);
    }
}
