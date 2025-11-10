class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int painted = 0; // 마지막으로 칠한 구역의 끝 번호

        for (int s : section) {
            // 이미 이 구역이 이전에 칠한 범위 안에 포함돼 있다면 넘어감
            if (s <= painted) continue;

            // 새로 칠해야 하는 경우
            answer++;
            painted = s + m - 1; // 이번 롤러로 덮을 수 있는 마지막 구역
        }

        return answer;
    }
}