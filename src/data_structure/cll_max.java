package data_structure;

import java.util.Scanner;

class Mode{
    int data;
    Mode next;
    Mode(int d){
        data = d;
        next = null;
    }
}
public class cll_max {
    Mode head;
    public void insert(int d){
        Mode n = new Mode(d);
        if(head == null) {
            head = n;
            n.next = head;
        }
        else{
            Mode temp = head;
            while(temp.next!=head){
                temp = temp.next;
            }
            temp.next = n;
            n.next = head;
        }
    }

    public void max(){
        Mode temp = head;
        int max = head.data;
        while(temp.next!=head){
            if(max< temp.data)
                max = temp.data;
            temp = temp.next;
        }
        System.out.println(max);
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        cll_max cm = new cll_max();
        int num = s.nextInt();
        for(int i=0;i<num;i++)
            cm.insert(s.nextInt());
        cm.max();
    }
}
