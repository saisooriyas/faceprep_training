package Hacker_rank;

import java.util.Scanner;

public class Palindrome {
    Node head;
    public void insert(int d)
    {
        Node n= new Node(d);
        if(head==null)
        {
            head=n;
        }
        else
        {
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=n;
        }
    }

    Node reverse(){

        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
    public void display(Node temp)
    {
        Node n = head;
        int temp1;
        int temp2;
        while(temp!=null)
        {
            temp1 = temp.data;
            temp2 = n.data;
            System.out.println(temp1+" "+temp2);
            if(temp.data != n.data){
                System.out.println("false");
                return;
            }
            temp=temp.next;
            n = n.next;
        }
        System.out.println("true");
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Palindrome sr = new Palindrome();
        int n,count=0;
        do{
            n = s.nextInt();
            if(n != -1){
                sr.insert(n);
                count++;
            }
        }while(n!=-1);
        sr.display(sr.reverse());
    }
}
