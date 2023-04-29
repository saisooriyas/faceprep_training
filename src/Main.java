import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int row = s.nextInt();
        int col = s.nextInt();
        int num[][] = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                num[row][col] = s.nextInt();
            }
        }
        int sum = 0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                sum+=num[i][j];
            }
        }
        System.out.println(sum);
    }
}