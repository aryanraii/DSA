package Strings;

public class ValidPalindrome_Lc125 {
////    Time Complexity-->O(n);
    public boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r) {
            while(l<r && !Character.isLetterOrDigit(s.charAt(l))) l++;
            while(l<r && !Character.isLetterOrDigit(s.charAt(r))) r--;
            if(Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
////  Time Complexity--> O(n^2)
    //    public boolean isPalindrome(String s) {
    //        s=s.toLowerCase();
    //        String s2="";
    //        for(int i=0;i<s.length();i++){
    //            char ch=s.charAt(i);
    //            if(Character.isLetterOrDigit(ch)){
    //                s2+=ch;
    //            }
    //        }
    //
    //        int i=0;
    //        int j=s2.length()-1;
    //        while(i<j){
    //            if(s2.charAt(i)!=s2.charAt(j)){
    //                return false;
    //            }else{
    //                i++;
    //                j--;
    //            }
    //        }
    //        return true;
    //    }
}
