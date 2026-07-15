package SlidingWindow_and_TwoPointer;

public class LongestRepeatingCharacterReplacement_Lc424 {
    //Time complexity-->O(N) space complexity-->O(26)
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int maxLength=0;
        int left=0;
        int right=0;
        int maxFreq=0;
        int[]freq=new int[26];
        while(right<n){
            freq[s.charAt(right)-'A']++;
            maxFreq=Math.max(maxFreq,freq[s.charAt(right)-'A']);
            if((right-left+1)-maxFreq>k){
                freq[s.charAt(left)-'A']--;
                left++;
            }
            maxLength=Math.max(maxLength,right-left+1);
            right++;
        }
        return maxLength;
    }

    //Time Complexity-->O(N+N)*26 space complexity-->O(26)
//    public int characterReplacement(String s, int k) {
//        int n = s.length();
//        int maxLength=0;
//        int left=0;
//        int right=0;
//        int maxFreq=0;
//        int[]freq=new int[26];
//        while(right<n){
//            freq[s.charAt(right)-'A']++;
//            maxFreq=Math.max(maxFreq,freq[s.charAt(right)-'A']);
//            while((right-left+1)-maxFreq>k){
//                freq[s.charAt(left)-'A']--;
//                left++;
//            }
//            maxLength=Math.max(maxLength,right-left+1);
//            right++;
//        }
//        return maxLength;
//    }

    //Time complexity-->O(n^2) space comlexity-->O(1)
//    public int characterReplacement(String s, int k) {
//        int n = s.length();
//        int maxLength=0;
//        for(int i=0;i<n;i++){
//            int[]freq=new int[26];
//            int maxFreq=0;
//            for(int j=i; j<n; j++){
//                freq[s.charAt(j)-'A']++;
//                maxFreq=Math.max(maxFreq,freq[s.charAt(j)-'A']);
//                int changes=(j-i+1)-maxFreq;
//                if(changes<=k){
//                    maxLength=Math.max(maxLength,j-i+1);
//                }else{
//                    break;
//                }
//            }
//        }
//        return maxLength;
//    }
}
