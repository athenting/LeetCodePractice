package Solutions.Blind75;

public class RomanToInt {

    public int romanToInt(String s) {
        int decimal = 0;
        int prevValue = 0;

        for (int i = 0; i < s.length(); i++) {
            int curValue = getRomanValue(s.charAt(i));

            if (curValue > prevValue) {
                decimal -= 2 * prevValue; // subtract twice the previous value
            }

            decimal += curValue;
            prevValue = curValue;
        }

        return decimal;
    }

    private int getRomanValue(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}
