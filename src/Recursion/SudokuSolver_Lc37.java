package Recursion;

public class SudokuSolver_Lc37 {
    //Time complexity-->O(9^81) which is constant
    public void solveSudoku(char[][] board) {
         solve(board);
    }

    private boolean solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        for(int row=0; row<m; row++){
            for(int col=0; col<n; col++){
                if(board[row][col] == '.'){

                    for(char d='1';d<='9';d++){

                        if(isValid(board,row,col,d)){
                             board[row][col] = d;
                             //explore
                             if(solve(board)) return true;
                            //backtracking
                            board[row][col] = '.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isValid(char[][] board, int row, int col, char d) {
        for(int i=0;i<9;i++){
            if(board[row][i]==d){
                return false;
            }
            if(board[i][col]==d){
                return false;
            }
        }
        //box check
        int start_i=(row/3) * 3;
        int start_j=(col/3) * 3;

        for(int k=0; k<3; k++){
            for(int l=0; l<3; l++){
                if(board[start_i+k][start_j+l]==d){
                    return false;
                }
            }
        }
        return true;
    }
}
