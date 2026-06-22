package Strings;

public class ReverseWordsinaString_Lc151 {
/// Time Complexity --> O(n) && Space Complexity--> O(n)
    public String reverseWords(String s) {
        int n=s.length();
        StringBuilder sb=new StringBuilder(s);
        StringBuilder ans=new StringBuilder();
        sb=sb.reverse();

        for(int i=0;i<n;i++){
            StringBuilder sb1=new StringBuilder();
            while(i<n&&sb.charAt(i)!=' '){
                sb1.append(sb.charAt(i));
                i++;
            }
            sb1.reverse();
            if(sb1.length()>0){
                ans.append(" ").append(sb1);
            }
        }
        String rev=ans.toString();
        return rev.substring(1);
    }
}
