import java.util.*;
public class rem_kl_word
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.nextLine();
        String[] b=a.split(" ");
        char d=obj.next().charAt(0);
        int count=0;
        for (String s : b) {
            count = 0;
            char[] c = s.toCharArray();
            for (char value : c) {
                if (value == d) {
                    count++;
                    break;
                }
            }
            if (count == 0)
                System.out.print(s + " ");
        }

    }
}