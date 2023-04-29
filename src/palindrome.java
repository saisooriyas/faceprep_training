import java.util.*;
public class palindrome {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str = s.next();
        char s_char[] = str.toCharArray();
        int size = str.length(),count =0;
        for(int i=0;i<(str.length()/2);i++){
            if(s_char[i]==s_char[size-1]){
                count +=1;
            }
            size -= 1;
        }
        if (count == (str.length()/2))
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
    }
}
