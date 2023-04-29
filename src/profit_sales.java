import java.util.*;
public class profit_sales {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int arr[] = new int[num];
        for(int i=0;i<num;i++)
            arr[i] = s.nextInt();
        int l=0,r=num-1,sum=0;
        for(int i=0;i<num;i++){
            if(arr[l]<=arr[r]){
                sum+=arr[l]*(l+1);
                l += 1;
            }
            else if(arr[l]>arr[r]){
                sum += arr[r]*(r+1);
                r -= 1;
            }
        }
        System.out.println(sum);
    }
}
