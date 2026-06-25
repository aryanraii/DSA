package Array;

import java.util.Arrays;

public class NextPermutation_Lc31 {

    //Time Complexity--> O(n) && Space Complexity-->O(1)
    public void nextPermutation(int[] nums) {
        // Find the pivot-->
        int n=nums.length;
        int pivot=-1;
        for(int i=n-2; i>=0; i--){
            if(nums[i]<nums[i+1]) {
                pivot=i;
                break;
            }
        }
        if(pivot==-1){
            Arrays.sort(nums);//beacause array in decreasing order
            return;
            //in worst case Tc-->O(nlogn);
        }

        //2nd steo: Next larger element-->
        for(int i=n-1; i>pivot; i--){
            if(nums[i]>nums[pivot]){
                int temp=nums[pivot];
                nums[pivot]=nums[i];
                nums[i]=temp;
                break;
            }
        }

        //3rd step: reverse (pivot+1 to n-1)-->
        int j=n-1;
        int i=pivot+1;
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            j--;
            i++;
        }
    }
}
