import java.util.Scanner;

public class divide_apple {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int[] arr = new int[num];
        int sum=0,count = 0;
        for(int i=0;i<num;i++){
            arr[i] = s.nextInt();
            sum += arr[i];
        }
        sum = sum/num;
        for(int i= num-1;i>0;i--){
            if(arr[i]>sum){
                int j = i-1;
                while(arr[i]>sum&&j>=0){
                    if(arr[j]<sum){
                        arr[i] -= 1;
                        arr[j] += 1;
                        count ++;
                    }
                    else{
                        j--;
                    }
                }
            }
        }
        for(int i=0;i<num;i++){
            if(arr[i] > sum){
                arr[i] = sum;
                count++;
            }
        }
        System.out.println(count);
    }
}

//5
//7 4 6 5 8

//3