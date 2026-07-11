package LinkedList;

public class RemoveNthNodeFromEndofList_Lc19 {
    //Time complexity-->O(2n) space complexity-->O(1)
//    public ListNode removeNthFromEnd(ListNode head, int n) {
//        int size=0;
//        ListNode temp=head;
//        while(temp!=null){//O(n)
//            size++;
//            temp=temp.next;
//        }
//        if(size==n){
//            head=head.next;
//            return head;
//        }
//        temp=head;
//        int reach=size-n;
//        while(temp!=null){
//            reach--;
//            if(reach==0){
//                break;
//            }
//            temp=temp.next;
//        }
//        temp.next=temp.next.next;
//        return head;
//    }
}
