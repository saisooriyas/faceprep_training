import java.io.*;
import java.util.*;

public class sum {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        int array[] = new int[num];
        for (int i=0; i<num; i++) {
            array[i] = obj.nextInt();
        }
        int search = obj.nextInt();
        for (int i=0; i<num-1; i++) {
            for(int j=i+1;j<num; j++){
                if (array[i]+array[j] == search){
                    System.out.println(i+" "+(j));
                    return;
                }
            }
        }
    }
}