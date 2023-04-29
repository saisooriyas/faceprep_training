import java.util.Scanner;

public class reverse_words {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String line = s.nextLine();
        char arr[] = line.toCharArray();
        int l_ind = line.length(),ent = 0;
        for(int i=line.length()-1;i>=0;i--){
            if(arr[i] == ' '){
                for(int j=i+1;j<l_ind;j++){
                    System.out.print(arr[j]+"");
                    ent = 1;
                }
                l_ind=i;
            }if (i==0){
                for(int j=i;j<l_ind;j++){
                    System.out.print(arr[j]+"");
                    ent = 1;
                }
            }
            if(ent == 1){
                System.out.print(" ");
                ent = 0;
            }
        }
    }
}
