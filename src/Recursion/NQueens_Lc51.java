package Recursion;

import java.util.ArrayList;
import java.util.List;

public class NQueens_Lc51 {
    //TIme complexity-->O(n!)
    private List<List<String>> res = new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
         if(n==0) return new ArrayList<>();
         List<String> board = new ArrayList<>();
         for(int i=0;i<n;i++){
             StringBuilder sb = new StringBuilder();
             for(int j=0;j<n;j++){
                 sb.append('.');
             }
             board.add(sb.toString());
         }
         solve(board,0);
         return res;

    }

    private void solve(List<String> board, int row) {
        if(row==board.size()){
            res.add(new ArrayList<>(board));
            return;
        }
        for(int i=0;i<board.size();i++){
            if(isValid(board,row,i)){
                StringBuilder sb = new StringBuilder(board.get(row));
                sb.setCharAt(i,'Q');
                board.set(row,sb.toString());

                solve(board,row+1);

                sb.setCharAt(i,'.');
                board.set(row,sb.toString());

            }
        }
    }

    private boolean isValid(List<String> board, int row, int col) {
        //Look ofr up
        for(int i=row; i>=0;i--){
            if(board.get(i).charAt(col)=='Q'){
                return false;
            }
        }
        //check left digonal upwards
        for(int i=row,j=col; i>=0&&j>=0;i--,j--){
            if(board.get(i).charAt(j)=='Q'){
                return false;
            }
        }
        //check right digonal upwards
        for(int i=row,j=col; i>=0&&j< board.size();i--,j++){
            if(board.get(i).charAt(j)=='Q'){
                return false;
            }
        }
        return true;
    }


}
