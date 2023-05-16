package data_structure.tree;

import java.util.*;
class btree {
    int key;
    btree right,left;
    btree(int d){
        key = d;
        right = left = null;
    }
}
public class binary_tree
{
    btree root;

    public void insert(int d){
        btree n = new btree(d);
        if(root == null) {
            root = n;
            System.out.println("Element inserted");
        }
        else{
            Queue<btree> q = new LinkedList<btree>();
            q.add(root);
            btree temp;
            while(!q.isEmpty()){
                temp = q.peek();
                q.remove();

                if(temp.left == null){
                    temp.left =  n;
                    break;
                }
                else{
                    q.add(temp.left);
                }

                if(temp.right == null){
                    temp.right = n;
                    break;
                }
                else{
                    q.add(temp.right);
                }
            }
            System.out.println("Element inserted");        }
    }

    public int height(btree temp){
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
    static void deleteDeepest(btree root, btree delbitree)
    {
        Queue<btree> q = new LinkedList<btree>();
        q.add(root);

        btree temp;
        while (!q.isEmpty()) {
            temp = q.peek();
            q.remove();

            if (temp == delbitree) {
                temp = null;
                return;
            }
            if (temp.right != null) {
                if (temp.right == delbitree) {
                    temp.right = null;
                    return;
                }
                else
                    q.add(temp.right);
            }

            if (temp.left != null) {
                if (temp.left == delbitree) {
                    temp.left = null;
                    return;
                }
                else
                    q.add(temp.left);
            }
        }
    }

    public void delete(int key)
    {
        if (root == null){
            System.out.println("Empty");
            return;
        }

        if (root.left == null && root.right == null) {
            if (root.key == key) {
                root = null;
            }
            return;
        }

        Queue<btree> q = new LinkedList<btree>();
        q.add(root);
        btree temp = null, keybitree = null;

        while (!q.isEmpty()) {
            temp = q.peek();
            q.remove();

            if (temp.key == key)
                keybitree = temp;

            if (temp.left != null)
                q.add(temp.left);

            if (temp.right != null)
                q.add(temp.right);
        }

        if (keybitree != null) {
            int x = temp.key;
            deleteDeepest(root, temp);
            keybitree.key = x;
        }
    }
    int diameter(btree root)
    {
        if (root == null)
            return 0;
        int lheight = height(root.left);
        int rheight = height(root.right);

        int ldiameter = diameter(root.left);
        int rdiameter = diameter(root.right);

        return Math.max(lheight + rheight + 1,
                Math.max(ldiameter, rdiameter));
    }

    void levelOrder()
    {
        Queue<btree> queue = new LinkedList<btree>();
        queue.add(root);
        if(root == null) {
            System.out.println("Empty");
            return;
        }
        while (!queue.isEmpty()) {
            btree tempNode = queue.poll();
            System.out.print(tempNode.key + " ");

            if (tempNode.left != null) {
                queue.add(tempNode.left);
            }
            if (tempNode.right != null) {
                queue.add(tempNode.right);
            }
        }
    }
    void search(btree temp, int val){
        if(temp == null){
            return;
        }
        if(temp.key == val){
            System.out.println("Element found");
            return;
        }
        search(temp.left,val);
        search(temp.right,val);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        binary_tree obj = new binary_tree();
        int ch,val;
        do{
            System.out.println("\n1.Insert\n2.Delete\n3.height\n4.Display\n5.Search\n6.Diameter\n0.Exit");
            System.out.println("Enter your choice");
            ch = s.nextInt();

            switch (ch){
                case 1:
                    System.out.println("Enter the element to insert:");
                    obj.insert(s.nextInt());
                    break;
                case 2:
                    System.out.println("Enter the element to delete:");
                    val = s.nextInt();
                    obj.delete(val);
                    break;
                case 3:
                    val = obj.height(obj.root);
                    System.out.println(val);
                    break;
                case 4:
                    obj.levelOrder();
                    break;
                case 5:
                    System.out.println("Enter the element to search:");
                    val = s.nextInt();
                    obj.search(obj.root,val);
                    break;
                case 6:
                    System.out.println(obj.diameter(obj.root));
                    break;
                default:
                    ch = 0;
            }
        }while(ch!=0);
    }
}
