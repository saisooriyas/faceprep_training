package data_structure.tree;

import java.util.*;

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
        if(root == null) {
            root = t;
            System.out.println("Element inserted");
        }
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
            System.out.println("Element inserted");
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
        if(temp == null) {
            System.out.println("Empty");
            return;
        }
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
            int lheight = height(temp.left);
            int rheight = height(temp.right);
            if(lheight>rheight)
                return lheight+1;
            else
                return rheight+1;
        }
    }

    public int sub_height(Node temp, int key){
        if(temp == null)
            return 0;
        else if(temp.data == key){
            return height(temp);
        }
        else{
            if(temp.data > key){
                return sub_height(temp.left,key);
            }
            else{
                return sub_height(temp.right,key);
            }
        }
    }

    public void deleteKey(int key){
        root = delete(root,key);
    }

    public Node delete(Node temp, int key){
        if(temp == null){
            return null;
        }
        if(key < temp.data){
            temp.left = delete(temp.left,key);
        }
        else if(key > temp.data){
            temp.right = delete(temp.right,key);
        }
        else{
            if(temp.left == null){
                if(temp.right == null){
                    return null;
                }
                return temp.right;
            }
            else if(temp.right == null){
                return temp.left;
            }
            temp.data = Math.toIntExact(minValue(temp.right));
            temp.right = delete(temp.right,temp.data);
        }
        return temp;
    }

    int minValue(Node root)
    {
        int minv = root.data;
        while (root.left != null) {
            minv = root.left.data;
            root = root.left;
        }
        return minv;
    }

    public Node llm(Node temp, int val1, int val2){
        if(temp == null){
            return null;
        }
        if(temp.data > val1 && temp.data > val2){
            return llm(temp.left,val1,val2);
        }
        if(temp.data < val1 && temp.data < val2){
            return llm(temp.right,val1,val2);
        }
        return temp;

    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        tree_ll obj = new tree_ll();
        int ch,val,val2,height;
        do{
            System.out.println("\n1.Insert\n2.Delete\n3.height of subtree\n4.height of tree\n5.Inorder\n6.Search\n7.llm\n0.Exit");
            System.out.println("\nEnter the choice");
            ch = s.nextInt();
            switch (ch){
                case 1:
                    System.out.println("Enter element to insert:");
                    val = s.nextInt();
                    obj.insert(val);
                    break;
                case 2:
                    System.out.println("Enter delete element");
                    val = s.nextInt();
                    obj.deleteKey(val);
                    break;
                case 3:
                    System.out.println("Enter the node to see height");
                    val = s.nextInt();
                    height = obj.sub_height(obj.root,val);
                    System.out.println(height);
                    break;
                case 4:
                    height = obj.height(obj.root);
                    System.out.println(height);
                    break;
                case 5:
                    obj.inorder(obj.root);
                    break;
                case 6:
                    System.out.println("Enter the element to search");
                    val = s.nextInt();
                    obj.search(obj.root,val);
                case 7:
                    System.out.println("Enter the two elements");
                    val = s.nextInt();
                    val2 = s.nextInt();
                    Node temp = obj.llm(obj.root,val,val2);

            }
        }while(ch!=0);
    }
}
