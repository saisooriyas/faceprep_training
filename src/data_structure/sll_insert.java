package data_structure;

import java.util.*;
class Node
{
    int data;
    Node next;
    Node(int d)
    {
        data=d;
        next=null;
    }
}
class sll_insert
{
    Node head;
    public void insert(int d)
    {
        Node n=new Node(d);
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

    public void insert_fir(int data){
        Node a = new Node(data);
        a.next = head;
        head = a;
    }

    public void insert_po(int data, int loc, int n){
        if(loc<n){
            Node a=new Node(data);
            if(loc==1)
            {
                a.next=head;
                head=a;
            }
            else
            {
                Node temp=head;
                for(int i=1;i<loc-1;i++)
                {
                    temp=temp.next;
                }
                a.next=temp.next;
                temp.next=a;
            }
        }
    }

    public void search(int data){
        Node a = head;
        int i = 1;
        while(a!=null){
            if(a.data == data){
                System.out.println("Element found at "+i);
                return;
            }
            a = a.next;
            i++;
        }
        System.out.println("Element not found");
    }
    public void delete()
    {
        Node temp=head;
        while(temp.next.next!=null)
        {
            temp=temp.next;
        }
        temp.next=null;
    }

    public void delete_fir()
    {
        if(head==null)
        {
            System.out.println("List is empty");
        }
        else
        {
            head=head.next;
        }
    }
    public void delete_pos(int pos)
    {
        Node temp=head;
        if(pos==0)
        {
            head=temp.next;
        }
        else
        {
            for(int i=1;i<pos-1;i++)
            {
                temp=temp.next;
            }
            temp.next=temp.next.next;
        }
    }
    public void display()
    {
        Node temp=head;
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

    public void count()
    {
        int count = 0;
        Node temp=head;
        while(temp!=null)
        {
            temp=temp.next;
            count++;
        }
        System.out.println(count);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        sll_insert obj=new sll_insert();
        System.out.println("Enter the number of nodes");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            obj.insert(sc.nextInt());
        }

        int ch = 1;
        while(ch != 0) {
            System.out.println("\n1.Insert last \n2.Insert first\n3.Insert at position\n4.Delete Last\n5.Delete first\n6.Delete at position\n7.Search element\n8.Print elements\n9.Count\n0.Exit");
            System.out.println("\nEnter choice:");
            ch = sc.nextInt();
            int d;
            switch (ch) {
                case 1 :
                    System.out.println("Enter the element to insert");
                    d = sc.nextInt();
                    obj.insert(d);
                    System.out.println("Element inserted");
                    break;
                case 2 :
                    System.out.println("Enter the element to insert");
                    d = sc.nextInt();
                    obj.insert_fir(d);
                    System.out.println("Element inserted");
                    break;
                case 3 :
                    System.out.println("Enter the element to insert");
                    d = sc.nextInt();
                    System.out.println("Enter the location:");
                    int loc = sc.nextInt();
                    obj.insert_po(d, loc, n);
                    System.out.println("Element inserted");
                    break;
                case 4:
                    obj.delete();
                    System.out.println("Element deleted");
                    break;
                case 5:
                    obj.delete_fir();
                    System.out.println("Element deleted");
                    break;
                case 6:
                    System.out.println("Enter position to delete");
                    int pos = sc.nextInt();
                    obj.delete_pos(pos);
                    System.out.println("Element deleted");
                    break;
                case 7 :
                    System.out.println("Enter the element to search");
                    d = sc.nextInt();
                    obj.search(d);
                    break;
                case 8 :
                    obj.display();
                    break;
                case 9 :
                    obj.count();
            }
        }
    }
}