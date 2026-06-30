package Array;

import java.util.Collections;
import java.util.PriorityQueue;

public class SecondLargestElement {
    public static void main(String[] args) {
        int arr[]={-1,-2,-9,-5,0};
        int ele=findSecondLargest(arr);
        System.out.println(ele);

    }
    // Time Complexity-->O(N)
    public static int findSecondLargest(int[] arr) {
        int n=arr.length;
        int largest=Integer.MIN_VALUE;//if arr contains negative values
        int SLargest=Integer.MIN_VALUE;;//if arr contains negativve values
        for(int i=0;i<n;i++){
            if(arr[i]>largest) {
                 SLargest=largest;
                 largest=arr[i];
            }
            else if(arr[i]<largest && arr[i]>SLargest) {
                SLargest=arr[i];
            }
        }
        return SLargest;
    }

    //Time Complexity-->O(2N);
//    public static int findSecondLargest(int[] arr) {
//        int n=arr.length;
//        int largest=Integer.MIN_VALUE;
//        for(int i=0;i<n;i++){
//            if(arr[i]>largest) {
//                largest = arr[i];
//            }
//        }
//
//        int SLargest=Integer.MIN_VALUE;
//        for(int i=0;i<n;i++){
//            if(arr[i]>SLargest &&  arr[i]!=largest){
//                SLargest=arr[i];
//            }
//        }
//        return SLargest;
//    }
}
