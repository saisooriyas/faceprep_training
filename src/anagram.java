import java.util.Scanner;

public class anagram {
    public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    String line1 = s.next();
    String line = line1.toLowerCase();
    String line4 = s.next();
    String line2 = line4.toLowerCase();
    char str[] = line.toCharArray();
    char str2[] = line2.toCharArray();

    if (line.length()!=line2.length())
        return;
    int[] frequencies = new int[26];

    for (int i = 0; i < line.length(); i++) {
        frequencies[str[i] - 'a'] += 1;
        frequencies[str2[i] - 'a'] -= 1;
    }
    for (int frequency : frequencies) {
        if (frequency != 0) {
            System.out.println("Not possible");
            return;
        }
    }

    System.out.println("possible");
}}
