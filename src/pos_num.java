import java.io.*;
import java.util.*;

public class pos_num {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        int arr[] = new int[num];
        for (int i=0; i<num; i++) {
            arr[i] = obj.nextInt();
        }
        int temp;
        for(int i=0; i<num-1; i++){
            for(int j=i; i<num;j++) {
                if (arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i = 0; i<num; i++){
            if(arr[i]>0){
                if(arr[i]+1 != arr[i+1]) {
                    System.out.print(arr[i]+1);
                }
            }
        }
    }
}