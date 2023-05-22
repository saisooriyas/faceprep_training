package practice;

public class swap {
    public static void main(String[] args){
        String str = "abcd";
        char[] arr = str.toCharArray();
        int len = arr.length;
        func(arr,0,len-1);
    }
    public static void func(char[] arr,int l,int r){
        if(l==r){
            System.out.println(arr);
        }
        else{
            for(int i=l;i<=r;i++){
                swap(arr,l,i);
                func(arr,l+1,r);
                swap(arr,l,i);
            }
        }
    }
    public static void swap(char[] arr,int l,int r){
        char temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }
}
