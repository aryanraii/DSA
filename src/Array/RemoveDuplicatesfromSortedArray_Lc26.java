package Array;

import java.util.HashMap;

public class RemoveDuplicatesfromSortedArray_Lc26 {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int i=0, j=1;
        while(j<n){
            if(nums[i]!=nums[j]){
                i++;
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
            j++;
        }
        int k=i+1;
        return k;
    }
}
