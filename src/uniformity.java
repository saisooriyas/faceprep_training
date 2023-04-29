import java.util.*;
public class uniformity {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int arr[][] = new int[num][num];
        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++)
                arr[i][j] = s.nextInt();
        }
        int check = 0, value,value1;
        for(int i=0;i<num-1;i++){
            for(int j=0;j<num-1;j++){
                value = arr[i][j]%2;
                value1 = arr[i+1][j+1]%2;
                if(value==0 && value1==0){
                    check += 1;
                }
                else if(value==1 && value==1){
                    check += 1;
                }
            }
        }
        if (check ==0 || check== num*(num-1)){
            System.out.println("Uniformity matrix");
        }
        else{
            System.out.println("Non uniformity matrix");
        }/*
        for(int i=0;i<num;i++)
        {
            for(int j=0;i<num;j++){
                if(arr[i][j]%2==0){
                    even += 1;
                }
                else{
                    odd+=1;
                }
            }
        }
        if (even!=num*num || odd !=num*num)
            System.out.println("Non uniformity matrix");
        else
            System.out.println("Uniformity matrix");
        */
    }
}
