import java.util.*;
public class rem_k_word
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.nextLine();
        String[] b=a.split(" ");
        String key = obj.next();
        char[] d = key.toCharArray();
        int count=0;
        for (String s : b) {
            count = 0;
            char[] c = s.toCharArray();
            if (c.length == d.length) {
                for (int j = 0; j < c.length; j++) {
                    if (c[j] == d[j]) {
                        count++;
                        break;
                    }
                }
            }
            if (count == 0)
                System.out.print(s + " ");
        }

    }
}