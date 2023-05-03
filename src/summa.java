import java.util.*;
public class summa{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int s=sc.nextInt();

        int count = 0,i=s;
        while(count < m){
            i += 1;
            if (i>n)
                i = 1;
            count ++;
        }
        System.out.println(i);
    }

}