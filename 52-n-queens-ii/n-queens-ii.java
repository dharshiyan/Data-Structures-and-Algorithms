class Solution {
    public int totalNQueens(int n) {
        char [][] board = new char[n][n];
        for (int i=0; i<n;i++){
            for (int j= 0; j<n;j++){
                board[i][j]='.';
            }
        }
        return bt(board,0,n);

    }
    private int bt( char [][] board, int row, int n){
        if (row==n) return 1;
        int count =0;
        for (int col=0; col<n;col++){
            if (istrue(board,row,col,n)){
                board[row][col]='Q';
                count+= bt(board,row+1,n);
                board[row][col]='.';
            }
        }
        return count;
    }
    private boolean istrue( char[][] board, int row , int col, int n){
        for (int i=0; i<row; i++) if (board[i][col]=='Q') return false; // curent row
        for (int i=row-1,j=col-1;i>=0 && j>=0; i--,j--)  if (board[i][j]=='Q') return false; //left diagolnal
        for (int i = row-1 ,j=col+1;i>=0 && j<n; i--,j++) if (board[i][j]=='Q') return false; // previous row , next col
        return true;
    }
}