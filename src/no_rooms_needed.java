import java.util.Arrays;
import java.util.Scanner;

public class no_rooms_needed {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int[] arr = {2,2,3};
        int sum=0,i=0,j=0,room =0;
        while(i<arr.length){
            if(arr[i] == 3){
                room++;
                i++;
            }
            else if(i<arr.length-1){
                if(arr[i]+arr[i+1] <= 4){
                    room++;
                    i+=2;
                }
            }
            else{
                room++;
                i+=1;
            }
        }
        /*for(int i=0;i<arr.length;i++){
            temp = 0;
            for(int j=i;j<arr.length-1;j+=2){
                if(arr[j]+arr[j+1] <= 4){
                    temp += arr[j]+arr[j+1];
                }
                else{
                    if(arr[j] == 3){
                        room++;
                    }
                }
            }
            if(temp == 4 || temp == 3){
                room++;
            }
        }*/
        System.out.println(room);
    }
}
