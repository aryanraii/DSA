package Recursion;

import java.util.HashSet;

public class ValidSudoku_36 {
    //Time complexity-->O(m*n) space complexity-->O(k) k is size of set
    public boolean isValidSudoku(char[][] board) {
       int m = board.length;
       int n = board[0].length;
       HashSet<String>set = new HashSet<>();
       for(int i = 0; i < m; i++){
           for(int j = 0; j < n; j++){
               if(board[i][j] == '.'){
                   continue;
               }
               String row=board[i][j]+"_ROW_"+i;//mujhe board[i][j] row i me mila
               String col=board[i][j]+"_COL_"+j;//mujhe board[i][j] col j me mila
               String box=board[i][j]+"_BOx_"+(i/3)+(j/3);//mujhe board[i][j] box i/3,j/3 me mila

               if(set.contains(box)||set.contains(row)||set.contains(col)){
                   return false;
               }
               set.add(row);
               set.add(col);
               set.add(box);
           }
       }
       return true;
    }

//    public boolean isValidSudoku(char[][] board) {
//        int m=board.length;
//        int n=board[0].length;
//        //check Row
//        for(int row=0;row<m;row++){
//            HashSet<Character> set=new HashSet<>();
//            for(int col=0;col<n;col++){
//                if(board[row][col]=='.'){
//                    continue;
//                }
//                if(set.contains(board[row][col])){
//                    return false;
//                }
//                set.add(board[row][col]);
//            }
//        }
//
//        //check colomn
//        for(int col=0;col<n;col++){
//            HashSet<Character> set=new HashSet<>();
//            for(int row=0;row<m;row++){
//                if(board[row][col]=='.'){
//                    continue;
//                }
//                if(set.contains(board[row][col])){
//                    return false;
//                }
//                set.add(board[row][col]);
//            }
//        }
//        //check for 3*3 grid
//
//        for(int row=0;row<m;row+=3){
//            int endrow=row+2;
//            for(int col=0;col<n;col+=3){
//                int endcol=col+2;
//
//                //check
//                if(!traverseGrid(board,row,endrow,col,endcol)){
//                    return false;
//                }
//            }
//        }
//        return true;
//    }
//
//    private boolean traverseGrid(char[][] board, int row, int endrow, int col, int endcol) {
//        HashSet<Character> set=new HashSet<>();
//        for(int i=row;i<=endrow;i++){
//            for(int j=col;j<=endcol;j++){
//                if(board[i][j]=='.'){
//                    continue;
//                }
//                if(set.contains(board[i][j])){
//                    return false;
//                }
//                set.add(board[i][j]);
//            }
//        }
//        return true;
//    }
}
