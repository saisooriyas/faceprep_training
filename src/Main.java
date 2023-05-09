//Input: This is 5097 and 97 and 8053
//Output: 8053

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        String[] arr = input.split(" ");
        int[] num = new int[arr.length];
        int count = 0,val = 0,temp,j=0;
        for (String value : arr) {
            if (value.matches("\\d+")) {
                //convert String number to integer
                temp = Integer.parseInt(value);
                val = val * 10 + temp;
                count = 1;
            } else {
                count = 0;
            }
            if (count == 0) {
                num[j] = val;
                val = 0;
                j += 1;
            }
        }
        num[j] = val;
        int max = num[0];
        for(int i=1;i<num.length;i++){
            if(num[i]>max){
                max = num[i];
            }
        }
        System.out.println(max);
    }
}

