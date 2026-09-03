package BinarySearch;

public class MinimumNumberOfDaysToMakeMBouquets_Lc1482 {
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)m*k>bloomDay.length)return -1;
        int low=1;
        int high=0;
        for(int ele:bloomDay){
            high=Math.max(high,ele);
        }
        while(low<high){
            int mid=low+(high-low)/2;
            if(isPossible(bloomDay,mid,m,k)){
                high=mid;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    public boolean isPossible(int[]bloomDay,int mid,int m,int k){
        int result=0;
        int count=0;
        for(int i=0; i<bloomDay.length; i++){
            if(bloomDay[i]<=mid){
                count++;
                if(count==k){
                    result++;
                    count=0;
                }
            }else{
                count=0;
            }
        }
        return result>=m;
    }
}
