package LinkedList;

import java.util.HashSet;
import java.util.List;

public class LinkedListCycleII_Lc142 {
    //Time complexity-->O(n) space complexity-->O(1)
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                 slow=head;
                 while(slow!=fast){
                     slow=slow.next;
                     fast=fast.next;
                 }
                 return slow;
            }
        }
        return null;
    }
    //Time complexity-->O(n) space complexity-->O(n)
//    public ListNode detectCycle(ListNode head) {
//        HashSet<ListNode> set = new HashSet<ListNode>();
//        ListNode cur = head;
//        while (cur!=null){
//            if(set.contains(cur)){
//                return cur;
//            }else{
//                set.add(cur);
//
//            }
//            cur = cur.next;
//        }
//        return null;
//    }
}
