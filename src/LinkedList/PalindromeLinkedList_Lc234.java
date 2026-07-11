package LinkedList;

import java.util.Stack;

public class PalindromeLinkedList_Lc234 {
    //Time complexity-->O(2n) space complexity-->O(1)
    public boolean isPalindrome(ListNode head) {
         ListNode slow=head;
         ListNode fast=head;
         while(fast.next!=null&&fast.next.next!=null){
             slow=slow.next;
             fast=fast.next.next;
         }
         ListNode newNode=slow.next;
         newNode=reverse(newNode);
         ListNode first=head;
         ListNode second=newNode;
         while(second!=null){
             if(second.val!=first.val){
                 return false;
             }
             second=second.next;
             first=first.next;
         }
         return true;
    }

    private ListNode reverse(ListNode newNode) {
        ListNode prev=null;
        ListNode curr=newNode;
        ListNode forward=prev;
        while(curr!=null){
            forward=curr.next;
            curr.next=prev;
            prev=curr;
            curr=forward;
        }
        return prev;
    }
    //Time complexity-->O(2n) space complexity-->O(n)
//    public boolean isPalindrome(ListNode head) {
//        Stack<ListNode> stack=new Stack<ListNode>();
//        ListNode temp=head;
//        while(temp!=null){
//            stack.push(temp);
//            temp=temp.next;
//        }
//        temp=head;
//        while(temp!=null){
//            if(temp.val != stack.pop().val){
//                return false;
//            }
//            temp=temp.next;
//        }
//        return true;
//    }
}
