import java.util.Scanner;

public class weather {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int[] arr = {70,72,73,70,69,72,75,74};
        for(int i=0;i<arr.length;i++){
            int count = 0,flag = 0;
            for(int j=i+1;j<arr.length;j++){
                count++;
                if(arr[j]>arr[i]){
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
                count = 0;
            }
            System.out.print(arr[i]+":"+count+"  ");
        }
    }
}
