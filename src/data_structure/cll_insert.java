package data_structure;

import java.util.Scanner;

class CNode{
    int data;
    CNode next,prev;
    CNode(int d){
        data = d;
        next = null;
        prev = null;
    }
}
public class cll_insert {
    CNode head,tail;
    public void insert(int d){
        CNode n = new CNode(d);
        if(head==null) {
            head = tail = n;
            n.next = head;
            n.prev = tail;
        }
        else{
            tail.next = n;
            n.prev = tail;
            tail = n;
            tail.next = head;
            head.prev = tail;
        }
    }
    
    public void insert_f(int d){
        CNode n = new CNode(d);
        if(head == null){
            head = tail = n;
            n.next = head;
            n.prev = tail;
        }
        else {
            n.next = head;
            n.prev = tail;
            head.prev = n;
            tail.next = n;
            head = n;
        }
    }

    public void insert_pos(int d,int pos){
        CNode n = new CNode(d);
        if(pos == 1){
            insert_f(d);
        }
        else {
            CNode temp = head;
            int i=1;
            if(i == pos-1){
                n.next = temp.next;
                n.prev = temp;
                temp.next.prev = n;
                temp.next = n;
                return;
            }
            do{
                temp = temp.next;
                i++;
            }while(temp!=head && i<pos-1);
            if(temp == head){
                System.out.println("Index out of bound");
                return;
            }
            n.next = temp.next;
            n.prev = temp;
            temp.next.prev = n;
            temp.next = n;
        }
    }
    public void delete() {
        if(head == null){
            System.out.println("List is empty");
        }
        else {
            if(head.next == head) {
                head = null;
            } else {
                tail.prev.next = head;
                head.prev = tail.prev;
                tail = tail.prev;
            }
            System.out.println("Element is deleted");
        }
    }

    public void delete_f(){
        if(head == null){
            System.out.println("List is empty");
        }
        else{
            if(head.next == head){
                head = null;
            }
            else{
                head = head.next;
                tail.next = head;
                head.prev = tail;
            }
            System.out.println("Element is deleted");
        }
    }

    public void delete_pos(int pos){
        if(head == null){
            System.out.println("List is empty");
        }
        else{
            if(head.next == head){
                head = null;
            }
            else{
                if(pos == 1){
                    head = head.next;
                    head.prev = tail;
                    tail.next = head;
                }
                else {
                    CNode temp = head;
                    int i=1;
                    do{
                        temp = temp.next;
                        i++;
                    }while(temp!=head || i<pos-1);
                    if(temp == head){
                        System.out.println("Index out of bound");
                        return;
                    }
                    temp.next = temp.next.next;
                    temp.next.prev = temp;
                    System.out.println("Element deleted");
                }
            }
        }
    }

    public void delete_ele(int data){
        if(head == null){
            System.out.println("List is empty");
        }
        else{
            if(head.next == head){
                head = null;
            }
            else{
                CNode temp = head;
                if(head.data == data){
                    head = head.next;
                    tail.next = head;
                    head.prev = tail;
                    System.out.println("Element is deleted");
                } else if (tail.data == data) {
                    tail = tail.prev;
                    tail.next = head;
                    head.prev = tail;
                    System.out.println("Element is deleted");
                }
                else {
                    do {
                        if (temp.data == data) {
                            temp.prev.next = temp.next;
                            temp.next.prev = temp.prev;
                            System.out.println("Element is deleted");
                            return;
                        }
                        temp = temp.next;
                    } while (temp != head);
                    System.out.println("Element not found");
                }
            }
        }
    }

    public void search(int data){
        if(head == null)
            System.out.println("List is empty");
        else{
            if(head.data == data)
                System.out.println("Element found at head");
            else if (tail.data == data) {
                System.out.println("Element found at tail");
            }
            else{
                int i = 1;
                CNode n = head;
                do{
                    if(n.data == data){
                        System.out.println("Element found at "+i);
                    }
                    n = n.next;
                }while(n!=head);
            }
        }
    }

    public void count(){
        CNode temp = head;
        int i = 0;
        do{
            temp = temp.next;
        }while(temp!= head);
        System.out.println("The no of elements is "+i);
    }
    public void display(){
        CNode dis = head;
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        do{
            System.out.print(dis.data+" ");
            dis = dis.next;
        }while(dis!= head);
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        cll_insert obj = new cll_insert();
        int ch = 1,num,loc;
        while(ch != 0){
            System.out.println("\n1.Insert last \n2.Insert first\n3.Insert at position\n4.Delete Last\n5.Delete first\n6.Delete at position\n7.Delete by element\n8.Search element\n9.Print elements\n10.Count\n0.Exit");
            System.out.println("\nEnter your choice:");
            ch = s.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter the element to insert:");
                    num = s.nextInt();
                    obj.insert(num);
                    System.out.println("Element inserted");
                    break;
                case 2:
                    System.out.println("Enter the element to insert:");
                    num = s.nextInt();
                    obj.insert_f(num);
                    System.out.println("Element inserted");
                    break;
                case 3:
                    System.out.println("Enter the location");
                    loc = s.nextInt();
                    System.out.println("Enter the element to  insert");
                    num = s.nextInt();
                    obj.insert_pos(num,loc);
                    System.out.println("Element inserted");
                    break;
                case 4:
                    obj.delete();
                    break;
                case 5:
                    obj.delete_f();
                    break;
                case 6:
                    System.out.println("Enter position:");
                    loc = s.nextInt();
                    obj.delete_pos(loc);
                    break;
                case 7:
                    System.out.println("Enter element to be deleted:");
                    num = s.nextInt();
                    obj.delete_ele(num);
                    break;
                case 8:
                    System.out.println("Enter element to be searched:");
                    num = s.nextInt();
                    obj.search(num);
                    break;
                case 9:
                    obj.display();
                    break;
                case 10:
                    obj.count();
            }
        }
    }
}
