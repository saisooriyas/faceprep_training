import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String line = s.next();
        String pat = s.next();
        char sent[] = line.toCharArray();
        char pattern[] = pat.toCharArray();
        int index = -1,i,j;
        for (i = 0; i <= line.length()-pat.length(); i++) {
            for (j = 0; j < pat.length(); j++) {
                if (sent[i + j] != pattern[j]) {
                    break;
                }
            }
            if (j == pat.length()) {
                index = i;
                System.out.println("Index of pattern in string: " + index);
            }
        }
        if (index==-1)
                System.out.println("No pattern");
    }
}
