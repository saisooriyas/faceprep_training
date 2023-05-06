package data_structure;

import java.util.Scanner;

class DNode
{
    int data;
    DNode next,prev;
    DNode(int d)
    {
        data=d;
        next=null;
        prev = null;
    }
}
public class dll {

    DNode head,tail;
    public void insert(int d){
        DNode n = new DNode(d);
        if(head==null)
            head = tail = n;
        else{
            DNode temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            n.prev = temp;
            temp.next = n;
            tail = n;
        }
    }

    public void insert_f(int d){
        DNode n = new DNode(d);
        if(head == null){
            head = tail = n;
        }
        else{
            n.next = head;
            head.prev = n;
            head = n;
        }
    }

    public void insert_pos(int d, int pos){

        DNode node = new DNode(d);
        if(pos == 0)
        {
            insert_f(d);
        }
        else
        {
            DNode n = head;
            for(int i = 1; i < pos - 1; i++)
                n = n.next;
            node.next = n.next;
            n.next.prev = node;
            n.next = node;
            node.prev = n;
        }
    }

    public void delete(){
        if(tail == null){
            System.out.println("Empty list");
            return;
        }if(tail.prev == null){
            tail = null;
        }
        else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    public void delete_f(){
        if(head == null){
            System.out.println("Empty list");
            return;
        }
        head.next.prev = null;
        head = head.next;
    }

    public void delete_pos(int pos){
        if(pos == 1){
            delete_f();
            return;
        }
        DNode temp = head;
        for(int i=1;i<pos;i++){
            temp = temp.next;
        }
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
        temp = null;
    }

    public void delete_ele(int num){
        DNode temp=head;
        int flag = 1;
        while(temp!=null)
        {
            if(temp.data==num)
            {
                flag = 0;
                if(temp==head)
                {
                    head=temp.next;
                    temp.next.prev=null;
                }
                else if(temp.next==null)
                {
                    temp.prev.next=null;
                }
                else
                {
                    temp.prev.next=temp.next;
                    temp.next.prev=temp.prev;
                }
                System.out.println("Element deleted");
            }
            temp=temp.next;
        }
        if(flag == 0)
            System.out.println("Element not deleted");
    }

    public void search(int num){
        DNode temp = head;
        int i = 1;
        while(temp != null){
            if(temp.data == num){
                System.out.println("Element found at index "+i);
                return;
            }
            i++;
            temp =temp.next;
        }
        System.out.println("Element not found");
    }
    public void display(){
        DNode temp = head;
        while(temp!=null){
            if(temp.next == null){
                System.out.print(temp.data);
            }
            else{
                System.out.print(temp.data+"->");
            }
            temp = temp.next;
        }
    }
    public void count()
    {
        int count = 0;
        DNode temp=head;
        while(temp!=null)
        {
            temp=temp.next;
            count++;
        }
        System.out.println(count);
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        dll dl = new dll();
        int n = 0;
        /*System.out.println("Enter data (-ve value to stop)");
        while(n >=0){
            n = s.nextInt();
            if(n>=0)
                dl.insert(n);
        }*/
        int ch = 1,num,loc;
        while(ch != 0){
            System.out.println("\n1.Insert last \n2.Insert first\n3.Insert at position\n4.Delete Last\n5.Delete first\n6.Delete at position\n7.Delete by element\n8.Search element\n9.Print elements\n10.Count\n0.Exit");
            System.out.println("\nEnter your choice:");
            ch = s.nextInt();
            switch (ch){
                case 1:
                    System.out.println("Enter the element to insert:");
                    num = s.nextInt();
                    dl.insert(num);
                    System.out.println("Element inserted");
                    break;
                case 2:
                    System.out.println("Enter the element to insert:");
                    num = s.nextInt();
                    dl.insert_f(num);
                    System.out.println("Element inserted");
                    break;
                case 3:
                    System.out.println("Enter the element to  insert");
                    num = s.nextInt();
                    System.out.println("Enter the location");
                    loc = s.nextInt();
                    dl.insert_pos(num,loc);
                    System.out.println("Element inserted");
                    break;
                case 4:
                    dl.delete();
                    System.out.println("Element deleted");
                    break;
                case 5:
                    dl.delete_f();
                    System.out.println("Element deleted");
                    break;
                case 6:
                    System.out.println("Enter position:");
                    loc = s.nextInt();
                    dl.delete_pos(loc);
                    System.out.println("Element deleted");
                    break;
                case 7:
                    System.out.println("Enter element to be deleted:");
                    num = s.nextInt();
                    dl.delete_ele(num);
                    break;
                case 8:
                    System.out.println("Enter element to be searched:");
                    num = s.nextInt();
                    dl.search(num);
                    break;
                case 9:
                    dl.display();
                    break;
                case 10:
                    dl.count();
            }
        }
    }
}
