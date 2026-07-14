package DoublyLinkedList;

public class RemoveduplicatesfromasortedDLL_GFG {
    //Time complexity-->O(n) space complexity-->O(1)
    ListNode removeDuplicates(ListNode headRef) {
        ListNode temp=headRef;
        while(temp!=null&&temp.next!=null){
            ListNode nextNode=temp.next;
            while(nextNode!=null&&nextNode.val==temp.val){
                 nextNode=nextNode.next;
            }
            temp.next=nextNode;
            if(nextNode!=null)nextNode.back=temp;
            temp=temp.next;
        }
        return headRef;
    }
}
