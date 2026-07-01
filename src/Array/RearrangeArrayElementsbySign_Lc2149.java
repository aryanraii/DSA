package Array;

import java.util.ArrayList;
import java.util.HashMap;

public class RearrangeArrayElementsbySign_Lc2149 {
    /// Time complexity-->O(N) && Space complexity-->O(N);
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int []ans=new int[n];
        int posIndex=0, negIndex=1;
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                ans[posIndex]=nums[i];
                posIndex+=2;
            }else{
                ans[negIndex]=nums[i];
                negIndex+=2;
            }
        }
        return ans;
    }

    /// Time Complexity-->O(N) && Space complexity-->O(N)
//    public int[] rearrangeArray(int[] nums) {
//        int n=nums.length;
//        ArrayList<Integer> pos=new ArrayList<Integer>();
//        ArrayList<Integer> neg=new ArrayList<Integer>();
//
//        for(int i=0; i<n; i++){
//            if(nums[i]<0){
//                neg.add(nums[i]);
//            }
//            if(nums[i]>0){
//                pos.add(nums[i]);
//            }
//        }
//
//        for(int i=0; i<n/2; i++){
//            nums[2*i]=pos.get(i);
//            nums[2*i+1]=neg.get(i);
//        }
//        return nums;
//
//    }
}
