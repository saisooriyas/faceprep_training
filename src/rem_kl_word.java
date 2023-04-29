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
        for(int i=0;i<b.length;i++)
        {
            count=0;
            char[] c=b[i].toCharArray();
            for(int j=0;j<c.length;j++)
            {
                if(c[j]==d)
                {
                    count++;
                    break;
                }
            }
            if(count==0)
                System.out.print(b[i]+" ");
        }

    }
}