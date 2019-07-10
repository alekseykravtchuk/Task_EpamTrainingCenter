package by.krava.etc.unit3.string_builder.t03_palindrome;

/*
 * Проверить, является ли заданное слово палиндромом
 */

public class Palindrome {

    private static boolean isPalindrome (String word) {
        boolean isPalindrome = true;
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
                isPalindrome = false;
            }
        }
        return isPalindrome;
    }

    public static void main(String[] args) {
        String [] words = {"palindrome", "madam", "level", "referee"};
        for (String word : words) {
            String result = isPalindrome(word) ? " - palindrome" : " - not palindrome";
            System.out.println(word + result);
        }
    }
}
