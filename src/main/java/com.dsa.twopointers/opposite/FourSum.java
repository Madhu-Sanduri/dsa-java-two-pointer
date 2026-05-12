package opposite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {

    public static List<List<Integer>> solution(int []a,int target){
        int len=a.length;
        int s=0,e=len-1;
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(a);

        if(a[0]>target) return list;

        for(int i=0;i<len;i++){
            int start=i+1;
            int mid=i+2;
            int end=len-1;

            int sum=a[i]+a[start]+a[mid]+a[end];

            while (start<end){
                if(sum==target){
                    list.add(List.of(a[i],a[start],a[mid],a[end]));
                    while (start<mid && a[start]==a[mid]){

                        start++;
                    }
                    while (mid<end && a[mid]==a[end]){
                        e--;
                    }
                }
                else if(sum>target) {
                    e--;
                }
                else s++;
            }



        }
        return list;
    }


    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,0,-1,0,-2,2},0));
        System.out.println(solution(new int[]{2,2,2,2,2},2));
    }
}
