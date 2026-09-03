package BinarySearch;

public class KokoEatingBananas_Lc875 {
    public int minEatingSpeed(int[] piles, int h) {
        // Arrays.sort(piles);
        // int low=1;
        // int high=piles[piles.length-1];
        // return minimumHour(low,high,piles,h);

        int low=1;
        int high=0;
        for(int ele:piles){
            high=Math.max(high,ele);
        }
        while(low<high){
            int mid=low+(high-low)/2;
            if(canEatAll(piles,mid,h)){
                high=mid;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    public boolean canEatAll(int[]piles,int mid,int h){
        int countHour=0;
        for(int ele:piles){
            countHour+=ele/mid;
            if(ele%mid!=0){
                countHour++;
            }
        }
        return countHour<=h;
    }
    // public int minimumHour(int low,int high, int[]piles, int hour){
    //     if(low==high) return low;
    //     int  mid=low+(high-low)/2;
    //     int result=0;
    //     for(int i=0; i<piles.length; i++){
    //         result+=piles[i]/mid;

    //         if(piles[i]%mid!=0){
    //             result++;
    //         }
    //     }
    //     if(result<=hour){
    //         return minimumHour(low,mid,piles,hour);
    //     }else{
    //         return minimumHour(mid+1,high,piles,hour);
    //     }
    // }
}
