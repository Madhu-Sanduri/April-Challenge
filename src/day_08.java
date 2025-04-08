import java.util.Arrays;

public class day_08 {

    public static int solution(int []a){
        int []map=new int[100];

        for(int i:a){
            map[i]++;
        }
        if(unique(map)) return 0;
        int out=0;
        int lastIdx=0;
        int size=a.length;

        while (size>0){
            for(int i=lastIdx;i<lastIdx+3;i++){
                if(i<a.length) map[a[i]]--;
            }
            lastIdx+=3;

            if(unique(map)){
                return out+1;
            }

            size-=3;
            out++;
        }

        return 0;

    }

    public static boolean unique(int []a){
        for(int i:a){
            if (i>1) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,2,3,4,5,6,7,8,9}));
        System.out.println(solution(new int[]{4,5,6,4,4}));
        System.out.println(solution(new int[]{1,2,3,4,5,6,7,8,9,9}));
        System.out.println(solution(new int[]{1,2,3,4,2,3,3,5,7}));
        System.out.println(solution(new int[]{6,7,8,9}));
    }
}
