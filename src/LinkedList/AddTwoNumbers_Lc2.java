package LinkedList;

public class AddTwoNumbers_Lc2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1=l1, temp2=l2;
        ListNode dummy=new ListNode(-1);
        ListNode move=dummy;
        int carry=0;
        while(temp1!=null||temp2!=null||carry!=0){
            int sum=(temp1!=null?temp1.val:0) + (temp2!=null?temp2.val:0)+carry;
            if(sum>9){
                ListNode newNode=new ListNode(sum%10);
                move.next=newNode;
                move=move.next;
                carry=sum/10;

            }else{
                ListNode newNode=new ListNode(sum);
                move.next=newNode;
                move=move.next;
                carry=0;
            }
            if(temp1!=null)temp1=temp1.next;
            if(temp2!=null)temp2=temp2.next;
        }
        return dummy.next;
    }
}
