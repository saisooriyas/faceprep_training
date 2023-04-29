import java.util.Scanner;

class SineWave {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


            int m = sc.nextInt();
            int n = sc.nextInt();
            int[][] arr = new int[m][n];

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            // loop to traverse matrix
            for (int j = 0; j < n; j++) {
                // if the current column is even indexed, print it in forward order
                if (j % 2 == 0) {
                    for (int i = 0; i < m; i++) {
                        System.out.print(arr[i][j] + " ");
                    }
                }
                // if the current column is odd indexed, print it in reverse order
                else {
                    for (int i = m - 1; i >= 0; i--) {
                        System.out.print(arr[i][j] + " ");
                    }
                }
            }
            System.out.println();

    }
}
