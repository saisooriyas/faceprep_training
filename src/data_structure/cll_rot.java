package data_structure;

import java.util.Scanner;

class Nodem{
    int data;
    Nodem next;
    Nodem(int d){
        data = d;
        next = null;
    }
}
public class cll_rot {
    Nodem head;

    public void insert(int d){
        Nodem n = new Nodem(d);
        if(head == null){
            head = n;
            n.next = head;
        }
        else{
            Nodem temp = head;
            while(temp.next!=head){
                temp = temp.next;
            }
            temp.next = n;
            n.next = head;
        }
    }
    public void rotate(int k)
    {
        Nodem last=head;
        while(last.next!=head)
        {
            last=last.next;
        }
        for(int i=0;i<=k;i++)
        {
            last=head;
            head=head.next;
        }
    }

    public void display(){
        Nodem temp = head;
        do{
            System.out.print(temp.data+" ");
            temp = temp.next;
        }while(temp!=head);
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        cll_rot cr = new cll_rot();
        int num = s.nextInt();
        for(int i =0;i<num;i++){
            cr.insert(s.nextInt());
        }
        int rot = s.nextInt();
        cr.rotate(rot);
        cr.display();
    }

}
