import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int zero = 0, match = 0;
        for (int n : lottos) {
            if (n == 0) zero++;
            else for (int w : win_nums) if (n == w) match++;
        }
        return new int[]{rank(match + zero), rank(match)};
    }

    private int rank(int cnt) {
        return cnt > 1 ? 7 - cnt : 6;
    }
}