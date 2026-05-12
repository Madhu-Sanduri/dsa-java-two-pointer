import java.util.Arrays;

public class RunningSum {
    public static String solution(int []a){
        int len=a.length;

        int []out=new int[len];
        out[0]=a[0];
        for(int i=1;i<len;i++){
            out[i]=a[i]+out[i-1];
        }

        return Arrays.toString(out);
    }


    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,2,3,4,5,6,7,8,9,10}));
        System.out.println(solution(new int[]{1,2,3,4,5}));
        System.out.println(solution(new int[]{1,2,3,4}));
    }
}
