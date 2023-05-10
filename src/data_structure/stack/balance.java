package data_structure.stack;

import java.util.Scanner;

class NodeC{
    int data;
    NodeC next,prev;
    NodeC(int d){
        data = d;
        next = prev = null;
    }
}
public class balance {
    NodeC head,tail;

    public void push(int data){
        NodeC n = new NodeC(data);
        if(head == null){
            head = tail = n;
            n.prev = head;
        }
        else{
            NodeC temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = n;
            n.prev = temp;
            tail = n;
        }
    }
    public void pop(){
        if(head == null){
            System.out.println("Stack is empty");
        }
        else{
            NodeC temp = head;
            if(temp.next!=null){
                while(temp.next.next!=null){
                    temp = temp.next;
                }
                temp.next = null;
                tail = temp;
            }
            else{
                head = null;
            }
        }
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        balance sr = new balance();
        String str = s.nextLine();
        int n = str.length();
        int flag = 0;
        for(int i=0;i<n;i++){
            if(str.charAt(i) == '{' || str.charAt(i) == '[' || str.charAt(i) == '('){
                sr.push(str.charAt(i));
            }
            else if(str.charAt(i) == '}' || str.charAt(i) == ']' || str.charAt(i) == ')'){
                if(sr.head == null){
                    flag = 1;
                    break;
                }
                else{
                    if(str.charAt(i) == '}'){
                        if(sr.tail.data == '{'){
                            sr.pop();
                        }
                        else{
                            flag = 1;
                            break;
                        }
                    }
                    else if(str.charAt(i) == ']'){
                        if(sr.tail.data == '['){
                            sr.pop();
                        }
                        else{
                            flag = 1;
                            break;
                        }
                    }
                    else if(str.charAt(i) == ')'){
                        if(sr.tail.data == '('){
                            sr.pop();
                        }
                        else{
                            flag = 1;
                            break;
                        }
                    }
                }
            }
        }
        if(flag == 1){
            System.out.println("false");
        }
        else{
            if(sr.head == null){
                System.out.println("true");
            }
            else{
                System.out.println("false");
            }
        }
    }
}
