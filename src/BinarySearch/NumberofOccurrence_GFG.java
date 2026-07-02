package BinarySearch;

public class NumberofOccurrence_GFG {
    int countFreq(int[] arr, int target) {
        int first=firstOccur(arr,target);
        if(first==-1) return 0;
        int last=lastOccur(arr,target);
        int ans=last-first+1;
        return ans;
    }

    private int lastOccur(int[] arr, int target) {
        int low=0;
        int high=arr.length-1;
        int last=-1;
        while (low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]==target){
                last=mid;
                low=mid+1;
            }else if(arr[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return last;
    }

    private int firstOccur(int[] arr, int target) {
        int low=0;
        int high=arr.length-1;
        int first=-1;
        while (low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target) {
                first = mid;
                high = mid - 1;
            }else if(arr[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return first;
    }
}
