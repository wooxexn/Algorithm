import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        Map<Character, Integer> lastIndex = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (lastIndex.containsKey(c)) {
                answer[i] = i - lastIndex.get(c);  // 가장 가까운 같은 글자와의 거리
            } else {
                answer[i] = -1;  // 처음 등장한 경우
            }

            lastIndex.put(c, i); // 현재 인덱스로 갱신
        }

        return answer;
    }
}