package Array;

public class Pow_Lc50 {
//Binary  Exponentiation--> Tc=O(logn)
public double myPow(double x, int n) {
    long binForm=n;
    if(n<0){     // this is for negative n
        x=1/x;
        binForm=-binForm;
    }
    double ans=1;
    while(binForm>0){
        if(binForm%2==1){
            ans*=x;
        }
        x*=x;
        binForm/=2;
    }
    return ans;
}
//// not optimal solution for large n;
//    public static void main(String[] args) {
//        System.out.println(myPow(2,3));
//    }
//    public static double myPow(double x, int n){
//        double ans=1;
//        ans=1.0;
//        long l=n;
//        if(l<0){
//            l=Math.abs(l);
//            return 1/helper(x,l,ans);
//        }
//
//        return helper(x,l,ans);
//    }
//    public static double helper(double x, long n,double ans){
//        if(n==0)return ans;
//        ans*=x;
//        return helper(x,n-1,ans);
//    }
}
