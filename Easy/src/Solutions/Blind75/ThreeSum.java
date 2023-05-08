package Solutions.Blind75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        //边界：处理空数组和元素少于三的情况
        if (nums == null || nums.length < 3) return result;

        //变成有序数组，此方法排出的是升序，从小到大
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1;
            int right = nums.length - 1;
            int target = Math.negateExact(nums[i]);

            while (left < right) {

                int sum = nums[left] + nums[right];

                if (sum == target) {
                    //如果左右的sum等于第一个值的反数，把他们三个加入结果集中
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    //如果left向右移动一步之后的值等于移动之前的值，再继续移动
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                    //如果right向右移动一步之后的值等于移动之前的值，再继续移动
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                } else if (sum < target) {
                    left++;//数值增大
                } else {
                    right--;//数值减少
                }
            }
        }

        return result;
    }
}
