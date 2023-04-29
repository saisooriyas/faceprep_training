import java.util.Scanner;

public class rem_com_ele {
    public static void main(String[] ar){
        Scanner s = new Scanner(System.in);
        String str1 = s.next();
        String str2 = s.next();
        String str3 = str1.toLowerCase(), str4 = str2.toLowerCase();
        char arr1[] = str3.toCharArray();
        char arr2[] = str4.toCharArray();
        int count = 0;
        for(int i=0;i<str3.length();i++){
            count = 0;
            for(int j=0;j<str4.length();j++){

                if(arr1[i] == arr2[j]){
                    count = 1;
                }
            }
            if (count == 0)
                System.out.print(arr1[i]+" ");
        }
    }
}
