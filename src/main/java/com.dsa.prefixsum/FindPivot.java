public class FindPivot {

    public static int solution(int []a){
        int len=a.length;
        int sum=0;
        int leftSum=0;
        for(int i:a){
            sum+=i;
        }
        if(sum==0) return 0;
        for(int i=0;i<len;i++){
            if(sum-leftSum-a[i]==leftSum) return i;

            leftSum+=a[i];
        }
        return -1;
    }


    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,7,3,6,5,6}));
        System.out.println(solution(new int[]{1,2,3}));
        System.out.println(solution(new int[]{2,1,-1}));
    }
}
