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
        int val;
        if(temp == null){
            return null;
        }
        if(key < temp.data){
            temp.left = delete(temp.left,key);
            val = temp.left.data;
        }
        else if(key > temp.data){
            temp.right = delete(temp.right,key);
            val = temp.right.data;
        }
        else{
            if(temp.left == null){
                val = temp.right.data;
                return temp.right;
            }
            else if(temp.right == null){
                val = temp.left.data;
                return temp.left;
            }
            temp.data = Math.toIntExact(minValue(temp.right));
            val = temp.data;
            temp.right = delete(temp.right,temp.data);
            val = temp.right.data;
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
        int[] arr = {3,4,8,7,6,1,2};
        for(int i : arr){
            obj.insert(i);
        }
        Node temp = obj.root;
        //int height = obj.height(temp);
        /*System.out.println(height);
        System.out.print("Preorder: ");
        obj.preorder(temp);
        System.out.print("\nPostorder: ");
        obj.postorder(temp);
        System.out.print("\nInorder: ");
        obj.inorder(temp);

        obj.search(temp,2);
        System.out.println("\n"+obj.height(temp));
        System.out.println("Enter element to delete");
        int key = s.nextInt();
        obj.deleteKey(key);
        System.out.print("Preorder: ");
        obj.preorder(temp);
        System.out.println("Enter the elements to find common ancestor");
        int val1 = s.nextInt();
        int val2 = s.nextInt();
        Node t = obj.root;
        t = obj.llm(t,val1,val2);
        System.out.println("The common ancestor of "+val1+" and "+val2+" is "+t.data);*/

        System.out.println("Enter the node to return height:");
        int no = s.nextInt();
        System.out.println(obj.sub_height(temp,no));
    }
}
