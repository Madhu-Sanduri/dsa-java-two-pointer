package opposite;

public class ContainerWithMostWater {

    public static int solution(int []a){
        int len=a.length;
        int s=0,e=len-1;
        int max=Integer.MIN_VALUE;
        while (s<e){
            if(a[s]>a[e]){
                if(max<a[e]*(e-s)) max=a[e]*(e-s);
                e--;
            }
            else{
                if(max<a[s]*(e-s)) max=a[s]*(e-s);
                s++;
             }
        }
        return max;
    }


    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,8,6,2,5,4,8,3,7}));
    }
}
