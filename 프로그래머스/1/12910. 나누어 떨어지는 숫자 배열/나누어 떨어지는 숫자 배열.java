import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        // 결과를 담을 리스트
        List<Integer> list = new ArrayList<>();
        
        // arr 배열을 순회하며 divisor로 나누어 떨어지는 원소만 담기
        for (int num : arr) {
            if (num % divisor == 0) {
                list.add(num);
            }
        }
        
        // 나누어 떨어지는 원소가 없을 경우
        if (list.isEmpty()) {
            return new int[]{-1};
        }
        
        // 오름차순 정렬
        Collections.sort(list);
        
        // 리스트 → 배열 변환
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}