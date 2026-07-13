package LinkedList;

import java.util.ArrayList;
import java.util.Collections;

public class SortList_Lc148 {
    //Time complexity-->O(nlogn) space complexity-->O(1)
    public ListNode sortList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode middle=findMiddle(head);
        ListNode lefthead=head;
        ListNode righthead=middle.next;
        middle.next=null;

        lefthead=sortList(lefthead);
        righthead=sortList(righthead);

        return mergeList(lefthead,righthead);
    }

    private ListNode mergeList(ListNode lefthead, ListNode righthead) {
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        while(lefthead!=null&&righthead!=null){
            if(lefthead.val<righthead.val){
                temp.next=lefthead;
                lefthead=lefthead.next;
                temp=temp.next;
            }else{
                temp.next=righthead;
                righthead=righthead.next;
                temp=temp.next;
            }
        }
        if(lefthead!=null){
            temp.next=lefthead;
        }else{
            temp.next=righthead;
        }
        return dummy.next;
    }

    private ListNode findMiddle(ListNode head) {
        ListNode fast=head.next;
        ListNode slow=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    //Time complexity-->O(nlogn) space complexity-->O(n)
//    public ListNode sortList(ListNode head) {
//        ListNode temp=head;
//        ArrayList<Integer> list=new ArrayList<>();
//        while(temp!=null){
//            list.add(temp.val);
//            temp=temp.next;
//        }
//        Collections.sort(list);
//        int n=list.size();
//        temp=head;
//        for(int i=0;i<n;i++){
//            temp.val=list.get(i);
//            temp=temp.next;
//        }
//        return head;
//    }
}
