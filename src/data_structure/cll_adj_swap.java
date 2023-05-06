package data_structure;

import java.util.Scanner;

class CNodes{
    int data;
    CNodes next,prev;
    CNodes(int d){
        data = d;
        next = null;
        prev = null;
    }
}
public class cll_adj_swap {
    CNodes head,tail;

    public void insert(int d){
        CNodes n = new CNodes(d);
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
    public void swap(){
        CNodes temp = head;
        while(temp.next!=head){
            int t = temp.data;
            temp.data = temp.next.data;
            temp.next.data = t;
            temp = temp.next.next;
        }
    }
    public void display(){
        CNodes dis = head;
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
        cll_adj_swap cl = new cll_adj_swap();
        int num = s.nextInt();
        for(int i=0;i<num;i++){
            cl.insert(s.nextInt());
        }

        cl.swap();
        cl.display();
    }
}
