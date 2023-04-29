import java.util.*;
public class sort_string {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String line = s.next();
        char str[] = line.toCharArray();
        char temp;
        for(int i=0;i<line.length()-1;i++){
            for(int j=i;j<line.length()-1;j++){
                if((int)str[j] > (int)str[j+1]){
                    temp = str[j];
                    str[j] = str[j+1];
                    str[j+1] = temp;
                }
            }
        }
        //Arrays.sort(str);
        for(int i=0;i<line.length();i++){
            System.out.print(str[i]+"");
        }
    }
}
