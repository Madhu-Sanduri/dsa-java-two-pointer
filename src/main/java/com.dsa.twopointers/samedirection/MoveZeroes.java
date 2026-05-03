package samedirection;

import java.util.Arrays;

public class MoveZeroes {

    public static String solution(int []a){
        int len=a.length;
        int idx=0;
        int start=0,end=len-1;

        while (idx<len){
            if(a[idx]!=0){
                a[start]=a[idx];
                start++;
            }
            idx++;
        }

        while (end>=start){
            a[end]=0;
            end--;
        }

        return Arrays.toString(a);


    }


    public static void main(String[] args) {
        System.out.println(solution(new int[]{0,1,0,3,12}));
        System.out.println(solution(new int[]{0}));
    }
}
