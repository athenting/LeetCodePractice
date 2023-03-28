package Solutions.Blind75;

import java.util.Stack;

public class PalindromeString {

    public boolean isPalindrome(String s) {

        boolean isP = true;

        String s1 = s.toLowerCase().replaceAll("[^0-9a-z]", "");

        char[] array = s1.toCharArray();

        Stack<Character> stack1 = new Stack<>();

        //偶数
        if (array.length % 2 == 0) {

            for (int i = 0; i < array.length / 2; i++) {
                stack1.push(array[i]);
            }

            for (int j = array.length / 2; j < array.length; j++) {
                if (array[j] != stack1.pop()) {
                    return false;
                }
            }
        } else {//奇数

            for (int i = 0; i < (array.length - 1) / 2; i++) {
                stack1.push(array[i]);
            }

            for (int j = (array.length + 1) / 2; j < array.length; j++) {
                if (array[j] != stack1.pop()) {
                    return false;
                }
            }
        }

        return isP;
    }

}
