import java.io.*;
import java.util.*;

public class min_moves {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int arr[] = new int[num];
        int sum[] = new int[num];
        int temp=0,t_j;
        for(int i=0;i<num;i++)
            arr[i] = s.nextInt();
        for(int i=0;i<num;i++){
            for(int j=0;j<num-1;j++){
                if (i!=j){
                    if(arr[i]>arr[j])
                        temp = temp+ (arr[i]-arr[j]);
                    else
                        temp = temp + (arr[j] - arr[i]);
                }
            }
            sum[i] = temp;
        }
        Arrays.sort(sum);
        System.out.print(sum[0]);
    }
}