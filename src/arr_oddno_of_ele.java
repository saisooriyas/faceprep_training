import java.util.Scanner;

public class arr_oddno_of_ele {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int arr[] = new int[num];
        int max = 0;
        for(int i=0;i<num;i++){
            arr[i] = s.nextInt();
            if (arr[i]>max)
                max = arr[i];
        }

        /*int freq[] = new int[max+1];
        for(int i=0;i<num;i++){
            freq[arr[i]] += 1;
        }
        for(int i=0;i<num;i++){
            if(freq[arr[i]]%2 == 1){
                System.out.print(arr[i]+" ");
            }
        }*/
        int freq[] = new int[num];
        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                if(arr[i]==arr[j]){
                    if(j<i){
                        if(freq[j]%2 == 1){
                            freq[i] = 0;
                            break;
                        }
                        freq[i] = freq[j];
                        break;
                    }
                    else{
                        freq[i] += 1;
                    }
                }
            }
        }
        for(int i=0;i<num;i++){
            if(freq[i]%2 == 1){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
