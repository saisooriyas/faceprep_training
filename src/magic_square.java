import java.util.*;
public class magic_square {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int row = s.nextInt(),col = s.nextInt();
        int arr[][] = new int[row][col];
        for(int i=0;i<row;i++) {
            for (int j = 0; j < col; j++)
                arr[i][j] = s.nextInt();
        }
        int j=0,lsum=0,rsum=0,size=col;
        for(int i=0;i<row;i++){
            lsum += arr[i][i];
            rsum += arr[i][size-1];
            size -= 1;
        }
        if (lsum == rsum)
            System.out.print("Magic Square");
        else
            System.out.print("Not a magic square");
    }
}
