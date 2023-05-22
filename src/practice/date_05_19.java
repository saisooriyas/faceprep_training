package practice;

import java.util.Scanner;

public class date_05_19 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        char[] arr = str.toCharArray();
        int sum = 0;
        for (int i=0;i<arr.length-2;i++){
            if(arr[i]==arr[i+1]&&arr[i]==arr[i+2]){
                sum += 1;
            }
        }
        System.out.println(sum);
    }
}
