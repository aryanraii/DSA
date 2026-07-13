package LinkedList;

public class SortalinkedListof_0s_1s_2s_GFG {
    //Time complexity-->O(n) space complexity-->O(1)
    public ListNode segregate(ListNode head) {
        ListNode dummy0=new ListNode(-1);
        ListNode dummy1=new ListNode(-1);
        ListNode dummy2=new ListNode(-1);
        ListNode move=head;
        ListNode temp0=dummy0;
        ListNode temp1=dummy1;
        ListNode temp2=dummy2;
        while(move!=null){
            if(move.val==0){
                temp0.next=move;
                temp0=temp0.next;
            }
            if(move.val==1){
                temp1.next=move;
                temp1=temp1.next;
            }
            if(move.val==2){
                temp2.next=move;
                temp2=temp2.next;
            }
            move=move.next;
        }
        temp0.next=(dummy1.next!=null)?dummy1.next:dummy2.next;
        temp1.next=dummy2.next;
        temp2.next=null;

        return dummy0.next;
    }
}
