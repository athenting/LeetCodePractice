package Solutions.Blind75;

import java.util.ArrayDeque;
import java.util.Deque;

public class BackSpaceCompare {

    //dynamic programming
    public boolean backspaceCompare(String s, String t) {

        char[] first = s.toCharArray();
        char[] second = t.toCharArray();
        Deque<Character> sb1 = new ArrayDeque();
        Deque<Character> sb2 = new ArrayDeque();

        for (char f : first) {
            if (f == '#') {
                if (!sb1.isEmpty()) {
                    sb1.pop();
                }
            } else {
                sb1.add(f);
            }
        }
        for (char se : second) {
            if (se == '#') {
                if (!sb2.isEmpty()) {
                    sb2.pop();
                }
            } else {
                sb2.add(se);
            }
        }
        return sb1.equals(sb2);
    }

}
