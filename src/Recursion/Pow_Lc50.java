package Recursion;

public class Pow_Lc50 {
    //Time complexity-->O(logn)
    public double myPow(double x, int n) {
         return countPow(x,(long)n);
    }

    private double countPow(double x, long n) {
        if(n==0)return 1;
        if(n<0) return countPow(1/x,-n);
        if(n%2==0)return countPow(x*x,n/2);
        return x*countPow(x*x,(n-1)/2);
    }
}
