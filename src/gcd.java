import java.util.Scanner;

public class gcd {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int num2 = s.nextInt();
        /*
        while(num != num2){
            if(num > num2)
                num = num - num2;
            else
                num2 = num2 - num;
        }*/
        System.out.println(findGCD(num, num2));
    }
    static int findGCD(int a, int b)
    {
        if (b == 0)
            return a;
        return findGCD(b, a % b);
    }
}
