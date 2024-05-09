package No2;

import static No2.PalindromeChecker.isPalindrome;

public class Main{
    public static void main(String[] args) {
        String input1 = "Katak";
        System.out.println("Is '" + input1 + "' a palindrome? " + isPalindrome(input1));

        String input2 = "Level";
        System.out.println("Is '" + input2 + "' a palindrome? " + isPalindrome(input2));

        String input3 = "Hello";
        System.out.println("Is '" + input3 + "' a palindrome? " + isPalindrome(input3));
    }
}
