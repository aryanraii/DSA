package Strings;

import java.util.Arrays;

public class StringCompression_Lc443 {
    /// Time Complexity-->O(n);
    public int compress(char[] chars) {
        int idx=0;
        int n=chars.length;
        for(int i=0; i<n; i++){

            /// Step1: Count the freq of char
            char ch=chars[i];
            int count=0;
            while(i<n&& ch==chars[i]){
                count++;
                i++;
            }
            /// Step2; check the condition and replace
            if(count==1) {
                chars[idx++]=ch;
            }else{
                chars[idx++]=ch;
                //if digit>9 so we store digit in chars array in a such way;
                String str=Integer.toString(count);
                for(char digit: str.toCharArray()){
                    chars[idx++]=digit;
                }
            }
            i--;//for counter i or manage i on right index;
        }
        return idx; // idx point actual size of chars array after compression
    }
}
