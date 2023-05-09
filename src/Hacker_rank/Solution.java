package Hacker_rank;
import java.io.*;
import java.util.*;

class Node{
    int data;
    Node next;

    Node(int d){
        data = d;
        next = null;
    }
}
public class Solution {
    Node head;

    public void insert(int data){
        Node n = new Node(data);
        int f = 1;
        if(head == null)
            head = n;
        else{
            Node temp = head;
            while(temp.next!=null){
                if(temp.data == data){
                    f = 0;
                    break;
                }
                temp = temp.next;
            }
            if(f==1)
                temp.next = n;
        }
    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Solution obj = new Solution();
        int num;
        do{
            num = s.nextInt();
            if(num != -1)
                obj.insert(num);
        }while(num != -1);
        obj.display();
    }
}