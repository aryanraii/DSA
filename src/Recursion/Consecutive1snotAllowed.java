package Recursion;

import java.util.ArrayList;

public class Consecutive1snotAllowed {
    //Time complexity-->O(2^n) space complexity-->O(n);
    int ans = 0;

    int countStrings(int n) {
        StringBuilder sb = new StringBuilder();
        generateString(0, n, sb);
        return ans;
    }

    private void generateString(int i, int n, StringBuilder sb) {

        if (i == n) {
            ans++;
            return;
        }

        // Take 0
        sb.append('0');
        generateString(i + 1, n, sb);
        sb.deleteCharAt(sb.length() - 1);

        // Take 1 only if previous character is not 1
        if (sb.length() == 0 || sb.charAt(sb.length() - 1) != '1') {
            sb.append('1');
            generateString(i + 1, n, sb);
            sb.deleteCharAt(sb.length() - 1); // Undo
        }
    }
}
