package Strings;

import java.util.Arrays;
import java.util.HashMap;

public class MinimumWindowSubstring_Lc76 {
    public String minWindow(String s, String t) {
        /// Step1: count char freq of t and store
        int[] target = new int[256];
        for (char ch : t.toCharArray()) {
            target[ch]++;
        }

        int n = s.length();
        int left = 0, right = 0;
        int count = 0;
        int required = t.length();
        int start = 0;
        int minLen = Integer.MAX_VALUE;
        /// Step2: find the minwindow length
        while (right < n) {
            if (target[s.charAt(right)] > 0) {
                count++;
            }
            target[s.charAt(right)]--;

            while (count == required) {
                if (minLen > right - left + 1) {
                    minLen = right - left + 1;
                    start = left;
                }

                target[s.charAt(left)]++;
                if (target[s.charAt(left)] > 0) {
                    count--;
                }

                left++;  ///shrink the window
            }
            right++; /// expand the window
        }
        return (minLen == Integer.MAX_VALUE) ? "" : s.substring(start, start + minLen);
    }
}
