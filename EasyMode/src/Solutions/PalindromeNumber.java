package Solutions;

import java.util.ArrayList;

public class PalindromeNumber {
    public PalindromeNumber() {
    }

    public boolean isPalindrome(int x) {
        String xString = String.valueOf(x);
        char[] xArray = xString.toCharArray();
        int xLen = xString.length();

        ArrayList equalNum = new ArrayList<Integer>();

        if (xLen == 1) {
            return true;
        } else {
            for (int i = 0; i < xLen / 2; i++) {
                if (xArray[i] == xArray[xLen - i - 1]) {
                    equalNum.add(1);
                } else equalNum.add(0);
            }
        }
        return !equalNum.contains(0);
    }
}

