package LinkedList;

public class RemoveNthNodeFromEndofList_Lc19 {
    //Time complexity-->O(2n) space complexity-->O(1)
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size=0;
        ListNode temp=head;
        while(temp!=null){//O(n)
            size++;
            temp=temp.next;
        }
        if(size==n){
            head=head.next;
            return head;
        }
        int idx=1;
        temp=head;
        while(idx<size-n){
            idx++;
            temp=temp.next;
        }
        temp.next=temp.next.next;

        return head;
    }
}
