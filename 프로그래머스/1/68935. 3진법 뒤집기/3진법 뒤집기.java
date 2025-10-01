class Solution {
    public int solution(int n) {
        // 1. 10진수를 3진수 문자열로 변환
        String ternary = "";
        int num = n;
        while (num > 0) {
            ternary += num % 3; // 뒤에서부터 붙이면 이미 뒤집힌 상태
            num /= 3;
        }

        // 2. 뒤집힌 3진수 문자열을 10진수로 변환
        int result = 0;
        int power = 1; // 3의 거듭제곱
        for (int i = ternary.length() - 1; i >= 0; i--) {
            result += (ternary.charAt(i) - '0') * power;
            power *= 3;
        }

        return result;
    }
}