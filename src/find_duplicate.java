// Find duplicate elements in an array
import java.util.*;

public class find_duplicate {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        int[] array = new int[num];
        for (int i = 0; i<num; i++){
            array[i] = obj.nextInt();
        }
        int[] temp = new int[num];
        int try1 = 1,t= 1;
        temp[0] = array[0];
        for (int i = 1; i<num; i++){
            for (int j = 0; j<try1; j++){
                if (array[i] == temp[j]) {
                    System.out.print(array[i]+" ");
                }
                else {
                    temp[try1] = array[i];
                    t = t + 1;
                }
            }
            try1 = t;
        }
    }
}