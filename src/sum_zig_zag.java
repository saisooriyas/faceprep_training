import java.util.*;
public class sum_zig_zag {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int[][] arr = new int[num][num];
        for (int i = 0; i < num; i++) {
            for(int j=0;j<num;j++){
                arr[i][j] = s.nextInt();
            }
        }
        int row=0,col=0,sum=0;
        boolean t = true;
        while(t){
            if(row==0 && col!=num-1){
                sum+= arr[row][col];
                col += 1;

            } else if (row == 0 && col==num-1) {
                sum+=arr[row][col];
                row+= 1;
                col-=1;

            }
            else if(row!=0 && col!=0 && row!=num-1){
                sum+=arr[row][col];
                row+=1;
                col-=1;
            }
            else if(row!=0 && col==0){
                sum+= arr[row][col];
                col+=1;
            }
            else if(row!=0 && col!=0 && row ==num-1){
                sum+=arr[row][col];
                col+=1;
            }
            if(row==num-1 && col ==num-1){
                sum += arr[row][col];
                t = false;
            }
        }
        System.out.println(sum);
    }
}
