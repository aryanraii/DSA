package DoublyLinkedList;
class ListNode{
    int val;
    ListNode next;
    ListNode back;
    ListNode(int val){
        this.val=val;
    }

    ListNode(int val,ListNode next,ListNode back){
        this.val=val;
        this.next=next;
        this.back=back;
    }
}
public class Introduction {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7};
        ListNode head=convertArr2DLL(arr);
        print(head);
        System.out.println();

        head= deleteAtHead(head);
        print(head);
        System.out.println();

        head=deleteAtTail(head);
        print(head);
        System.out.println();

        head=deleteKthNode(head,3);
        print(head);
        System.out.println();

        deleteNode(head.next);
        print(head);
        System.out.println();

        head=insertBeforeHead(head,10);
        print(head);
        System.out.println();

        head=insertBeforeTail(head,50);
        print(head);
        System.out.println();

        head=insetBeforeKthEle(head,2,17);
        print(head);
        System.out.println();

        insertBeforeNode(head.next,13);
        print(head);
        System.out.println();

    }
    private static void print(ListNode head) {
        ListNode temp=head;
        while (temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
    }
    public static ListNode convertArr2DLL(int[]arr){
        ListNode head=new ListNode(arr[0]);
        ListNode curr=head;
        int n=arr.length;
        for(int i=1;i<n;i++){
            ListNode temp=new ListNode(arr[i]);
            temp.back=curr;
            curr.next=temp;
            curr=curr.next;
        }
        return head;
    }

    private static void insertBeforeNode(ListNode Node,int val){
        ListNode prev=Node.back;
        ListNode newNode=new ListNode(val,Node,prev);
        prev.next=newNode;
        Node.back=newNode;
    }
    private static ListNode insetBeforeKthEle(ListNode head, int k, int val) {
            if(k==1){
                return insertBeforeHead(head,val);
            }
            int count=0;
            ListNode temp=head;
            while(temp!=null){
                count++;
                if(count==k)break;
                temp=temp.next;
            }
            ListNode prev=temp.back;
            ListNode newNode=new ListNode(val,temp,prev);
            prev.next=newNode;
            temp.back=newNode;
            return head;
    }
    private static ListNode insertBeforeTail(ListNode head, int val) {
        if(head==null){
            return new ListNode(val);
        }
        if(head.next==null){
            return insertBeforeHead(head,val);
        }
        ListNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        ListNode prev=temp.back;
        ListNode newNode=new ListNode(val,temp,prev);
        prev.next=newNode;
        temp.back=newNode;
        return head;
    }
    private static ListNode insertBeforeHead(ListNode head,int val) {
        if(head==null){
            ListNode newHead=new ListNode(val);
        }
        ListNode newHead=new ListNode(val);
        newHead.next=head;
        head.back=newHead;
        return newHead;
    }

    private static void deleteNode(ListNode temp) {
        ListNode prev=temp.back;
        ListNode front=temp.next;
        if(front==null){
            prev.next=null;
            temp.back=null;
            return;
        }
        prev.next=front;
        front.back=prev;

        temp.next=temp.back=null;
    }
    private static ListNode deleteKthNode(ListNode head,int k) {
        ListNode temp=head;
        int count=0;
        while (temp!=null){
            count++;
            if(count==k)break;
            temp=temp.next;
        }
        ListNode prev=temp.back;
        ListNode front=temp.next;

         if(prev==null&&front==null){
             return null;
         }else if(prev==null){
             return deleteAtHead(head);
         }else if(front==null){
             return deleteAtTail(head);
         }
         prev.next=front;
         front.back=prev;

         temp.next=null;
         temp.back=null;

         return head;
    }
    private static ListNode deleteAtTail(ListNode head) {
        if(head==null||head.next==null){
            return null;
        }
        ListNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        ListNode tail=temp.back;
        temp.back=null;
        tail.next=null;

        return head;
    }
    private static ListNode deleteAtHead(ListNode head) {
        if(head==null||head.next==null){
            return null;
        }
        ListNode pre=head;
        head=head.next;

        pre.next=null;
        head.back=null;

        return head;
    }
}
