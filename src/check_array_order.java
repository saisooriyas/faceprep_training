import java.util.Scanner;

public class check_array_order {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        char[][] arr = new char[num][num];
        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                arr[i][j] = s.next().charAt(0);
            }
        }

        for(int j=0;j<num;j++){
            for(int i=0;i<num-1;i++){
                if(arr[i][j]>arr[i+1][j]){
                    System.out.println("False");
                    return;
                }
            }
        }
        System.out.println("True");
    }
}
