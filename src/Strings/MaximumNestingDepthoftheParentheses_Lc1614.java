package Strings;

public class MaximumNestingDepthoftheParentheses_Lc1614 {
    //Time complexity-->O(n);
    public int maxDepth(String s) {
        int n = s.length();
        int maxDepth = 0;
        int counter=0;
        for(int i=0;i<n;i++) {
            if(s.charAt(i)=='(') {
                counter++;
                maxDepth = Math.max(maxDepth,counter);
                continue;
            }
            if(s.charAt(i)==')') {
                counter--;
            }
        }
        return maxDepth;
    }
}
