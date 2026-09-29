package GreedyAlogrithms;

public class MinimumPlatforms_GFG {
    public int minPlatform(int arr[], int dep[]) {
        // Arrays.sort(arr);
        // Arrays.sort(dep);
        // int n=arr.length;
        // int arrival=0;
        // int dept=0;
        // int count=0;
        // int maxCount=0;
        // while(arrival<n){
        //     if(arr[arrival]<=dep[dept]){
        //         count=count+1;
        //         arrival++;
        //     }else{
        //         count=count-1;
        //         dept++;
        //     }
        //     maxCount=Math.max(maxCount,count);
        // }
        // return maxCount;

        int maxCount=0;
        int n=arr.length;
        if(n==1)return 1;
        for(int i=0; i<n; i++){
            int count=0;
            for(int j=0; j<n; j++){
                if(arr[j] <= dep[i] && dep[j] >= arr[i]) {
                    count++;
                }
            }
            maxCount=Math.max(maxCount,count);
        }
        return maxCount;
    }
}
