package DoublyLinkedList;

public class DeletealloccurrencesInaDoublyLinkedList_GFG {
    //Time complexity-->O(n) space complexity-->O(1)
    static ListNode deleteAllOccurOfX(ListNode head, int x) {
        ListNode temp=head;
        while(temp!=null){
            if(temp.val==x){
                if(temp==head){
                    head=head.next;
                }
                ListNode front=temp.next;
                ListNode prev=temp.back;
                if(prev!=null)prev.next=front;
                if(front!=null)front.back=prev;
                temp=front;
            }else{
                temp=temp.next;
            }
        }
        return head;
    }
}
