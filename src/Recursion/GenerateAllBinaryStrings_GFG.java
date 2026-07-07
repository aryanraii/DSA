package Recursion;

import java.util.ArrayList;

public class GenerateAllBinaryStrings_GFG {
    public ArrayList<String> binstr(int n) {
        ArrayList<String> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        generateString(0,n,ans,sb);
        return ans;
    }

    private void generateString(int count ,int n, ArrayList<String> ans, StringBuilder sb) {
        if(count==n){
            ans.add(sb.toString());
            return;
        }
        //take 0
        sb.append('0');
        generateString(count+1,n,ans,sb);

        sb.deleteCharAt(sb.length()-1); //undo

        //take1
        sb.append('1');
        generateString(count+1,n,ans,sb);
    }
}
