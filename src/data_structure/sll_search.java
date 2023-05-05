package data_structure;

import java.util.Scanner;

public class sll_search {

    Node head;
    public void insert(int data)
    {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
        }
        else {
            Node temp = head;
            head = newNode;
            head.next = temp;
        }
    }

    public void search(int x){

    }
    public void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        sll_search obj=new sll_search();
        System.out.println("Enter the number of nodes");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            obj.insert(sc.nextInt());
        }
        System.out.println("Enter the element to insert");
        int d = sc.nextInt();
        obj.search(d);
        obj.display();
    }
}
