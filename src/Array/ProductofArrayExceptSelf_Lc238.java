package Array;

public class ProductofArrayExceptSelf_Lc238 {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        //Approach4--> without extra space;
        int[]result=new int[n];
        int rp=1;
        result[0]=1;
        for(int i=1; i<n; i++){
            result[i]=result[i-1]*nums[i-1];
        }

        for(int i=n-1; i>=0; i--){
            result[i]=result[i]*rp;
            rp=rp*nums[i];
        }
        return result;
        //Approach 3-->with extra space
        // int[]left=new int[n];
        // int[]right=new int[n];
        // left[0]=1;
        // right[n-1]=1;
        // for(int i=1; i<n; i++){
        //     left[i]=left[i-1]*nums[i-1];
        //     right[n-i-1]=right[n-i]*nums[n-i];
        // }
        // for(int i=0; i<n; i++){
        //     nums[i]=left[i]*right[i];
        // }
        // return nums;
        //Approach 2-->
        // int small=-1;
        // int max=1;
        // int zeros=0;
        // for(int i=0; i<n; i++){
        //     if(nums[i]==0){
        //         zeros++;
        //         small=0;
        //     }else{
        //         max*=nums[i];
        //     }
        // }
        // int ans[]=new int[n];
        // Arrays.fill(ans,0);
        // if(zeros>1)return ans;
        // for(int i=0; i<n; i++){
        //     if(small!=-1&&nums[i]==0){
        //         ans[i]=max;
        //     }else if(small!=-1&&nums[i]!=0){
        //         ans[i]=0;
        //     }else{
        //         ans[i]=max/nums[i];
        //     }
        // }
        // return ans;
        // int ans[]=new int[n];
        // for(int i=0; i<n; i++){
        //     int num=1;
        //     for(int j=0; j<n; j++){
        //         if(i==j)continue;
        //         num*=nums[j];
        //     }
        //     ans[i]=num;
        // }
        // return ans;
    }
}
