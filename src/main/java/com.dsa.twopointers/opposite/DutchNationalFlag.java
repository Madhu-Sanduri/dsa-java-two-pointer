package opposite;

import java.util.Arrays;

public class DutchNationalFlag {

    public static String solution(int []a){
        int start=0,mid=0;
        int end=a.length-1;

        while (mid<=end){

            if(a[mid]==0){
                swap(a,start,mid);
                start++;
                mid++;
            }
            else if(a[mid]==1){
                mid++;
            }
            else{
                swap(a,mid,end);
                end--;
            }
        }

        return Arrays.toString(a);
    }

    static void swap(int []a,int low,int high){
        int temp=a[low];
        a[low]=a[high];
        a[high]=temp;
    }


    public static void main(String[] args) {
        System.out.println(solution(new int[]{2,0,2,1,1,0}));
    }
}
