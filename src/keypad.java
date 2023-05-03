/*import java.io.*;
import java.util.*;

public class keypad {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int l = num%10;
        num = num/10;
        int f = num, n=3,m=3;
        char[][] keyp = { { 'a', 'b', 'c'}, { 'd', 'e', 'f' }, {'g', 'h', 'i'}, {'j', 'k', 'l'}, {'m', 'n', 'o'}, {'p', 'q','r','s'},{'t', 'u', 'v'}, {'w', 'x', 'y', 'z'}};
        if (l == 7 || l ==9){
            n = 4;
        }
        if (f == 7 || f == 9){
            m = 4;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.println(keyp[f-2][j]+String.valueOf(keyp[l-2][i]));
            }
        }
    }
}*/
import java.util.*;
public class keypad {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        printKeypad(n,arr,"");
    }
    public static void printKeypad(int n,String[] arr,String output){
        if(n==0){
            System.out.println(output);
            return;
        }
        int lastDigit = n%10;
        String options = arr[lastDigit];
        for(int i=0;i<options.length();i++){
            printKeypad(n/10,arr,options.charAt(i)+output);
        }
    }
}