package Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MajorityElement_II_Lc229 {
    // Boyer-Moore Voting Algorithhm-->
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int count1 = 0;
        int count2 = 0;
        int majEle1=0;
        int majEle2=0;
        for(int i=0; i<n; i++){
            if(nums[i]==majEle1){
                count1++;
            }
            else if(nums[i]==majEle2){
                count2++;
            }
            else if(count1==0){
                majEle1=nums[i];
                count1=1;
            }
            else if(count2==0){
                majEle2=nums[i];
                count2=1;
            }
            else{
                count1--;
                count2--;
            }
        }
        List<Integer>result=new ArrayList<>();
        int freq1=0;
        int freq2=0;
        for(int ele:nums){
            if(majEle1==ele){
                freq1++;
            }
            else if(majEle2==ele){
                freq2++;
            }
        }

        if(freq1>n/3) result.add(majEle1);
        if(freq2>n/3) result.add(majEle2);
        return result;
    }
//    public List<Integer> majorityElement(int[] nums) {
//        List<Integer> ans=new ArrayList<>();
//        HashMap<Integer,Integer> map=new HashMap<>();
//        int n=nums.length;
//        int count=n/3;
//        for(int ele:nums){
//            if(!map.containsKey(ele)){
//                map.put(ele,1);
//            }else{
//                int freq=map.get(ele);
//                map.put(ele,freq+1);
//            }
//        }
//        for(int freq:map.keySet()){
//            int check= map.get(freq);
//            if(check>count){
//                ans.add(freq);
//            }
//        }
//        return ans;
//    }
}
