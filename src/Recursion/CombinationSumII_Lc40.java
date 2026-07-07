package Recursion;

import java.util.*;

public class CombinationSumII_Lc40 {
    //Time complexity-->O(2^n) space complexity-->O(n)
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        Arrays.sort(candidates);
        generateCombination(candidates,target,ans, list,0);
        return ans;
    }

    private void generateCombination(int[] candidates, int target, List<List<Integer>> ans, List<Integer> list, int idx) {
        if(target<0)return;
        if(target==0){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=idx;i<candidates.length;i++){
            if(i>idx && candidates[i]==candidates[i-1]){
                continue;
            }
            list.add(candidates[i]);//Do
            generateCombination(candidates,target-candidates[i],ans,list,i+1);//explore
            list.remove(list.size()-1);//undo

        }
    }

}
