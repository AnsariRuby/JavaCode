package Learn_Java.Practice;

import java.util.ArrayList;
import java.util.*;

public class Practice_02 {
    // learn Strings
    // length of a string
    // Given a string s, the task is to find the length of the string.
    static int lengthOfString(String str) {
        int count = 0;
        for (char a: str.toCharArray()) {
            count++;
        }
        return count;
    }
    // Check if two strings are same or not
    // Given two strings, the task is to check if these two strings are identical(same) or not. Consider case sensitivity.
    static boolean is2StringsSame(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    // Program to Search a Character in a String
    // Given a character ch and a string s, the task is to find the index of the first occurrence of the character in the string.
    // If the character is not present in the string, return -1.
    static int searchChar(String str, char ch) {
        int n = str.length();
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == ch) {
                return i;
            }
        }
        return -1;
    }
    // Insert a character in String at a Given Position
    // Given a string s, a character c and an integer position pos, the task is to insert the character c into the string s at the specified position pos.
    static String insertChar(String str, int index, char ch) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (index == i) {
                sb.append(ch);
            }
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
    static String insertCharacter(String str, int index, char ch) {
        StringBuilder sb = new StringBuilder(str);
        sb.insert(index, ch);
        return sb.toString();
    }
    // Remove a Character from a Given Position
    // Given a string and a position (0-based indexing), remove the character at the given position.
    static String removeChar(String str, int index) {
        if (index < 0 || index > str.length()) {
            return "";
        }
        StringBuilder sb = new StringBuilder(str);
        for (int i = index; i < str.length()-1; i++) {
            sb.setCharAt(i,str.charAt(i + 1));
        }

        sb.deleteCharAt(str.length() - 1);
        return sb.toString();
    }
    // Remove all occurrences of a character in a string
    // Given a string and a character, remove all the occurrences of the character in the string.
    static String removeAllChar(String str, char ch) {
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == ch) {
                sb.deleteCharAt(i);
                i--;
            }
        }
        return sb.toString();
    }
    // Concatenation of Two Strings
    // String concatenation is the process of joining two strings end-to-end to form a single string.
    static String join2String(String str1, String str2) {
        return str1 + str2;
    }
    static String joinString(String str1, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str1);
        sb.append(str2);
        return sb.toString();
    }
    static String joinString2(String str1, String str2) {
        StringBuilder sb = new StringBuilder();
        for (char ch : str1.toCharArray()) {
            sb.append(ch);
        }
        for (char ch : str2.toCharArray()) {
            sb.append(ch);
        }
        return sb.toString();
    }
    // Reverse a String
    // Given a string s, the task is to reverse the string. Reversing a string means rearranging the characters such that the
    // first character becomes the last, the second character becomes second last and so on.
    static String reverseString(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
    static String reverseString2(String str) {
        StringBuilder sb = new StringBuilder(str);
        int left = 0, right = str.length() - 1;
        while (left < right) {
            char temp = sb.charAt(left);
            sb.setCharAt(left, sb.charAt(right));
            sb.setCharAt(right, temp);
            left++;
            right--;
        }
        return sb.toString();
    }
    // All substrings of a given String
    // Given a string s, containing lowercase alphabetical characters. The task is to print all non-empty substrings of the given string.
    static List<String> findSubstrings(String str) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                list.add(str.substring(i, j + 1));
            }
        }
        return list;
    }
    // Check for Binary String
    // Given a string s, the task is to check if it is a binary string or not. A binary string is a string which only contains the characters '0' and '1'.
    static boolean isBinary(String str1) {
        int n = str1.length();
        for (int i = 0; i < n; i++) {
            if (str1.charAt(i) != '1' && str1.charAt(i) != '0') {
                return false;
            }
        }
        return true;
    }
    // Camel case of a given sentence
    // Given a sentence having lowercase characters, the task is to convert it to Camel Case. In Camel Case, words are joined without spaces,
    // the first word keeps its original case, and each subsequent word starts with an uppercase letter.
    static String convertToCamelCase(String str) {
        StringBuilder sb = new StringBuilder();
        boolean upperCase = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                upperCase = true;
            }
            else if (upperCase) {
                sb.append(Character.toUpperCase(str.charAt(i)));
                upperCase = false;
            }else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    // Count of substrings that start and end with 1 in given Binary String
    // Given a binary string s, the task is to count all substrings that start and end with the character '1'.
    // A valid substring must have both its first and last characters as '1', and can include one or more number of characters in between.
    static int binarySubstring(String str) {
        int count = 0;
        int n = str.length();
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == '1') {
                for (int j = i + 1; j < n; j++) {
                    if (str.charAt(j) == '1') {
                        count++;
                    }
                }
            }
        }
        return count;
    }
    static int binarySubstring2(String str) {
        int count = 0;
        int n = str.length();
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == '1') {
                count++;
            }
        }
        return (count * (count - 1) / 2);
    }
    // Check if given String is Pangram or not
    // Given a string s, the task is to check if it is Pangram or not. A pangram is a sentence containing all letters of the English Alphabet.
    static boolean checkPanagram(String str) {
        int n = str.length();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            boolean found = false;
            for (int i = 0; i < n; i++) {
                if (ch == Character.toLowerCase(str.charAt(i))) {
                    found = true;
                }
            }
            if (!found) {
                return false;
            }
        }
        return true;
    }
    static boolean checkPanagram2(String str) {
        int n = str.length();
        boolean[] vis = new boolean[26];
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                vis[ch - 'A'] = true;
            }else if (ch >= 'a' && ch <= 'z') {
                vis[ch - 'a'] = true;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (!vis[i]) {
                return false;
            }
        }
        return true;
    }
    // Palindrome String
    // Given a string s, the task is to check if it is palindrome or not.
    static int isPalindrome(String str) {
        int n = str.length();
        int left = 0, right = n - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return 0;
            }
            left++;
            right--;
        }
        return 1;
    }
    static int isPalindrome2(String str) {
        return str.equals(new StringBuilder(str)
                .reverse().
                toString()) ? 1 : 0;
    }
    // Check if a string is substring of another
    // Given two strings txt and pat, the task is to find if pat is a substring of txt. If yes, return the index of the first occurrence, else return -1.

    static void main(String[] args) {
//        String s = "abba";
//        System.out.println(isPalindrome2(s));
//        System.out.println(isPalindrome(s));

//        String s = "The quick brown fox jumps over the lazy dog";
//        System.out.println(checkPanagram(s));
//        System.out.println(checkPanagram2(s));
//        String str = "00100101";
//        System.out.println(binarySubstring(str));
//        System.out.println(binarySubstring2(str));

//        String str1 = "1001";
//        System.out.println(binarySubstring(str1));
//        System.out.println(binarySubstring2(str1));

//        String str = "i got intern at geeksforgeeks";
//        System.out.println(convertToCamelCase(str));

//        String s = "01010101010";
//        System.out.println(isBinary(s));
//
//        String s1 = "geeks101";
//        System.out.println(isBinary(s1));

//        String str = "abc";
//        System.out.println(findSubstrings(str));

//        String str1 = "Hello World";
//        String str2 = "Good Morning";
//        str2 = str2.toLowerCase();
//        System.out.println(reverseString(str1));
//        System.out.println(reverseString2(str2));

//        System.out.println(join2String(str1, str2));
//        System.out.println(joinString(str1, str2));
//        System.out.println(joinString2(str1, str2));

//        String str = "GeeksforGeeks";
//        System.out.println(removeAllChar(str, 'e'));
//        System.out.println(removeChar(str,2));

//        String str2 = "GeeksforGeeksp";
//        System.out.println(insertCharacter(str, 4, 'R'));
//        System.out.println(insertChar(str, 3, 'W'));
//        System.out.println(str.indexOf('k'));
//        System.out.println(searchChar(str, 'e'));
//        System.out.println(lengthOfString(str));
//        System.out.println(str.length());
//
//        System.out.println(str.equals(str2));
//        System.out.println(is2StringsSame(str, str2));
    }
}
