class Solution {
    public int solution(int left, int right) {
        int sum = 0;
        for (int i = left; i <= right; i++) {
            sum += (Math.sqrt(i) % 1 == 0) ? -i : i;
        }
        return sum;
    }
}