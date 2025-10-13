class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int lenP = p.length();
        long numP = Long.parseLong(p); // p는 최대 18자리이므로 long 사용

        for (int i = 0; i <= t.length() - lenP; i++) {
            String sub = t.substring(i, i + lenP); // 부분 문자열 추출
            long numT = Long.parseLong(sub);

            if (numT <= numP) {
                answer++;
            }
        }

        return answer;
    }
}