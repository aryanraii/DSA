package Recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum_Lc39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        generateCombination(0,candidates,target,ans,list);
        return ans;
    }

    private void generateCombination(int i, int[] candidates, int target, List<List<Integer>> ans, List<Integer> list) {
        if(i==candidates.length){
            if(target==0){
                ans.add(new ArrayList<>(list));
            }
            return;
        }
        //take-->
        list.add(candidates[i]);
        if(target>0) {
            generateCombination(i, candidates, target - candidates[i], ans, list);
        }
        list.remove(list.size()-1);
        //jab sum>target
        generateCombination(i+1,candidates,target,ans,list);
    }
}
