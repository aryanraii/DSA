package Recursion;

import java.util.Stack;

public class SortaStack {
    //Time complexity-->O(n^2) space complexity-->O(n)
    public void sortStack(Stack<Integer> st) {
        int len = st.size();
        int[]arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = st.pop();
        }
        sortArray(0,arr);
        for (int i = 0; i < len; i++) {
            st.push(arr[i]);
        }
    }

    private void sortArray(int i, int[] arr) {
        if(i==arr.length){
            return;
        }
        int st=i;
        int small=i;
        for(int idx=i+1; idx<arr.length; idx++){
            if(arr[idx]<arr[small]){
                small=idx;
            }
        }
        int temp=arr[small];
        arr[small]=arr[st];
        arr[st]=temp;
        sortArray(i+1,arr);
    }
}
