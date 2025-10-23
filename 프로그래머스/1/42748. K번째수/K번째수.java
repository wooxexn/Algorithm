import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for (int i = 0; i < commands.length; i++) {
            int start = commands[i][0];
            int end = commands[i][1];
            int k = commands[i][2];
            
            // 부분 배열 자르기
            int[] temp = Arrays.copyOfRange(array, start - 1, end);
            
            // 정렬
            Arrays.sort(temp);
            
            // k번째 수 꺼내기
            answer[i] = temp[k - 1];
        }
        
        return answer;
    }
}