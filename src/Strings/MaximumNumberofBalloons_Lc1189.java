package Strings;

public class MaximumNumberofBalloons_Lc1189 {
/// Time Complexity--> O(n) and Space complexity--> O(1)
    public int maxNumberOfBalloons(String text) {
            int freq[]=new int[26];
            for(char ch:text.toCharArray()){
                freq[ch-'a']++;
            }
//            Now find the minimum in freq array that will be our answer
        return Math.min(
            Math.min(
                        Math.min(freq['b'-'a'],freq['a'-'a']),
                        Math.min(freq['l'-'a']/2,freq['o'-'a']/2)
            ), freq['n'-'a']
        );
    }
}
