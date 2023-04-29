import java.util.*;
public class upper_triangle {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int[][] arr = new int[num][num];
        for (int i = 0; i < num; i++) {
            for(int j=0;j<num;j++){
                arr[i][j] = s.nextInt();
            }
        }
        int flag = 0;
        for(int i=1;i<num;i++){
            for(int j=0;j<i;j++){
                if(arr[i][j] !=0){
                    flag=1;
                    break;
                }
            }
        }
        for(int i=1;i<num;i++){
            for(int j=0;j<i;j++){
                if(arr[i][j] !=0){
                    flag=1;
                    break;
                }
            }
        }
        if(flag ==1){
            System.out.println("Not a upper triangle");
        }
        else{
            System.out.println("Upper Triangle");
        }

    }
}
