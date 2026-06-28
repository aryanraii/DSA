package Array;

public class NumArray_Lc303 {
    int prefix[];
    public NumArray_Lc303(int[] nums) { ///  This is a constructor of class NumArray_Lc303
        prefix=new int[nums.length];
        prefix[0]=nums[0];
        for(int i=1; i<nums.length; i++){
            prefix[i]=prefix[i-1]+nums[i];
        }

    }

    public int sumRange(int left, int right) {
        if (left == 0) return prefix[right];
        return prefix[right] - prefix[left - 1];/// why left-1 ? Because prefix array store 0 to i sum in prefix[i];
    }
}
