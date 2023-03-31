package Solutions.Blind75;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public int majorityElement(int[] nums) {

        Map<Integer, Integer> occurrence = new HashMap();

        for (int n : nums) {
            occurrence.put(n, occurrence.getOrDefault(n, 0) + 1);
        }

        for (int key : occurrence.keySet()) {
            if (occurrence.get(key) > nums.length / 2) {
                return key;
            }
        }

        return -1;
    }
}
