import java.util.*;
public class super_market {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int cust = s.nextInt(),sales= s.nextInt();
        int arr[][] = new int[cust][sales];
        for(int i=0;i<cust;i++) {
            for(int j=0;j<sales;j++){
                arr[i][j] = s.nextInt();
            }
        }

    }
}
