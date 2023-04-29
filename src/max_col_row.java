import java.util.*;
public class max_col_row {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int arr[][] = new int[num][num];
        for (int i = 0; i < num; i++) {
            for(int j=0;j<num;j++){
                arr[i][j] = s.nextInt();
            }
        }
        int sum=0,max_row=0,max_col=0,row=0,col=0;
        for (int i = 0; i < num; i++) {
            sum =0;
            for(int j=0;j<num;j++){
                sum+= arr[i][j];
            }
            if(sum>max_row) {
                max_row = sum;
                row = i;
            }
        }
        for (int i = 0; i < num; i++) {
            sum =0;
            for(int j=0;j<num;j++){
                sum+= arr[j][i];
            }
            if(sum>max_col) {
                max_col = sum;
                col = i;
            }
        }
        System.out.println(max_row+" "+(row+1)+" row");
        System.out.println(max_col+" "+(col+1)+" col");
    }
}
// max element in row & col
// max sum of element in row & col