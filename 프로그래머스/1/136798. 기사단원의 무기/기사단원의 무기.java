class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;

        for (int i = 1; i <= number; i++) {
            int count = getDivisorCount(i);
            
            // 제한 수치 초과 시 power로 대체
            if (count > limit) {
                answer += power;
            } else {
                answer += count;
            }
        }

        return answer;
    }

    // 제곱근까지만 탐색해서 약수 개수 구하기
    private int getDivisorCount(int n) {
        int cnt = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                cnt++; // i는 약수
                if (i != n / i) cnt++; // 서로 다른 짝 약수
            }
        }
        return cnt;
    }
}