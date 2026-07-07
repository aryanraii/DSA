package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SubsetsII_Lc90 {
    //Time complexity-->O(2^n)
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        Arrays.sort(nums);
        generateSubset(0,nums,res,list);
        return res;
    }

    private void generateSubset(int i, int[] nums, List<List<Integer>> res, List<Integer> list) {
        if(i==nums.length){
            res.add(new ArrayList<>(list));
            return;
        }
        //take
        list.add(nums[i]);
        generateSubset(i+1,nums,res,list);

        list.remove(list.size()-1);//undo

        //Skipping duplicates
        int idx=i+1;
        while(idx<nums.length&&nums[idx]==nums[idx-1]){
            idx++;
        }
        //not take
        generateSubset(idx,nums,res,list);
    }
}
