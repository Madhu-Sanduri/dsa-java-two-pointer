package opposite;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TwoSumII {

    public static String solution(int []a,int target){
        int len=a.length;
        int start=0,end=len-1;
        while (start<end){
            int sum=a[start]+a[end];
            if(sum==target) return Arrays.toString(new int[]{start+1,end+1});
            else if(sum>target) end--;
            else start++;
        }
        return null;
    }


    public static void main(String[] args) {
        System.out.println(solution(new int[]{2,7,11,15},9));
        System.out.println(solution(new int[]{2,3,4},6));
        System.out.println(solution(new int[]{-1,0},-1));
    }
}
