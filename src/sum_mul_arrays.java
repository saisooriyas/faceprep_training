import java.io.*;
import java.util.*;

public class sum_mul_arrays {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int f_num = s.nextInt();
        int first_arr[] = new int[f_num];
        double sum=0,count=0;
        for(int i=0;i<f_num;i++)
            first_arr[i] = s.nextInt();
        int s_num = s.nextInt();
        int sec_arr[] = new int[s_num];
        for(int i=0;i<s_num;i++)
            sec_arr[i] = s.nextInt();
        for(int i=0;i<f_num;i++){
            sum = sum+first_arr[i];
            count = count+1;
        }
        for(int i=0;i<s_num;i++){
            sum = sum+sec_arr[i];
            count = count+1;
        }
        System.out.println(sum/count);
    }
}