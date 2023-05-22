package practice;

public class nqueens {
    public static void main(String[] args){
        int N = 4;
        int[][] board = new int[N][N];
        if(!solveNQUtil(board, 0, N)){
            System.out.println("No solution");
            return;
        }
        printSolution(board,N);
    }
    public static boolean solveNQUtil(int[][] board,int col,int N){
        if(col>=N)
            return true;
        for(int i=0;i<N;i++){
            if(isSafe(board,i,col,N)){
                board[i][col] = 1;
                if(solveNQUtil(board,col+1,N))
                    return true;
                board[i][col] = 0;
            }
        }
        return false;
    }
    public static boolean isSafe(int[][] board,int row,int col,int N){
        int i,j;
        for(i=0;i<col;i++){
            if(board[row][i]==1)
                return false;
        }
        for(i=row,j=col;i>=0 && j>=0;i--,j--){
            if(board[i][j]==1)
                return false;
        }
        for(i=row,j=col;i<N && j>=0;i++,j--){
            if(board[i][j]==1)
                return false;
        }
        return true;
    }
    public static void printSolution(int[][] board,int N){
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                System.out.print(" "+board[i][j]+" ");
            }
            System.out.println();
        }
    }

}
