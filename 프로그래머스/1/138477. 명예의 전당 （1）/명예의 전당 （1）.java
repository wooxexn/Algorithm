import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // 오름차순 최소 힙

        for (int i = 0; i < score.length; i++) {
            pq.add(score[i]); // 새로운 점수 추가
            
            // 명예의 전당 크기가 k를 초과하면 최소값 제거
            if (pq.size() > k) {
                pq.poll();
            }
            
            // 현재 명예의 전당에서 가장 낮은 점수 (힙의 top)
            answer[i] = pq.peek();
        }

        return answer;
    }
}