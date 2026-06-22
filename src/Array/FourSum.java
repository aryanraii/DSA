package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
//// Two pointer approach: Time complexity--> O(n^3 + nlog(n))
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n=nums.length;
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0; i<n; i++){
            if(i>0&&nums[i]==nums[i-1])continue;
            for(int j=i+1; j<n; j++){
                if(j>i+1&&nums[j]==nums[j-1])continue;
                int k=j+1;
                 int l=n-1;
                while(k<l) {
                    long sum = (long) nums[i] + (long) nums[j] + (long) nums[k] + (long) nums[l];
                    if (sum < target) k++;
                    else if (sum > target) l--;
                    else {
                        ArrayList<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        list.add(nums[l]);
                        res.add(list);
                        k++;
                        l--;
                        while (k < l && nums[k] == nums[k - 1]) k++;
                    }
                }
            }
        }
        return res;
    }
}
