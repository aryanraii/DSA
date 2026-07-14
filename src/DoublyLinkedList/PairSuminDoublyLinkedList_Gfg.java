package DoublyLinkedList;
import java.util.ArrayList;
import java.util.List;

public class PairSuminDoublyLinkedList_Gfg {
    //Time complexity-->O(2n) space complexity-->O(1)
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, ListNode head) {
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        if(head==null||head.next==null) return result;
        ListNode right=head;
        ListNode left=head;
        while(right.next!=null){
            right=right.next;
        }
        while(left.val<right.val){
            if(left.val+right.val==target){
                ArrayList<Integer> temp=new ArrayList<>();
                temp.add(left.val);
                temp.add(right.val);
                result.add(temp);
            }else if(left.val+right.val<target){
                left=left.next;
            }else{
                right=right.back;
            }
        }
        return result;
    }
    //Time complexity-->O(n^2) space complexity-->O(1)
//    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, ListNode head) {
//         ArrayList<ArrayList<Integer>> result=new ArrayList<>();
//         findSumPair(head,target,result);
//         return  result;
//    }
//
//    private static void findSumPair(ListNode head, int target, ArrayList<ArrayList<Integer>> result) {
//        ListNode temp=head;
//        while(temp!=null){
//            ListNode temp2=temp.next;
//            while(temp2!=null){
//                if(target==temp.val+temp2.val){
//                    ArrayList<Integer> list=new ArrayList<>();
//                    list.add(temp.val);
//                    list.add(temp2.val);
//                    result.add(list);
//                    return;
//                }
//                temp2=temp2.next;
//            }
//            temp=temp.next;
//        }
//    }
}
