import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        // 내림차순 정렬
        Arrays.sort(score);
        
        // 뒤에서부터 m개씩 묶기
        int n = score.length;
        for (int i = n; i >= m; i -= m) {
            // i - m 인덱스가 상자의 가장 낮은 점수
            int minScore = score[i - m];
            answer += minScore * m;
        }
        
        return answer;
    }
}