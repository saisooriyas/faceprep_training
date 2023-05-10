package data_structure.stack;

import java.util.Scanner;

class NodeSt{
    char data;
    NodeSt next;
    NodeSt(char d){
        data = d;
        next = null;
    }
}

public class infix {
    static NodeSt head;
    public static void push(String expression){
        NodeSt n;
         for(int i=0;i<expression.length()-1;i++){
             char ch = expression.charAt(i);
             if(Character.isDigit(ch)){
                 n = new NodeSt(ch);
                 if(head == null){
                     head = n;
                 }
                 else{
                     NodeSt temp = head;
                     while(temp.next!=null){
                         temp = temp.next;
                     }
                     temp.next = n;
                 }
             }
             else{
                 
             }
         }
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        push(str);
    }
}
