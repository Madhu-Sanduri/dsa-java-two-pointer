package opposite;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public static List<List<Integer>> solution(int []a){
        int len=a.length;
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(a); //Sorting the array

        if(a[0]>0) return list; //If first element after sorting is greater than zero it's impossible to make sum of 3 element to zero

        for(int i=0;i<len;i++){ //1st pointer
            int start=i+1; //2nd pointer next after 1st
            int end=len-1; //3rd pointer from end
            if(i>0 && a[i]==a[i-1]) continue; // If i,i-1 are equal

            while(start<end){
                int sum=a[i]+a[start]+a[end]; // Checking all the sums
                if(sum==0){
                    list.add(Arrays.asList(new Integer[]{a[i],a[start],a[end]})); //appending values if sum==0
                    start++;
                    end--;

                    while (start<end && a[start]==a[start-1]) start++; //Will Skips duplicates in list
                }
                else if(sum>0) end--; //If sum greater than zero finding min value
                else start++; //If sum less than zero finding next element
            }
        }

        return list;

    }


    public static void main(String[] args) {
        System.out.println(solution(new int[]{-1,0,1,2,-1,-4}));
        System.out.println(solution(new int[]{0,1,1}));
        System.out.println(solution(new int[]{0,0,0}));
    }
}
