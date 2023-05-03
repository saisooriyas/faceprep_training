import java.util.Scanner;

public class prime_no_freq {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int freq[] = new int[num];
        freq[0] =1;
        for(int i=2;i<num;i++){
            for(int j=2;j<num;j++){
                if(i*j <= num){
                    freq[(i*j)-1] = 1;
                }
                else{
                    break;
                }
            }
        }
        for(int i=0;i<num;i++) {
            if (freq[i] == 0) {
                System.out.print((i + 1) + " ");
            }
        }
        System.out.println();
        /*System.out.print("2 3 5 7 ");
        for(int i= 2;i<num;i++){
            if(i%2 == 0){
                continue;
            }
            if(i%3 == 0){
                continue;
            }
            if(i%5 == 0){
                continue;
            }
            if(i%7 == 0){
                continue;
            }
            System.out.print(i+ " ");
        }*/
    }
}