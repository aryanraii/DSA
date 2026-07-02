package Array;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix_Lc54 {
    //Time complexity-->O(N*M);
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        List<Integer> list = new ArrayList<>();

        // pattern: Right->Bottom->left->top;
        int left = 0, right=m-1;
        int top = 0, bottom=n-1;


         while(top<=bottom && left<=right){
             //Rigth-->
             for(int i=left; i<=right; i++){
                 list.add(matrix[top][i]);
             }
             top++;

             //Bottom
             for(int i=top; i<=bottom; i++){
                 list.add(matrix[i][right]);
             }
             right--;

             //Left
             if(top<=bottom) {
                 for (int i = right; i >= left; i--) {
                     list.add(matrix[bottom][i]);
                 }
                 bottom--;
             }

             //Top
             if(left<=right) {
                 for (int i = bottom; i >= top; i--) {
                     list.add(matrix[i][left]);
                 }
                 left++;
             }
         }
        return list;
    }
}
