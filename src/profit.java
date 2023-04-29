import java.util.*;
public class profit {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int arr[] = new int[num];
        for(int i=0;i<num;i++){
            arr[i] = s.nextInt();
        }
        int temp,profit =0;
        for(int i=0;i<num-1;i++){
            for(int j=i+1;j<num;j++){
                if (arr[j]>arr[i]) {
                        temp = arr[j]-arr[i];
                        if (temp>profit){
                            profit = temp;
                        }
                }
            }
        }
        System.out.println(profit);
    }
}
