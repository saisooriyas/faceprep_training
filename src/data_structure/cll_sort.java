package data_structure;

import java.util.Scanner;

class Nods{
    int data;
    Nods next;
    Nods(int d){
        data = d;
        next = null;
    }
}
public class cll_sort {

    Nods head;

    public void insert(int d)
    {
        Nods n=new Nods(d);
        if(head==null)
        {
            head = n;
            n.next = head;
        }
        else
        {
            Nods temp=head;
            while(temp.next!=head)
            {
                temp=temp.next;
            }
            temp.next=n;
            n.next = head;
        }
    }
    public void sel_sort(){
        Nods current=head;
        Nods index=null;
        int temp;
        if(head==null)
        {
            System.out.println("List is empty");
        }
        else
        {
            do
            {
                index=current.next;
                while(index!=head)
                {
                    if(current.data>index.data)
                    {
                        temp=current.data;
                        current.data=index.data;
                        index.data=temp;
                    }
                    index=index.next;
                }
                current=current.next;
            }while(current.next!=head);
        }
    }

    public void bub_sort(int num){
        Nods n = head;
        Nods m = head;
        int temp;
        while(m.next!=head){
            n = head;
            while(n.next!=head){
                if(n.data>n.next.data){
                    temp = n.data;
                    n.data = n.next.data;
                    n.next.data = temp;
                }
                n = n.next;
            }
            m = m.next;
        }
    }
    public void in_sort(){
        Nods n = head;
        Nods m = head;
        int temp;
        if(head == null){
            System.out.println("List is empty");
        }
        else{
            while(m.next!=head){
                n = m.next;
                while(n!=head){
                    if(m.data>n.data){
                        temp = n.data;
                        n.data = m.data;
                        m.data = temp;
                    }
                    n = n.next;
                }
                m = m.next;
            }
        }
    }
    public void display(){
        Nods temp = head;
        do{
            System.out.print(temp.data+" ");
            temp = temp.next;
        }while(temp!= head);
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        cll_sort cs = new cll_sort();
        for(int i=0;i<num;i++){
            cs.insert(s.nextInt());
        }
        //cs.sel_sort();
        //cs.bub_sort(num);
        cs.in_sort();
        cs.display();
    }
}
