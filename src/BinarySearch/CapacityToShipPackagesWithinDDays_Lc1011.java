package BinarySearch;

public class CapacityToShipPackagesWithinDDays_Lc1011 {
    public int shipWithinDays(int[] weights, int days) {
        int low =0;
        int high=0;
        for(int ele:weights){
            high+=ele;
            low=Math.max(ele,low);
        }
        while(low<high){
            int mid=low+(high-low)/2;
            if(isPossible(mid,weights,days)){
                high=mid;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    public boolean isPossible(int mid,int[]weights,int days){
        int countDays=1;
        int countWeight=0;
        for(int i=0; i<weights.length; i++){
            if(countWeight+weights[i]>mid){
                countDays++;
                countWeight=0;
            }
            countWeight+=weights[i];
        }
        return countDays<=days;
    }
}
