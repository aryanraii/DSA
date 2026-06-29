package Array;

import java.util.HashMap;

public class LongestSubarraywithSumK_GFG {
    /// Time complexity-->O(n+n=2n); Space complexity-->O(1);
    public int longestSubarray(int[] arr, int k) {
        int left=0, right=0;
        int sum=arr[0];
        int maxLength=0;
        int n=arr.length;
        while(right<n){
            while(left<=right && sum>k){
                sum=sum-arr[left];
                left++;
            }
            if(sum==k){
                maxLength=Math.max(maxLength,right-left+1);
            }
            right++;
            if(right<n)sum+=arr[right];
        }
        return maxLength;

        /// Time complexity-->O(n)[AVG Case] Space complexity-->O(n)
//        HashMap<Integer, Integer> map = new HashMap<>();//map(sum, index)
//        int n = arr.length;
//        int sum=0;
//        int maxLength=0;
//        for (int i = 0; i < n; i++) {
//            sum+=arr[i];
//            if(sum==k){
//                maxLength=Math.max(maxLength,i+1);
//            }
//            int remaining=sum-k;
//
//            if(map.containsKey(remaining)){
//                int length=i-map.get(remaining);
//                maxLength=Math.max(maxLength,length);
//            }
//            if(!map.containsKey(sum)){
//                map.put(sum,i);
//            }
//        }
//        return maxLength;
    }
}
