class Solution {
    public String solution(String s) {
        String[] words = s.split(" ", -1); // 공백 기준으로 단어 나누기
        StringBuilder answer = new StringBuilder();

        for (int w = 0; w < words.length; w++) {
            String word = words[w];
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if (i % 2 == 0) {
                    sb.append(Character.toUpperCase(c));
                } else {
                    sb.append(Character.toLowerCase(c));
                }
            }

            answer.append(sb);
            if (w != words.length - 1) {
                answer.append(" "); // 단어 사이 공백 추가
            }
        }

        return answer.toString();
    }
}