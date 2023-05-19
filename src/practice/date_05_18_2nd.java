package practice;

public class date_05_18_2nd {
    public static void main(String[] args){
        for(int i=2;i<200;i++){
            boolean value = isPrime(i);
            if(value && i>9){
                int temp = i;
                int rev = 0;
                while(temp!=0){
                    int rem = temp%10;
                    rev = rev*10+rem;
                    temp/=10;
                }
                boolean isPrime2 = isPrime(rev);
                if(isPrime2){
                    System.out.println(i);
                }
            }
        }
    }
    public static boolean isPrime(int num){
        for(int i=2;i<num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
