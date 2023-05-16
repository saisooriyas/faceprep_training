package data_structure.queue;

import java.util.Queue;
import java.util.Scanner;

class Que{
    int data;
    int priority;
    Que next;
    Que(int d, int pri){
        data = d;
        priority = pri;
        next = null;
    }
}
public class priority_que {

    static Que head;
    public static void insert(int d,int pri){
        Que n = new Que(d,pri);
        if(head == null){
            head = n;
        }
        else{
            Que temp = head;
            if(n.priority>temp.priority){
                n.next = head;
                head = n;
            }
            else{
                while(temp.next!=null){
                    if(temp.next.priority < n.priority){
                        n.next = temp.next;
                        temp.next = n;
                        return;
                    }
                    temp = temp.next;
                }
                temp.next = n;
            }
        }
    }

    public static void delete(){
        if(head == null){
            System.out.println("Queue is empty");
        }
        else{
            head = head.next;
        }
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int ch;
        do{
            System.out.println("\n1.Insert\n2.Delete\n3.Display\n0.Exit");
            ch = s.nextInt();
            switch (ch){
                case 1:
                    System.out.println("Enter element to insert:");
                    int d = s.nextInt();
                    System.out.println("Enter element priority:");
                    int pri = s.nextInt();
                    insert(d,pri);
                    break;
                case 2:
                    delete();
                    break;
                case 3:
                    Que temp = head;
                    if(temp == null){
                        System.out.println("Queue is empty");
                    }
                    while(temp!=null){
                        System.out.print(temp.data+" ");
                        temp = temp.next;
                    }
            }
        }while(ch!=0);
    }
}
