package Array;

public class LargestelementinanArray {
    public static void main(String[] args) {
        int arr[]={2, 5, 1, 3, 0};
        int n=arr.length;
        int largest=-1;
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println(largest);
    }
}
