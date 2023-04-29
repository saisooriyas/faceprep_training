import java.util.*;
public class flag {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int arr[] = new int[num];
        for(int i=0; i<num; i++){
            arr[i] = s.nextInt();
        }
        int sum = 1,temp=1;
        for(int i =1;i<num;i++){
            if(arr[i]>arr[i-1]){
                temp=temp+1;
                sum = sum+temp;
            }
            else if(arr[i]<arr[i-1]){
                temp = 1;
                sum = sum +temp;
            }
        }
        System.out.println(sum);
    }
}
