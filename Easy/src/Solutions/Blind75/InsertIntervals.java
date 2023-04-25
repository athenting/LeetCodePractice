package Solutions.Blind75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Greedy贪心算法
 */
public class InsertIntervals {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        List<int[]> list = new ArrayList<>(Arrays.asList(intervals));
        list.add(newInterval);
        int[][] merged = new int[list.size()][2];
        merged = list.toArray(merged);

        //升序排列 sort方法返回值是void
        Arrays.sort(merged, Comparator.comparingInt(a -> a[0]));

        List<int[]> result = new ArrayList<>();
        int[] current = merged[0];
        result.add(current);

        for (int[] i : merged) {
            int currentEnd = current[1];
            int nextStart = i[0];
            int nextEnd = i[1];

            //注意currentEnd=nextStart的边界
            if (currentEnd >= nextStart) {
                current[1] = Math.max(currentEnd, nextEnd);
            } else {
                current = i;
                result.add(current);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}
