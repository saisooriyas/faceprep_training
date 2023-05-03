import java.util.Scanner;

public class dec_bin_dec {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int and_op = (n & 15)<<4;
        int or_op = (n & 240) >> 4;
        int rev = and_op | or_op;
        System.out.println(rev);
        /*Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a =new int[8];
        int i=0;
        while(n>0)
        {
            a[i]=n%2;
            n=n/2;
            i++;
        }
        int j =4,sum = 0, mul = 1;
        do{
            sum += a[j] * mul;
            mul *= 2;
            j +=1;
            if (j== 7)
                j = 0;
        }while(j!=4);
        System.out.println(sum);
        j =0;
        sum = 0;
        mul = 1;
        do{
            sum += a[j] * mul;
            mul *= 2;
            j +=1;

        }while(j!=8);
        System.out.println(sum);*/
    }
}
