package BinarySearch;

public class KthMissingPositiveNumber_Lc1539 {
    public int findKthPositive(int[] arr, int k) {
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int missingElement=arr[mid]-(mid+1);//tricky part do dry run;
            if(missingElement<k){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return low+k; //also mimp and tricky part
    }
    // public int findKthPositive(int[] arr, int k) {
    //     int num=1;
    //     int i=0;
    //     while(i<arr.length && k>0){
    //          if(num==arr[i]){
    //             i++;
    //          }else{
    //             k--;
    //          }
    //          num++;
    //     }
    //     while(k!=0){
    //         num++;
    //         k--;
    //     }
    //     return num-1;
    // }
}
