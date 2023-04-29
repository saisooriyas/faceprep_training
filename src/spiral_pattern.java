import java.util.*;
public class spiral_pattern {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int arr[][] = new int[size][size];
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++)
                arr[i][j] = s.nextInt();
        }

    }
}
