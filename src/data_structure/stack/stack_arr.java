package data_structure.stack;

import java.util.Scanner;

public class stack_arr {
    int[] arr;
    int top;
    int size;
    public stack_arr(int size){
        this.size = size;
        arr = new int[size];
        top = -1;
    }
    public void push(int data){
        if(top == size-1){
            System.out.println("Stack overflow");
        }
        else{
            top++;
            arr[top] = data;
            System.out.println("Element pushed");
        }
    }
    public void pop(){
        if(top == -1){
            System.out.println("Stack underflow");
        }
        else{
            top--;
            System.out.println("Element popped");
        }
    }

    public int isEmpty(){
        if(top == -1){
            System.out.println("Stack is empty");
            return 0;
        }
        return 1;
    }
    public void display(){
        int d = isEmpty();
        if(d == 0){
            return;
        }
        for(int i=0;i<=top;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of stack:");
        int size = s.nextInt();
        stack_arr obj = new stack_arr(size);
        int num;
        do{
            System.out.println("\n1.Push\n2.Pop\n3.IsEmpty\n4.IsFull\n5.Display\n0.Exit");
            System.out.println("Enter the choice:");
            num = s.nextInt();
            int data;
            switch (num){
                case 1:
                    System.out.println("Enter the element:");
                    data = s.nextInt();
                    obj.push(data);
                    break;
                case 2:
                    obj.pop();
                    break;
                case 3:
                    if(obj.top == -1){
                        System.out.println("Stack is empty");
                    }
                    else{
                        System.out.println("Stack is not empty");
                    }
                    break;
                case 4:
                    if(obj.top == size-1){
                        System.out.println("Stack is full");
                    }
                    else{
                        System.out.println("Stack is not full");
                    }
                    break;
                case 5:
                    obj.display();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
            }
        }while(num!=0);
    }
}
