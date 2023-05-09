import java.util.Scanner;

public class nearest_prime {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int prev=num, next=num,check;
        do {
            prev--;
            check = 0;
            for (int i = 2; i <= prev / 2; i++) {
                if (prev % i == 0) {
                    check++;
                }
            }
        } while (check != 0);
        do {
            next++;
            check = 0;
            for (int i = 2; i <= next / 2; i++) {
                if (next % i == 0) {
                    check++;
                }
            }
        } while (check != 0);
        if(num-prev <= next -num){
            System.out.println(prev);
        }
        else{
            System.out.println(next);
        }
    }
}
