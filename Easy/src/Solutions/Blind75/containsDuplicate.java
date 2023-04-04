package Solutions.Blind75;

import java.util.HashMap;

public class containsDuplicate {
    public boolean containsDuplicate(int[] nums) {

        int piointer = 0;

        HashMap<Integer, Integer> countMap = new HashMap();

        for (int number : nums) {

            if (countMap.containsKey(number)) {
                return true;
            } else {
                countMap.put(number, piointer);
            }
        }
        return false;
    }
}
