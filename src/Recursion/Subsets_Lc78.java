package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Subsets_Lc78 {
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<List<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> list=new ArrayList<>();
        generateSubset(0,list,ans,nums);
        Collections.sort(list);
        return ans;
    }

    private void generateSubset(int i, ArrayList<Integer> list, ArrayList<List<Integer>> ans, int[] nums) {
        if(i==nums.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        //take-->
        list.add(nums[i]);
        //explore
        generateSubset(i+1,list,ans,nums);
        list.remove(list.size()-1);

        //not take
        generateSubset(i+1,list,ans,nums);
    }
}
