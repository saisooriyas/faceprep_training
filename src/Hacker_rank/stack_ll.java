package Hacker_rank;

import java.io.*;
import java.util.*;

class Noded {
    int data;
    Noded next;
    Noded(int d){
        data = d;
        next = null;
    }
}

public class stack_ll {
    Noded head;

    public void insert(int d){
        Noded n = new Noded(d);
        if(head == null)
            head = n;
        else{
            Noded temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = n;
        }
    }

    public void pop(){
        if(head == null)
            System.out.println("-1");
        else{
            Noded temp = head;
            if(temp.next!= null) {
                while (temp.next.next != null) {
                    temp = temp.next;
                }
                System.out.println(temp.next.data);
                temp.next = null;
            }
            else{
                System.out.println(temp.data);
                head = null;
            }
        }
    }

    public void top(){
        if(head == null)
            System.out.println("-1");
        else
            System.out.println(head.data);
    }

    public void isEmpty(){
        if(head == null){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }

    public void count(){
        Noded temp = head;
        if(head == null){
            System.out.println("-1");
        }
        else {
            int count = 0;
            while (temp != null) {
                temp = temp.next;
                count++;
            }
            System.out.println(count);
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        stack_ll obj = new stack_ll();
        int num = s.nextInt();
        int ch,val;
        for(int i=0;i<num;i++){
            ch = s.nextInt();
            switch(ch){
                case 1:
                    val = s.nextInt();
                    obj.insert(val);
                    break;
                case 2:
                    obj.pop();
                    break;
                case 3:
                    obj.top();
                    break;
                case 4:
                    obj.count();
                    break;
                case 5:
                    obj.isEmpty();
            }
        }
    }
}