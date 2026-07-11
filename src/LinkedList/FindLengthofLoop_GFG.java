package LinkedList;

public class FindLengthofLoop_GFG {
    public int lengthOfLoop(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        int count=0;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                ListNode temp=slow.next;
                while(temp!=slow){
                    count++;
                    temp=temp.next;
                }
                return ++count;
            }
        }
        return count;
    }
}
