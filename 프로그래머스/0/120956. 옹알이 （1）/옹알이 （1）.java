class Solution {
    public int solution(String[] babbling) {
        String[] sounds = {"aya", "ye", "woo", "ma"};
        int answer = 0;

        for (String word : babbling) {
            boolean valid = true;
            String temp = word;
            
            for (String s : sounds) {
                if (temp.contains(s)) {
                    temp = temp.replace(s, " "); // 한 번 사용 후 제거
                }
            }
            
            // 제거 후 남는 문자가 있으면 invalid
            temp = temp.replaceAll(" ", "");
            if (temp.length() == 0) {
                answer++;
            }
        }
        return answer;
    }
}