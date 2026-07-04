package Strings;

public class NumberofSubstringsContainingAllThreeCharacters_Lc1358 {
    //Time complexity-->O(n) && space complexity-->O(1);
    public int numberOfSubstrings(String s) {
        //logic-->with every character there is a substring that ends
        int []lastSeen={-1,-1,-1};
        int count=0;
        for(int i=0;i<s.length();i++){
            lastSeen[s.charAt(i)-'a']=i;
            if(lastSeen[0]!=-1 || lastSeen[1]!=-1 || lastSeen[2]!=-1){
                count=count+(1+Math.min(lastSeen[0],Math.min(lastSeen[1],lastSeen[2])));
            }
        }
        return count;
    }

    //Time complexity-->O(n^2) space complexity-->O(1)
//    public int numberOfSubstrings(String s) {
//        int n=s.length();
//        int count=0;
//        for(int i=0;i<n;i++){
//            int[]freq=new int[3];
//            for(int j=i;j<n;j++){
//                freq[s.charAt(j)-'a']=1;
//                if(freq[0]+freq[1]+freq[2]==3){
//                    count+=(n-j);
//                    break;
//                }
//            }
//        }
//        return count;
//    }
}
