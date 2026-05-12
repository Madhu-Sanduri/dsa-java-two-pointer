package samedirection;

public class StringCompression {

    public static int solution(char [] chars){
        int len=chars.length;
        StringBuilder sb= new StringBuilder();
        int s=0,e=0;
        int count=0;
        while (e<len){
            if(chars[s]==chars[e]){
                e++;
                count++;
            }
            else{
                if(count>1) sb.append(chars[s]).append(count);
                else sb.append(chars[s]);
                s=e;
                e++;
                count=1;
            }
        }
        if(count>1) sb.append(chars[s]).append(count);
        else sb.append(chars[s]);
        System.out.println(sb.toString());
        return sb.toString().length();
    }


    public static void main(String[] args) {
        System.out.println(solution(new char[]{'a','a','b','b','c','c','c'}));
        System.out.println(solution(new char[]{'a'}));
        System.out.println(solution(new char[]{'a','b','b','b','b','b','b','b','b','b','b','b','b'}));
    }
}
