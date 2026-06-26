package Array;

import java.util.ArrayList;
import java.util.List;

public class Permutations_Lc46 {
    /// Time Complexity-->O(n!*n) && Space Complexity-->O(n!);
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>ans=new ArrayList<List<Integer>>();
        getPerms(nums, 0, ans);
        return ans;
    }

    private void getPerms(int[] nums, int idx, List<List<Integer>> ans) {
        if(idx==nums.length){
            List<Integer> list=new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                list.add(nums[i]);
            }
            ans.add(list);
            return;
        }
        for(int i=idx; i<nums.length;i++){
            // Step 1-->Swapping within array without using extra space
            int temp=nums[idx];
            nums[idx]=nums[i];
            nums[i]=temp;
            //Step 2--> call next choice;
            getPerms(nums, idx+1, ans);
            //Step 3--> Backtracking
            temp=nums[idx];
            nums[idx]=nums[i];
            nums[i]=temp;

        }
    }
}
