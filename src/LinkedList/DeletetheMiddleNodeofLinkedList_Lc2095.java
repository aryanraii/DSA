package LinkedList;

public class DeletetheMiddleNodeofLinkedList_Lc2095 {
    //Time complexity-->O(n) space complexity-->O(1)
    public ListNode deleteMiddle(ListNode head) {
            ListNode slow=head;
            ListNode fast=head;
            ListNode pre=head;
            if(fast.next==null){
                return head.next;
            }
            while(fast!=null&&fast.next!=null){
                pre=slow;
                slow=slow.next;
                fast=fast.next.next;
            }
            pre.next=slow.next;
            return head;
    }
}
