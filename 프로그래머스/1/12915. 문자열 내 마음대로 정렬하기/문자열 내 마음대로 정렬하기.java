import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, (s1, s2) -> {
            // n번째 문자를 비교
            if (s1.charAt(n) == s2.charAt(n)) {
                // 같으면 사전순으로 정렬
                return s1.compareTo(s2);
            } else {
                // 다르면 n번째 문자 기준으로 정렬
                return Character.compare(s1.charAt(n), s2.charAt(n));
            }
        });
        
        return strings;
    }
}