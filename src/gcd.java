import java.util.Scanner;

public class gcd {
    /*public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int num2 = s.nextInt();

        while(num != num2){
            if(num > num2)
                num = num - num2;
            else
                num2 = num2 - num;
        }
        System.out.println(findGCD(num, num2));
    }
    static int findGCD(int a, int b)
    {
        if (b == 0)
            return a;
        return findGCD(b, a % b);
    }*/

    static int gcd(int a, int b)
    {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }
    static int findGCD(int arr[], int n)
    {
        int result = arr[0];
        for (int element: arr){
            result = gcd(result, element);
            if(result == 1)
            {
                return 1;
            }
        }
        return result;
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] num = new int[n];
        for(int i=0;i<n;i++){
            num[i] = s.nextInt();
        }
        System.out.println(findGCD(num, n));
    }
}
