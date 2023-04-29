import java.util.Scanner;

public class selection {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        int[] array = new int[num];
        for (int i = 0; i < num; i++) {
            array[i] = obj.nextInt();
        }
        int min,temp;
        for (int i = 0; i<num; i++) {
            min = i;
            for(int j = i+1; j<num;j++){
                if( array[min] > array[j]) {
                    min = j;
                }
            }
            if(array[min]<array[i]) {
                temp = array[min];
                array[min] = array[i];
                array[i] = temp;
            }
        }
        for(int i=0;i<num;i++)
            System.out.print(array[i]+" ");
    }
}
