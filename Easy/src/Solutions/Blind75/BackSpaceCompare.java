package Solutions.Blind75;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class BackSpaceCompare {

    //dynamic programming
    public boolean backspaceCompare(String s, String t) {

        char[] first = s.toCharArray();
        char[] second = t.toCharArray();
        Deque<Character> sb1 = new ArrayDeque();
        Deque<Character> sb2 = new ArrayDeque();

        for (char f : first) {
            if (f == '#') {
                sb1.pop();
            } else {
                sb1.add(f);
            }
        }

        return true;

    }

}
