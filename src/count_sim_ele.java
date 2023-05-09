import java.util.Scanner;

public class count_sim_ele {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        //count of every similar elements in an array
        int num = s.nextInt();
        int[] arr = new int[num];
        int[] count = new int[num];
        for(int i=0;i<num;i++){
            arr[i] = s.nextInt();
        }
        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                if(arr[i]==arr[j]){
                    count[i] += 1;
                }
            }
        }
        for(int i=0;i<num;i++){
            System.out.println(arr[i]+" "+count[i]);
        }
    }
}
