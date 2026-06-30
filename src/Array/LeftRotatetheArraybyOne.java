package Array;

public class LeftRotatetheArraybyOne {
    public static void main(String[] args) {
        int arr[]={1, 2, 3, 4, 5};
        int n=arr.length;
        for(int i=1; i<n; i++){
            int temp=arr[i];
            arr[i]=arr[i-1];
            arr[i-1]=temp;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
