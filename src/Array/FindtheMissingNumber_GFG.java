package Array;

public class FindtheMissingNumber_GFG {
    /// Time complexity-->O(n);
    int missingNum(int arr[]) {
        int  n=arr.length;
        long totalSum=(long)(n+1)*(n+2)/2;
        long sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        return (int)(totalSum-sum);
    }
}
