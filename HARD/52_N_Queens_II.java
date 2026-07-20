// Time Complexity - O(n * n!)

// {"The backtracking search itself explores about N!
// states, but in my implementation each candidate 
// placement calls isSafe(), which takes O(N) time 
// because it scans the column and two diagonals. 
// Therefore the overall time complexity is O(N × N!)."}

// Space Complexity - O(n²)



class Solution {
    int count = 0;
    public int totalNQueens(int n) {
        int board[][] = new int[n][n];
        nQueens(board,0);
        return count;
    }

    public void nQueens(int board[][],int row){
        if(row==board.length){
            count++;
            return;
        }
        for(int col=0;col<board.length;col++){
            if(isSafe(board,row,col)){
                board[row][col] = 1;
                nQueens(board,row+1);
                board[row][col] = 0;
            }
        }
    }

    public boolean isSafe(int board[][],int row,int col){
        for(int i=row-1;i>=0;i--){
            if(board[i][col] == 1){
                return false;
            }
        }
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--,j--){
            if(board[i][j] == 1){
                return false;
            }
        }
        for(int i=row-1, j=col+1; i>=0 && j<board.length; i--,j++){
            if(board[i][j] == 1){
                return false;
            }
        }
        return true;
    }
}