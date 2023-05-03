import java.util.*;
class Inverted_pattern{
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        char arr[] = str.toCharArray();
        char key = s.next().charAt(0);

        for(int i=str.length()-1;i>0;i--){
            if(arr[i] == key){
                for(int j=i;j<str.length();j++){
                    System.out.print(arr[j]);
                }
                System.out.print("\n");
            }
        }
        System.out.print(str);
    }
}

/*import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		char arr[] = str.toCharArray();
		char key = s.next().charAt(0);
		for(int i=0;i<str.length();i++){
		    if(arr[i] == key){
		        for(int j=0;j<=i;j++){
		            System.out.print(arr[j]);
		        }
		        System.out.print("\n");
		    }
		}
		System.out.print(str);
	}
}
*/