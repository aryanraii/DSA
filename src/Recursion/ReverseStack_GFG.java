package Recursion;
import java.util.Stack;

public class ReverseStack_GFG {
    //Time complexity-->O(n^2) spce complexity-->O(1)
    public static void reverseStack(Stack<Integer> st) {
        reverse(st);
    }

    private static void reverse(Stack<Integer> st) {
        if(st.size()==0)return;
        int top=st.peek();
        st.pop();
        reverse(st);
        //Insert top at bottom
        insert(st,top);
    }

    private static void insert(Stack<Integer> st, int ele) {
        if(st.size()==0){
            st.push(ele);
            return;
        }
        int top=st.peek();
        st.pop();
        insert(st,ele);
        st.push(top);
    }

    //Time complexity-->O(n^2) and space complexity-->O(n)
//    public static void reverseStack(Stack<Integer> st) {
//         if(st.isEmpty()){
//             return;
//         }
//         int top=st.peek();
//         st.pop();
//         reverseStack(st);
//         Stack<Integer> temp=new Stack<>();
//         while(!st.isEmpty()){
//             temp.push(st.pop());
//         }
//         st.push(top);
//         while(!temp.isEmpty()){
//             st.push(temp.pop());
//         }
//    }
}
