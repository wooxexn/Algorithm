class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for (String b : babbling) {
            if (b.matches("^(aya|ye|woo|ma)+$") &&    // 구성요소 검사
                !b.contains("ayaaya") &&
                !b.contains("yeye") &&
                !b.contains("woowoo") &&
                !b.contains("mama")) {

                answer++;
            }
        }
        return answer;
    }
}