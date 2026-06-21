package Array;

public class RemoveElement_Lc27 {
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
        int i=0;
        int j=1;
        while(j<n){
            if(nums[i]==val&&nums[j]!=val){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
                j++;
            }
            else if(nums[j]==val){
                j++;
            }
            else{
                j++;
                i++;
            }
        }
        return i;
    }
}
