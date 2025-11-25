class Solution {
    public int solution(String s) {
        int answer = 0;
        char x = s.charAt(0);
        int countSame = 0;
        int countDiff = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == x) {
                countSame++;
            } else {
                countDiff++;
            }

            // 두 횟수가 같아지면 분리
            if (countSame == countDiff) {
                answer++;
                // 다음 문자열 조각을 위해 초기화
                if (i + 1 < s.length()) {
                    x = s.charAt(i + 1);
                }
                countSame = 0;
                countDiff = 0;
            }
        }

        // 마지막 조각이 분리되지 못한 경우 1 추가
        if (countSame != 0 || countDiff != 0) {
            answer++;
        }

        return answer;
    }
}