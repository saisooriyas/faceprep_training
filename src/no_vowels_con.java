import java.util.Scanner;

public class no_vowels_con {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String line1 = s.next();
        String line = line1.toLowerCase();
        char str[] = line.toCharArray();
        int v_count=0,c_count=0,o_count=0;
        int ascii = 0;
        for(int i=0;i<line.length();i++){
            ascii = str[i];
            if (ascii=='a'||ascii=='e'||ascii=='i'||ascii=='o'||ascii=='u'){
                v_count += 1;
            }else if(ascii>'a' && ascii<='z'){
                c_count += 1;
            }
            else if(!(ascii>='0' && ascii<='9')){
                o_count += 1;
            }
        }
        System.out.println("Vowels: "+v_count+"\nConsonants: "+c_count+"\nOther: "+o_count);
    }
}
