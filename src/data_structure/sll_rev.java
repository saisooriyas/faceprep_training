package data_structure;

import java.util.Scanner;

public class sll_rev {
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
        while(temp!=null)
        {
            if(temp.next == null)
                System.out.print(temp.data);
            else
                System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        sll_rev sr = new sll_rev();
        System.out.println("Enter number of nodes:");
        int n = s.nextInt();
        for(int i=0;i<n;i++){
            sr.insert(s.nextInt());
        }
        sr.display(sr.reverse());
    }
}
