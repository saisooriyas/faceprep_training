import java.util.*;
public class sort_1_0 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int arr[] = new int[num];
        for(int i=0; i<num; i++){
            arr[i] = s.nextInt();
        }
        int l=0,r = num-1, temp=0;
        while(l<r){
            if (arr[l]==1&&arr[r]==0){
                temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
            }
            l = l+1;
            r = r-1;
        }
        for(int i=0; i<num; i++)
            System.out.println(arr[i]);
    }
}
