package practice;

import java.util.Scanner;

public class date_05_18 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=i;j<=i*i;j+=i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
