import java.util.*;
public class insertion {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        int[] array = new int[num];
        for (int i = 0; i<num; i++){
            array[i] = obj.nextInt();
        }
        int temp;
        for(int i = 0; i<num; i++) {
            for (int j = i; j>0; j--) {
                if (array[j-1] > array[j]){
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }
        for(int i = 0; i<num; i++) {
            System.out.print(array[i]+" ");
        }
    }
}
