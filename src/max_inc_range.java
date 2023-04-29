import java.util.Scanner;

public class max_inc_range {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int[] arr = new int[num];
        for(int i=0;i<num;i++){
            arr[i] = s.nextInt();
        }
        int temp,max=0,value=arr[0];
        for(int i=0;i<num-1;i++){
            temp = 1;
            for(int j=i;j<num-1;j++){
                if (value < arr[j+1]){
                    temp += 1;
                    value = arr[j+1];
                }
            }
            if(temp>max){
                max = temp;
            }
        }
        System.out.println(max);
    }
}
