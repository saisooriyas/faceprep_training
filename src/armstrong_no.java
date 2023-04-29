import java.util.*;
public class armstrong_no {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int sq = num*num,mul;
        int size = String.valueOf(sq).length();
        if (size%2 == 1)
            mul = (size/2) + 1;
        else
            mul =(size/2);
        int result = 1,base = 10;
        while (mul != 0) {
            result = result * base;
            mul--;
        }
        int sum = 0;
        sum = sq % (result);
        sq = sq / (result);
        sum += sq;

        System.out.println(sum);
    }
}
