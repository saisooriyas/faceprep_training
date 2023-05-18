import java.util.*;
public class summa{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        int size_a = (int)(Math.log10(a)+1)/2;
        int size_b = (int)(Math.log10(b)+1)/2;

        int al = (int)(a/Math.pow(10,size_a));
        int bl = (int)(b/Math.pow(10,size_b));

        int ah = (int)(a%Math.pow(10,size_a));
        int bh = (int)(b%Math.pow(10,size_b));

        int c0 = bh * ah;
        int c1 = bl * al;
        int c2 = (al + ah) * (bl + bh) - c0 - c1;

        int r = (int) (c1 * Math.pow(10,size_a*2) + c2 * Math.pow(10,size_b) + c0);

        System.out.println(r);
    }
}