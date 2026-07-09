package Recursion;

public class WordSearch_Lc79 {
    //Time complexity-->O(m*n*3^L) where L is word length
    static int m,n;
    public boolean exist(char[][] board, String word) {
         m=board.length;
         n=board[0].length;
         for(int i=0;i<m;i++){
             for(int j=0;j<n;j++){
                 if(board[i][j]==word.charAt(0) && find(board,i,j,0,word)){
                     return true;
                 }
             }
         }
         return false;
    }

    private boolean find(char[][] board, int i, int j, int idx, String word) {
        if(idx==word.length()){
            return true;
        }
        if(i<0||j<0||i>=m||j>=n||board[i][j]=='$'){
            return false;
        }
        if(board[i][j]!=word.charAt(idx)){
            return false;
        }

        char temp=board[i][j];
        board[i][j]='$';
        boolean check=
                //up
                find(board,i-1,j,idx+1,word)||
                //down
                find(board,i+1,j,idx+1,word)||
                //left
                 find(board,i,j-1,idx+1,word)||
                //right
                find(board,i,j+1,idx+1,word);

        board[i][j] = temp;
        return check;
    }

}
