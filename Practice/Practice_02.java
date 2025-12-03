package Learn_Java.Practice;

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
    static void main(String[] args) {
        String str = "GeeksforGeeks";
//        String str2 = "GeeksforGeeksp";

        System.out.println(insertChar(str, 3, 'W'));
//        System.out.println(str.indexOf('k'));
//        System.out.println(searchChar(str, 'e'));
//        System.out.println(lengthOfString(str));
//        System.out.println(str.length());
//
//        System.out.println(str.equals(str2));
//        System.out.println(is2StringsSame(str, str2));
    }
}
