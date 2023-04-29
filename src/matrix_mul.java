import java.util.*;
public class matrix_mul {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int f_size1 = s.nextInt(),f_size2=s.nextInt();
        int arr1[][] = new int[f_size1][f_size2];
        for (int i = 0; i < f_size1; i++) {
            for(int j=0;j<f_size2;j++){
                arr1[i][j] = s.nextInt();
            }
        }
        int s_size1 = s.nextInt(),s_size2 = s.nextInt();
        int arr2[][] = new int[s_size1][s_size2];
        for (int i = 0; i < s_size1; i++) {
            for(int j=0;j<s_size2;j++){
                arr2[i][j] = s.nextInt();
            }
        }
        int sum=0;
        if(f_size2 == s_size1){
            for(int i=0;i<f_size1;i++){
                for(int j=0;j<s_size2;j++){
                    sum = 0;
                    for(int k=0;k<f_size1;k++){
                        sum += arr1[i][k] * arr2[k][j];
                    }
                    System.out.print(sum+" ");
                }
                System.out.println();
            }
        }
    }
}
