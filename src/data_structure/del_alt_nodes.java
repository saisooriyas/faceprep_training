package data_structure;
import java.io.*;
import java.util.*;

public class del_alt_nodes {
    Node head;

    public void insert(int d){
        Node newNode = new Node(d);
        if(head == null)
            head = newNode;
        else{
            Node temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void delete(){
        if (head == null)
            return;

        Node node = head;
        while (node != null && node.next != null) {
            /* Change next link of next node */
            node.next = node.next.next;

            /*Update ref node to new alternate node */
            node = node.next;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        del_alt_nodes sol = new del_alt_nodes();
        int num = 0;
        while(num!=-1){
            num = s.nextInt();
            if(num!=-1){
                sol.insert(num);
            }
        }
        sol.delete();
    }
}