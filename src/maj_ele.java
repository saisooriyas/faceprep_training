import java.io.*;
import java.util.*;

public class maj_ele {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int arr[] = new int[num];
        for(int i=0; i<num; i++){
            arr[i] = s.nextInt();
        }
        int temp,count=1,pos=0;
        int coll[] = new int[num];
        coll[0] = arr[0];
        int ans=0;
        for(int i=0;i<num-1;i++){
            temp=1;
            if (!(Arrays.asList(coll).contains(arr[i]))){
                coll[pos] = arr[i];
                pos = pos+1;
                for(int j=i+1;j<num;j++){
                    if(arr[i] == arr[j]){
                        temp = temp + 1;
                    }
                }
            }
            if (temp>count) {
                count = temp;
                ans = arr[i];
            }
        }
        System.out.println(ans);
    }
}