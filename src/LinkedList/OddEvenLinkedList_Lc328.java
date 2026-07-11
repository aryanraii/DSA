package LinkedList;

import java.util.ArrayList;

public class OddEvenLinkedList_Lc328 {
    //Time complexity-->O(n) space complexity-->O(1)
    public ListNode oddEvenList(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode odd=head;
        ListNode even=head.next;
        ListNode evenHead=head.next;
        while(even!=null&&even.next!=null){
            odd.next=odd.next.next;
            odd=odd.next;
            even.next=even.next.next;
            even=even.next;
        }
        odd.next=evenHead;
        return head;
    }

    //Time complexity-->O(2n) space complexity-->O(n)
//    public ListNode oddEvenList(ListNode head) {
//        if(head==null||head.next==null)return head;
//        ArrayList<Integer> list=new ArrayList<>();
//        ListNode temp=head;
//        while(temp!=null&&temp.next!=null){//O(n/2)
//            list.add(temp.val);
//            temp=temp.next.next;
//        }
//        if(temp!=null)list.add(temp.val);
//        temp=head.next;
//        while(temp!=null&&temp.next!=null){//O(n/2)
//            list.add(temp.val);
//            temp=temp.next.next;
//        }
//        if(temp!=null)list.add(temp.val);
//
//        int idx=0;
//        temp=head;
//        while(temp!=null){//O(n)
//            temp.val=list.get(idx);
//            temp=temp.next;
//            idx++;
//        }
//        return head;
//    }


    //Time complexity-->O(n) space complexity-->O(n)
//    public ListNode oddEvenList(ListNode head) {
//        ListNode dummyEve=new ListNode(-1);
//        ListNode dummyOdd=new ListNode(-1);
//        ListNode dE=dummyEve,dO=dummyOdd;
//        ListNode temp=head;
//        int idx=0;
//        while(temp!=null){
//            idx++;
//            if(idx%2==0){
//                dE.next=temp;
//                dE=dE.next;
//            }else{
//                dO.next=temp;
//                dO=dO.next;
//            }
//            temp=temp.next;
//        }
//        dummyOdd= dummyOdd.next;
//        dO.next = dummyEve.next;
//        dE.next=null;
//        return dummyOdd;
//    }
}
