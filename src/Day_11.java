public class Day_11 {

    public static int solution(int low,int high){
        if(size(low)%2==1 && size(high)%2==1 ) return 0;
        int count=0;
        for(int i=low;i<=high;i++){
            int size=size(i);
            int last_half= (int) (i%Math.pow(10,size/2));
            int first_half= (int) (i/Math.pow(10,size/2));

            if(sum(last_half)==sum(first_half)) count++;
        }
        return count;
    }

    static int size(int num){
        int length=0;
        while(num>0){
            num/=10;
            length++;
        }
        return length;
    }

    static int sum(int num){
        int sum=0;
        while (num>0){
            int rem=num%10;
            sum+=rem;
            num/=10;
        }
        return sum;
    }


    public static void main(String[] args) {
        System.out.println(solution(1,100));
        System.out.println(solution(1200,1230));
        System.out.println(solution(5000,6000));
    }
}
