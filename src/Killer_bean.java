import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int d){
        data = d;
        next = null;
    }
}
public class Killer_bean {

    Node head;

    public void insert(int data){
        Node n = new Node(data);
        if(head == null){
            head = n;
        }
        else{
            Node temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = n;
        }
        n.next = head;
    }

    public void kill(int count) {
        Node temp = head;
        while (temp.next != head) {
            for (int i = 1; i < count; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            temp = temp.next;
        }
        System.out.println(temp.data);
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Killer_bean obj = new Killer_bean();
        int num = s.nextInt();
        int count = s.nextInt();
        for(int i=1;i<=num;i++){
            obj.insert(i);
        }
        obj.kill(count);
    }
}
