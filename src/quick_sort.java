import java.util.Scanner;
class quick_sort
{
    public static void main(String[] args)
    {
        int i,n;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        int[] arr = new int[n];
        for(i=0; i<n; i++)
        {
            arr[i] = scan.nextInt();
        }

        quickSort(arr, 0, n-1);
        for(i=0; i<n; i++)
        {
            System.out.print(arr[i]+ "  ");
        }
    }
    public static void quickSort(int[] arr, int low, int high)
    {
        int i=low, j=high, temp, pivot=arr[(low+high)/2];
        while(i<=j)
        {
            while(arr[i]<pivot)
            {
                i++;
            }
            while(arr[j]>pivot)
            {
                j--;
            }
            if(i<=j)
            {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
        if(low<j)
        {
            quickSort(arr, low, j);
        }
        if(i<high)
        {
            quickSort(arr, i, high);
        }
    }
}