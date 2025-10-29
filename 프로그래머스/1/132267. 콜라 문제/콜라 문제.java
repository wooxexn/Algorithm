class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;

        while (n >= a) {
            int newCola = (n / a) * b; // 교환으로 받은 콜라 수
            answer += newCola;         // 총 받은 콜라 누적
            n = (n % a) + newCola;     // 남은 빈 병 갱신
        }

        return answer;
    }
}