package LinkedList;

public class IntersectionofTwoLinkedLists_Lc160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA=0,lenB=0;
        ListNode temp=headA;
        while(temp!=null){
            lenA++;
            temp=temp.next;
        }
        temp=headB;
        while(temp!=null){
            lenB++;
            temp=temp.next;
        }
        ListNode temp1=headA;
        ListNode temp2=headB;
        if(lenA>lenB){
            for(int i=0;i<lenA-lenB;i++){
                temp1=temp1.next;
            }
        }else {
            for(int i=0;i<lenB-lenA;i++){
                temp2=temp2.next;
            }
        }
        while(temp1!=null&&temp2!=null){
            if(temp1.val==temp2.val){
                return temp1;
            }
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return null;
    }
}
