import java.util.Scanner;

public class alpha {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str = s.next();
        String line = str.toLowerCase();
        char[] alph = line.toCharArray();
        int[] freq = new int[26];
        int max = 0;
        int asc;
        for(char ch: alph){
            asc = (int) ch;
            asc -= 97;
            freq[asc] += 1;
            if(freq[asc]> max)
                max = freq[asc];
        }
        for(int i=0;i<=max;i++){
            for(int j=0;j<26;j++){
                if(freq[j] == i){
                    System.out.print((char)(j+97));
                }
            }
            System.out.print(" ");
        }
    }
}
