package Recursion;

import java.util.ArrayList;

public class SubsetSums_GFG {
    public ArrayList<Integer> subsetSums(int[] arr) {
        ArrayList<Integer> res=new ArrayList<>();
        int sum=0;
        generateSum(0,res,arr,sum);
        return res;
    }

    private void generateSum(int idx, ArrayList<Integer> res, int[] arr, int sum) {
        if(idx==arr.length){
            res.add(sum);
            return;
        }

        //take
        generateSum(idx+1,res,arr,sum+arr[idx]);

        //not take
        generateSum(idx+1,res,arr,sum);
    }
}
