package Recursion;

public class SubsequencewithSumK_GFG {
    //Time complexity-->O(2^n) and space complexity-->O(n)
    public boolean checkSubsequenceSum(int[] arr, int k) {
        int sum=0;
        return check(arr,k,0,sum);
    }

    private boolean check(int[] arr, int k, int i, int sum) {
        if(i==arr.length){
            return sum==k;
        }
        if(check(arr,k,i+1,sum+arr[i])){
            return true;
        }
        return check(arr,k,i+1,sum);
    }
}
