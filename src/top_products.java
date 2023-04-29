import java.util.Scanner;

public class top_products {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int arr[][] = new int[num][num];
        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                arr[i][j] = s.nextInt();
            }
        }
        int top = s.nextInt();

    }
}
