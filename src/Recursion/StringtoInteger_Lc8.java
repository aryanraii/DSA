package Recursion;

public class StringtoInteger_Lc8 {
    public int myAtoi(String s) {
        s=s.trim();
        int n=s.length();
        if(n==0)return 0;
        int i=0;
        int sign=1;
        if(s.charAt(i)=='+'||s.charAt(i)=='-'){
            sign=(s.charAt(i))=='+'?1:-1;
            i++;
        }
        long num=0;

        int ans=checkInteger(i,s,num,sign);
        return(ans);
    }

    private int checkInteger(int i, String s,long num,int sign) {
        if(i==s.length()){
            return (int)(num*sign);
        }
        if(Character.isDigit(s.charAt(i))){
            num=num*10+s.charAt(i)-'0';
            if(num*sign>Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            if(num*sign<Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
            return checkInteger(i+1,s,num,sign);
        }else{
            return (int)(num*sign);
        }
    }
}
