package Solutions.Blind75;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class CountingBits {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        for (int i = 0; i <= n; i++) {
            ans[i] = countOnes(i);//also, using Interger.bitcount() is more efficient and elegant
        }
        return ans;
    }

    private int countOnes(int num) {
        int count = 0;
        while (num > 0) {
            if (num % 2 == 1) {
                count++;
            }
            num = num / 2;
        }
        return count;
    }
}
