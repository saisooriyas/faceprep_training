package practice;

import java.util.Scanner;

public class red_braces {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String val = s.nextLine();
        char[] arr = val.toCharArray();
        int sum = 0;
        int[] count = new int[3];
        for(char ch : arr){
            if(ch == '('){
                sum += 1;
                if(sum>= arr.length/2){
                    System.out.println("no");
                    return;
                }
            }
            else if(ch == ')') {
                sum -= 1;
                if (sum < 0) {
                    System.out.println("no");
                    return;
                }
            }
            /*switch (ch){
                case '{':
                    count[0] += 1;
                    break;
                case '}':
                    count[0] -= 1;
                    break;
                case '[':
                    count[1] += 1;
                    break;
                case ']':
                    count[1] -= 1;
                    break;
                case '(':
                    count[2] += 1;
                    break;
                case ')':
                    count[2] -= 1;
                    break;
            }*/
        }
        if(sum == 0)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
