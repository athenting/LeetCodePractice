package Solutions;

import java.util.HashMap;

public class TwoNumSum01 {

    public TwoNumSum01() {
    }

    //hashmap method
    public int[] solution(int[] nums, int target) {
        int[] indexs = new int[2];
        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (hash.containsKey(nums[i])) {
                indexs[0] = i;
                indexs[1] = hash.get(nums[i]);
                return indexs;
            }
            // 将数据存入 key为补数 ，value为下标
            hash.put(target - nums[i], i);
        }
        return indexs;
    }
}
