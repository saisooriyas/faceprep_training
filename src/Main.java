import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String line2 = s.nextLine();
        String line = line2.toLowerCase();
        String[] words = line.split(" ");
        char[] freq = new char[26];
        char temp;
        for(String str: words){
            char[] alph = str.toCharArray();
            for(char ch:alph){
                freq[(int)ch-97]+=1;
            }
        }
        for(int i=0;i<26;i++){
            if(freq[i] == 0){
                temp = (char)(i + 97);
                System.out.print(temp+" ");
            }
        }
        String obj = "I"+"like"+"coding";
        System.out.println(obj);
    }
}