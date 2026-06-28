package Array;

import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMaximum_Lc239 {
    /// Time complexity-->O(n); Space complexity-->O(n);
    public int[] maxSlidingWindow(int[] nums, int k) {
        int len=nums.length;
        Deque<Integer> deque=new LinkedList<>();
        int[] res=new int[len-k+1];

        /// first window-->
        for(int i=0; i<k; i++){
            while(deque.size()>0&&nums[deque.getLast()]<=nums[i]){
                deque.removeLast();
            }
            deque.addLast(i);
        }
        int idx=0;
        for(int i=k; i<len;i++){
            res[idx++]=nums[deque.getFirst()];

            ///  remove element not part of current window
            while(deque.size()>0&& deque.getFirst()<=i-k){
                deque.removeFirst();
            }

            ///  remove the smaller vals
            while(deque.size()>0&& nums[deque.getLast()]<=nums[i]){
                deque.removeLast();
            }
            deque.addLast(i);
        }

        res[idx]=nums[deque.getFirst()];
        return res;
    }
}
