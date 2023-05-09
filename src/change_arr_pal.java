import java.util.Scanner;

public class change_arr_pal {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int[] arr = new int[num];
        for(int i=0; i<num; i++){
            arr[i] = s.nextInt();
        }
        int l = 0, r = num-1,count = 0,check,temp;
        while(l<r){
            check = 0;
            temp=r;
            for(int i=l;i<=r/2;i++){
                if(arr[i] == arr[temp]){
                    check ++;
                }
                else{
                    break;
                }
                if(check == r/2){
                    System.out.println(count);
                    return;
                }
                temp--;
            }
            if(arr[l] <= arr[r]){
                arr[l+1] = arr[l] + arr[l+1];
                l = l+1;
            }
            else{
                arr[r-1] = arr[r] + arr[r-1];
                r = r-1;
            }
            count++;
        }
        System.out.println(count);
    }
}