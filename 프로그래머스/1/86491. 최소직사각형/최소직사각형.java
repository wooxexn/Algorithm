class Solution {
    public int solution(int[][] sizes) {
        int maxWidth = 0;
        int maxHeight = 0;

        for (int[] size : sizes) {
            int w = size[0];
            int h = size[1];
            
            // 큰 값은 가로, 작은 값은 세로
            int big = Math.max(w, h);
            int small = Math.min(w, h);
            
            if (big > maxWidth) maxWidth = big;
            if (small > maxHeight) maxHeight = small;
        }

        return maxWidth * maxHeight;
    }
}