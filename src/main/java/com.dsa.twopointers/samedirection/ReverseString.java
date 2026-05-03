package samedirection;

import java.util.Arrays;

public class ReverseString {
    public static void rev(char []s){
        int start=0,end=s.length-1;

        while (start<=end){
            char temp=s[start];
            s[start]=s[end];
            s[end]=temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(s));

    }


    public static void main(String[] args) {
        rev(new char[]{'h','e','l','l','o'});
        rev(new char[]{'H','a','n','n','a','h'});
    }
}
