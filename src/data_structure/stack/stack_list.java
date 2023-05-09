package data_structure.stack;

import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int d){
        data = d;
        next = null;
    }
}
public class stack_list{
    Node head;

    public void push(int data){
        Node n = new Node(data);
        if(head == null){
            head = n;
        }
        else{
            Node temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = n;
        }
        System.out.println("Element is inserted;");
    }
    public void pop(){
        if(head == null){
            System.out.println("Stack is empty");
        }
        else{
            Node temp = head;
            if(temp.next!=null){
                while(temp.next.next!=null){
                    temp = temp.next;
                }
                System.out.println("Popped element is "+temp.next.data);
                temp.next = null;
            }
            else{
                System.out.println("Popped element is "+temp.data);
                head = null;
            }
        }
    }
    public void isEmpty(){
        if(head == null){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("Stack is not empty");
        }
    }
    public void isFull(){
        System.out.println("Stack is never full");
    }
    public void display(){
        if(head == null){
            System.out.println("Stack is empty");
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        stack_list obj = new stack_list();
        int num,data;
        do{
            System.out.println("\n1. Push\n2. Pop\n3. IsEmpty\n4. IsFull\n5. Display\n0. Exit");
            System.out.println("Enter the choice:");
            num = s.nextInt();
            switch (num){
                case 1:
                    System.out.println("Enter the element to be pushed:");
                    data = s.nextInt();
                    obj.push(data);
                    break;
                case 2:
                    obj.pop();
                    break;
                case 3:
                    obj.isEmpty();
                    break;
                case 4:
                    obj.isFull();
                    break;
                case 5:
                    obj.display();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while(num != 0);
    }
}
