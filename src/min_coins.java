import java.util.Scanner;

public class min_coins {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int arr[] = {1,2,5,10,50};
        int i= (arr.length)-1;
        int amt = s.nextInt();
        while(amt>0){
            if(amt>=arr[i]){
                System.out.println(arr[i]);
                amt = amt - arr[i];
            }
            else{
                i -= 1;
            }
        }
    }
}
