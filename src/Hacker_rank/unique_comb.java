package Hacker_rank;

//Input: 1
// 4
// 7 2 6 5 16
//Output:(2 2 2 2 2 2 2 2)(2 2 2 2 2 6)(2 2 2 5 5)(2 2 5 7)(2 2 6 6)(2 7 7)(5 5 6)

import java.util.Scanner;

public class unique_comb {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        while(T-->0){
            int N = s.nextInt();
            int[] arr = new int[N];
            for(int i=0;i<N;i++){
                arr[i] = s.nextInt();
            }
            int sum = s.nextInt();
            func(arr,sum);
            System.out.println();
        }
    }
    public static void func(int[] arr,int sum){
        int len = arr.length;
        int[] data = new int[sum];
        func_util(arr,data,0,len-1,0,sum);
    }
    public static void func_util(int[] arr,int[] data,int start,int end,int index,int sum){
        if(sum<0)
            return;
        if(sum==0){
            System.out.print("(");
            for(int i=0;i<index;i++){
                System.out.print(data[i]+" ");
            }
            System.out.print(")");
            return;
        }
        for(int i=start;i<=end;i++){
            data[index] = arr[i];
            func_util(arr,data,i,end,index+1,sum-arr[i]);
        }
    }
}
