package No2;

public class PalindromeChecker {
    public static boolean isPalindrome(String str){
        //Removing spaces and converting letters to lowercase in a string
        str = str.replaceAll("\\s+", "").toLowerCase();

        //check if the string is a palindrome
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
