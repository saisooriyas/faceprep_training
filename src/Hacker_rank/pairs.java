package Hacker_rank;

import java.util.Scanner;

//Sample Input:
//mat
//2
//m t 10
//a m 5
//Sample output:
//10
//Explanation:
//To convert the string "mat" into a palindrome we can convert 'm' to 't' thus incurring a cost 10 and getting the string "tat" which is a
//palindrome. You can check that this is the minimum possible cost. Hence the output is 10.

public class pairs {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int N = s.nextInt();
        int[][] arr = new int[N][3];
        for(int i=0;i<N;i++){
            arr[i][0] = s.next().charAt(0);
            arr[i][1] = s.next().charAt(0);
            arr[i][2] = s.nextInt();
        }
        func(str,arr);
    }
    public static void func(String str,int[][] arr){
        int len = str.length();
        int[][] dp = new int[len][len];
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                dp[i][j] = Integer.MAX_VALUE;
            }
        }
        for(int i=0;i<len;i++){
            dp[i][i] = 0;
        }
        for(int i=0;i<len-1;i++){
            if(str.charAt(i) == str.charAt(i+1)){
                dp[i][i+1] = 0;
            }
            else{
                dp[i][i+1] = Math.min(arr[str.charAt(i)-'a'][2],arr[str.charAt(i+1)-'a'][2]);
            }
        }
        for(int gap=2;gap<len;gap++){
            for(int i=0;i<len-gap;i++){
                int j = i+gap;
                if(str.charAt(i) == str.charAt(j)){
                    dp[i][j] = dp[i+1][j-1];
                }
                else{
                    dp[i][j] = Math.min(dp[i+1][j]+arr[str.charAt(i)-'a'][2],dp[i][j-1]+arr[str.charAt(j)-'a'][2]);
                }
            }
        }
        System.out.println(dp[0][len-1]);
    }
}