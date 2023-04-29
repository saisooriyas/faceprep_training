import java.util.*;

public class rotate_array {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int arr[] = new int[num];
        for (int i=0; i<num; i++) {
            arr[i] = s.nextInt();
        }
        int step = s.nextInt();
        int temp1,temp2;
        for(int st=0; st<step; st++){
            temp1 = arr[0];
            for(int i=1; i<num; i++){
                temp2 = arr[i];
                arr[i] = temp1;
                temp1 = temp2;
            }
            arr[0] = temp1;
        }
        for(int i=0;i<num;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
