import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        // 중복을 허용하지 않기 위해 Set 사용
        Set<Integer> set = new HashSet<>();
        
        // 서로 다른 두 수를 더함
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }

        // Set을 리스트로 변환 후 정렬
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        
        // 리스트를 int 배열로 변환
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}