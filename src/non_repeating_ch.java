import java.util.Scanner;

public class non_repeating_ch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String string = s.next();
        char arr[] = string.toCharArray();
        /*int index = -1;
        char fnc = ' ';
        for (char i : string.toCharArray()) {
            if (string.indexOf(i) == string.lastIndexOf(i)) {
                fnc = i;
                break;
            }
            else {
                index += 1;
            }
        }
        if (index == 1) {
            System.out.println("None");
        }
        else {
            System.out.println(fnc);
        }*/
        int num_t[] = new int[string.length()];
        for(int i=0;i<string.length();i++){
            for(int j=0;j<string.length();j++){
                if(i != j){
                    if(arr[i] == arr[j]){
                        num_t[i] += 1;
                    }
                }
            }
        }
        for(int i=0;i<string.length();i++){
            if (num_t[i] == 0){
                System.out.println(arr[i]);
                break;
            }
        }
    }
}