package com.example;

public class Palindrome {
    static void main() {
        String str = "A man, a plan, a canal: Panama";
        System.out.println(isPalindromeNonAlphanumericChar(str));

    }

    public static boolean isPalindrome(String str) {
        if (str == null) return false;
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean isPalindromeNonAlphanumericChar(String str) {
        if (str == null) return false;
        int left = 0, right = str.length() - 1;
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(str.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(str.charAt(right))) {
                right--;
            }
            if (Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
