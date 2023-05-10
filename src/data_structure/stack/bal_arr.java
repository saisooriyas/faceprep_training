package data_structure.stack;
import java.util.Scanner;

public class bal_arr {
    char[] arr;
    int top;
    int size;
    public bal_arr(int size){
        this.size = size;
        arr = new char[size];
        top = -1;
    }
    public void push(char data){
        if(top == size-1){
            return;
        }
        else{
            top++;
            arr[top] = data;
        }
    }
    public void pop(){
        if(top == -1){
            return;
        }
        else{
            top--;
        }
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of stack:");
        int size = s.nextInt();
        bal_arr obj = new bal_arr(size);
        String str = s.next();
        int n = str.length();
        int flag = 0;
        for(int i=0;i<n;i++){
            if(str.charAt(i) == '{' || str.charAt(i) == '[' || str.charAt(i) == '('){
                obj.push(str.charAt(i));
            }
            else if(str.charAt(i) == '}' || str.charAt(i) == ']' || str.charAt(i) == ')'){
                if(obj.top == -1){
                    flag = 1;
                    break;
                }
                else{
                    if(str.charAt(i) == '}' && obj.arr[obj.top] == '{'){
                        obj.pop();
                    }
                    else if(str.charAt(i) == ']' && obj.arr[obj.top] == '['){
                        obj.pop();
                    }
                    else if(str.charAt(i) == ')' && obj.arr[obj.top] == '('){
                        obj.pop();
                    }
                    else{
                        flag = 1;
                        break;
                    }
                }
            }
        }
        if(flag == 1 || obj.top != -1){
            System.out.println("false");
        }
        else{
            System.out.println("true");
        }
    }
}
