package Array;

import java.util.*;

public class ThreeSum {
//// Two pointer Approach: Time Complexity--> O(n^2+nlog(n)) & Sc-->O(Unique Triplet);
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        ArrayList<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0; i<n; i++){
            if(i>0&& nums[i]==nums[i-1]) continue;
            int j=i+1;
            int k=n-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum<0) j++;
                else if(sum>0) k--;
                else {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    res.add(list);
                    j++;
                    k--;
                    while(j<k && nums[j]==nums[j-1]) j++;
                }
            }
        }
        return res;
    }


//// Approach with hashing: Time Complexity-->O(n^2 * log(Unique Triplets));
    //public List<List<Integer>> threeSum(int[] nums) {
    //
    //    HashSet<List<Integer>> hashSet = new HashSet<>();
    //
    //    int n = nums.length;
    //
    //    for (int i = 0; i < n; i++) {
    //
    //        HashSet<Integer> set = new HashSet<>();
    //
    //        for (int j = i + 1; j < n; j++) {
    //
    //            int third = -(nums[i] + nums[j]);
    //
    //            if (set.contains(third)) {
    //
    //                ArrayList<Integer> list = new ArrayList<>();
    //
    //                list.add(nums[i]);
    //                list.add(nums[j]);
    //                list.add(third);
    //
    //                Collections.sort(list);
    //
    //                hashSet.add(list);
    //            }
    //
    //            set.add(nums[j]);
    //        }
    //    }
    //
    //    return new ArrayList<>(hashSet);
    //}


//// Approach with Recursion and Backtracking: Time Complexity--> O(2^n);
    //    public List<List<Integer>> threeSum(int[] nums) {
    //
    //        HashSet<List<Integer>> set = new HashSet<>();
    //        ArrayList<Integer> list = new ArrayList<>();
    //
    //        solve(0, nums, list, set);
    //
    //        return new ArrayList<>(set);
    //    }
    //
    //    private void solve(int idx, int[] nums,
    //                       ArrayList<Integer> list,
    //                       HashSet<List<Integer>> set) {
    //
    //        if (list.size() == 3) {
    //
    //            int sum = 0;
    //
    //            for (int x : list) {
    //                sum += x;
    //            }
    //
    //            if (sum == 0) {
    //                ArrayList<Integer> temp = new ArrayList<>(list);
    //                Collections.sort(temp);
    //                set.add(temp);
    //            }
    //
    //            return;
    //        }
    //
    //        if (idx == nums.length) {
    //            return;
    //        }
    //
    //        // Pick
    //        list.add(nums[idx]);
    //        solve(idx + 1, nums, list, set);
    //
    //        // Backtrack
    //        list.remove(list.size() - 1);
    //
    //        // Not Pick
    //        solve(idx + 1, nums, list, set);
    //    }


}
