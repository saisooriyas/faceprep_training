import java.util.*;

public class word_akshari {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String hash ="Summa";
        String str,temp=hash;
        do {
            str = s.next();
            if(str.charAt(0) == temp.charAt(temp.length() - 1)){
                temp = str;
                System.out.println(str);
            }
        } while (!str.equals(hash));
    }
}
