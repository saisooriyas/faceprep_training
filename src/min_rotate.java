import java.io.*;
import java.util.*;

public class min_rotate {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int arr[] = new int[num];
        int min=0;
        for(int i=0;i<num;i++){
            arr[i] = s.nextInt();
        }
        min = arr[0];
        for(int i=1;i<num;i++){
            if(arr[i]<min)
                min = arr[i];
        }
        System.out.print(min);
    }
}