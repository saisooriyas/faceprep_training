import java.util.Scanner;

public class interest {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int p_amt = s.nextInt();
        int r = s.nextInt();
        int n = 10;
        float int_amt = (float) (p_amt * n * r) /100;
        System.out.printf("Interest: %.2f\n",int_amt);
        System.out.printf("Total: %.2f\n",(int_amt+p_amt));
        float dis = (float) (int_amt - (0.02 * int_amt));
        System.out.printf("Discounted Interest: %.2f\n",dis);
        System.out.printf("Total after discount: %.2f",(p_amt+dis));
    }
}
