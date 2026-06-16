package Array;

import java.util.Arrays;

public class PlusOne_66 {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
        int sum=0;
        for(int i=n-1; i>=0; i--){
            if(digits[i]!=9){
                digits[i]+=1;
                return digits;
            }else{
                digits[i]=0;
            }
        }
        int arr[]=new int[n+1];
        Arrays.fill(arr,0);
        arr[0]=1;
        return arr;

    }
}
