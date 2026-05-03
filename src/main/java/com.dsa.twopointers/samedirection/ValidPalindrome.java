package samedirection;

public class ValidPalindrome {

    public static boolean isPalindrome(String s){
        String trim = s.trim().toLowerCase();
        int start=0;
        int end=trim.length()-1;
        while (start<=end){
            char left=trim.charAt(start);
            char right=trim.charAt(end);
            if((Character.isAlphabetic(left) || Character.isDigit(left)) &&
                    (Character.isDigit(right) || Character.isAlphabetic(right))){
                if(left!=right) return false;
                start++;
                end--;
            }
            else if((!Character.isAlphabetic(left) && !Character.isDigit(left))){
                start++;
            }
            else end--;
        }

        return true;
    }


    public static void main(String[] args) {
        System.out.println(isPalindrome(" apG0i4maAs::sA0m4i0Gp0"));
        System.out.println(isPalindrome("race a car"));
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome(" "));

        /*

        "A man, a plan, a canal: Panama"
"race a car"
" "
        * */
    }


}