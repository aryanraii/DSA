package LinkedList;

import java.util.Stack;

public class ReverseLinkedList_Lc206 {
    //Reccursive approach-->
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        return reverse(head,prev);
    }

    private ListNode reverse(ListNode head, ListNode prev) {
        if(head==null){
            return prev;
        }
        ListNode curr=head.next;
        head.next=prev;
        prev=head;
        return reverse(curr,prev);
    }
    //Time complexity-->O(2n) space complexity-->O(n);
//    public ListNode reverseList(ListNode head) {
//        Stack<Integer> stack = new Stack<>();
//        ListNode cur = head;
//        while(cur!=null){
//            stack.push(cur.val);
//            cur = cur.next;
//        }
//        cur=head;
//        while(cur!=null){
//            cur.val=stack.pop();
//            cur=cur.next;
//        }
//        return head;
//    }
     //Time complexity-->O(n);
//    public ListNode reverseList(ListNode head) {
//        ListNode prev=null;
//        ListNode curr=head;
//        ListNode forward=null;
//        while(curr!=null){
//            forward=curr.next;
//            curr.next=prev;
//            prev=curr;
//            curr=forward;
//        }
//        return prev;
//    }
}
