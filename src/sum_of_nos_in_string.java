import java.util.*;

import static java.lang.Math.pow;

public class sum_of_nos_in_string {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str = s.next();
        char[] line = str.toCharArray();
        /*StringBuilder sb = new StringBuilder();
        char[] num = {'0','1','2','3','4','5','6','7','8','9'};*/
        int ascii,sum = 0,count =0;
        double temp=0;
        for(int i=0;i<str.length();i++){
            /*if(Character.isDigit(line[i]))
                sb.append(line[i]);*/
            /*for(int j=0;j<10;j++){
                if(line[i] == num[j]){
                    sum += j;
                }
            }*/
            ascii = (int) line[i];
            if(ascii > 47 && ascii<58) {
                if(count == 0){
                    temp += ascii-48;
                    count +=1;
                }
                else{
                    temp = temp*pow(10,count) + (ascii-48);
                    count += 1;
                }
            }
            else{
                sum += temp;
                temp =0;
            }

        }
        if (temp!=0)
            sum += temp;
        System.out.println(sum);
    }
}
/**/