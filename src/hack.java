import java.util.Scanner;

public class hack {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int[] arr = new int[num];
        for(int i=0; i<num; i++){
            arr[i] = s.nextInt();
        }

        for(int i=0;i<num;i++){
            for(int j=0;j<num-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        int initial = arr[0];
        int f=0,count = 1,x = initial;
        for(int i:arr){
            f = 0;
            count = x = 1;
            while(i!=0){
                if(i<10){
                    if(i==initial){
                        System.out.print("true"+" ");
                        f=1;
                        break;
                    }
                }
                x = (10*count);
                if(i%x == 0)
                    i /= x;
                else
                    break;
                count++;
            }
            if(f==0)
                System.out.print("false"+" ");
        }
    }
}