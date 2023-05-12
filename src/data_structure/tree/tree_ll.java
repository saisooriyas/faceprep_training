package data_structure.tree;

import java.util.Scanner;

class Node{
    int data;
    Node right,left;
    Node(int d){
        data = d;
        right = left = null;
    }
}

public class tree_ll {
    Node root;
    public void insert(int d){
        Node t = new Node(d);
        if(root == null)
            root = t;
        else{
            Node temp = root;
            while(true){
                if(temp.data<t.data){
                    if(temp.right == null){
                        temp.right = t;
                        break;
                    }
                    temp = temp.right;
                }
                else{
                    if(temp.left == null){
                        temp.left = t;
                        break;
                    }
                    temp = temp.left;
                }
            }
        }
    }

    public void preorder(Node temp){
        if(temp == null)
            return;
        System.out.print(temp.data);
        preorder(temp.left);
        preorder(temp.right);
    }

    public void postorder(Node temp){
        if(temp == null)
            return;
        postorder(temp.left);
        postorder(temp.right);
        System.out.print(temp.data);
    }

    public void inorder(Node temp){
        if(temp == null)
            return;
        inorder(temp.left);
        System.out.print(temp.data);
        inorder(temp.right);
    }

    public void search(Node temp,int d){
        if(temp == null)
            return;
        if(temp.data == d){
            System.out.println("\nFound");
            return;
        }
        else if(temp.data<d){
            search(temp.right,d);
        }
        else{
            search(temp.left,d);
        }
    }

    public int height(Node temp){
        if(temp == null)
            return 0;
        else{
            int ls = temp.data;
            int lheight = height(temp.left);
            int rs = temp.data;
            int rheight = height(temp.right);
            if(lheight>rheight)
                return lheight+1;
            else
                return rheight+1;
        }
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        tree_ll obj = new tree_ll();
        int[] arr = {3,4,8,7,6,1,2};
        for(int i : arr){
            obj.insert(i);
        }
        Node temp = obj.root;
        System.out.print("Preorder: ");
        obj.preorder(temp);
        System.out.print("\nPostorder: ");
        obj.postorder(temp);
        System.out.print("\nInorder: ");
        obj.inorder(temp);

        obj.search(temp,2);
        System.out.println("\n"+obj.height(temp));
    }
}
