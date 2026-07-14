package DoublyLinkedList;

import java.util.Stack;

public class ReverseaDoublyLinkedList_GFG {
    //Time complexity-->O(n) space complexity-->O(1)
    public ListNode reverse(ListNode head) {
        ListNode current=head;
        ListNode lastNode=null;
        while(current!=null){
            lastNode=current.back;
            current.back=current.next;
            current.next=lastNode;
            current=current.back;
        }
        return lastNode.back;
    }
    //Time complexity-->O(2n) space complexity-->O(n)
//    public ListNode reverse(ListNode head) {
//        ListNode temp=head;
//        Stack<Integer> stack=new Stack<>();
//         while(temp!=null){
//             stack.push(temp.val);
//             temp=temp.next;
//         }
//         temp=head;
//         while(temp!=null){
//             temp.val=stack.pop();
//             temp=temp.next;
//         }
//         return head;
//    }
}
