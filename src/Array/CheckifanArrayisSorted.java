package Array;

public class CheckifanArrayisSorted {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        boolean ans=checkSorting(arr);
        System.out.println(ans);
    }

    private static boolean checkSorting(int[] arr) {
        int n=arr.length;
        boolean flag1=true;
        boolean flag2=true;
        for(int i=0;i<n;i++){
            if(i<n-1 && arr[i]>arr[i+1]){
                flag1=false;
            }
            if(i<n-1 && arr[i]<arr[i+1]){
                flag2=false;
            }
        }
        return(flag1 || flag2);
    }
}
