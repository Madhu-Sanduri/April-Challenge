public class day_13_count_good_numbers {

    static long mod=1000000007;

    public static int solution(long n){
        return (int) ((algo(5, (int) ((n+1)/2)) *algo(4, (int) (n/2)))%mod);
//        return (int) (algo(5,(N+1)/2) * algo(4,N/2));
    }

    static long algo(int x,int y){
        long ret=1;
        long mul=x;
        while (y>0){
            if(y%2==1){
                ret=(ret*mul)%mod;
            }
            mul = (mul * mul) % mod;
            y /= 2;
        }
        return ret;
    }


    public static void main(String[] args) {
        System.out.println(solution(1));
        System.out.println(solution(2));
        System.out.println(solution(3));
        System.out.println(solution(4));
        System.out.println(solution(5));
        System.out.println(solution(50));
    }
}
