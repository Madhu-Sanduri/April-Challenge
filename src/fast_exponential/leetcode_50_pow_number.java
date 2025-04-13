package fast_exponential;

public class leetcode_50_pow_number {
    public static double myPow(double x, int n){
        long N = n; // use long to safely handle Integer.MIN_VALUE
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        double result=1;
        while (N>0){
            if(N%2==1){
                result=result*x;
            }
            x=x*x;
            N/=2;

        }
        return result;
//        double multiplication=x;
//        while (n>0){
//            if(n%2==1){
//                result=result*multiplication;
//            }
//            multiplication=multiplication*multiplication;
//            n/=2;
//        }
    }

    public static void main(String[] args) {
        System.out.println(myPow(2,-2));
        System.out.println(myPow(2,10));
        System.out.println(myPow(2.1,3));
    }
}
