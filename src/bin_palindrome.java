import java.util.Scanner;
class bin_palindrome
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a =new int[20];
        int i=0;
        while(n>0)
        {
            a[i]=n%2;
            n=n/2;
            i++;
        }
        System.out.print("Binary number is ");

        for(int j=i-1;j>=0;j--)
        {
            System.out.print(a[j]);
        }
        System.out.println();
        for(int j=0;j<i/2;j++)
        {
            if(a[j]!=a[i-j-1])
            {
                System.out.println("Binary number is not palindrome");
                return;
            }
        }
        System.out.println("Binary number is palindrome");
    }
}