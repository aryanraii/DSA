package LinkedList;

import java.util.List;

public class Add1toaLinkedListNumber_GFG {
    //Time complexity-->O(n) space complexity-->O(1)
    public ListNode addOne(ListNode head) {
        int carry=helper(head);
        if(carry>0){
            ListNode temp=new ListNode(carry);
            temp.next=head;
            head=temp;
            return head;
        }
        return head;
    }

    private int helper(ListNode head) {
        if(head==null) return 1;
        int carry=helper(head.next);
        head.val+=carry;
        if(head.val<10){
            return 0;
        }else{
            head.val=0;
            return 1;
        }
    }
    //Time complexity-->O(3N) space complexity-->O(1)
//    public ListNode addOne(ListNode head) {
//         head=reverse(head);
//         ListNode temp=head;
//         int carry=1;
//         while(temp!=null){
//             temp.val=temp.val+carry;
//             if(temp.val<10){
//                 carry=0;
//                 break;
//             }
//             else{
//                 temp.val=0;
//                 carry=1;
//             }
//             temp=temp.next;
//         }
//         if(carry==1){
//             ListNode newNode=new ListNode(carry);
//             head=reverse(head);
//             newNode.next=head;
//             head=newNode;
//             return head;
//         }
//         return reverse(head);
//    }
//
//    private ListNode reverse(ListNode head) {
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
