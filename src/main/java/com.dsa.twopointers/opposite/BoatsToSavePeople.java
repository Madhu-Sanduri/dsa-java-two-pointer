package opposite;

import java.util.Arrays;

public class BoatsToSavePeople {

   public static int solution(int []a,int limit){

       Arrays.sort(a);
       int len=a.length;
       int s=0,e=len-1;
       int count=0;
       while (s<=e){
           int sum=a[s]+a[e];

           if(sum<=limit){
               s++;
               e--;
               count++;
           }
           else if(a[s]==limit) {
               s++;
               count++;
           }
           else {
               e--;
               count++;
           }
       }
       return count;
   }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,2},3));
        System.out.println(solution(new int[]{3,5,3,4},5));
        System.out.println(solution(new int[]{3,2,2,1},3));
    }
}
