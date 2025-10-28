class Solution {
    public String solution(int[] food) {
        StringBuilder left = new StringBuilder();
        
        // 왼쪽 절반 만들기
        for (int i = 1; i < food.length; i++) {
            int count = food[i] / 2; // 양쪽으로 나눌 수 있는 개수
            for (int j = 0; j < count; j++) {
                left.append(i); // 왼쪽에 추가
            }
        }
        
        // 오른쪽은 왼쪽을 뒤집은 형태
        String right = new StringBuilder(left).reverse().toString();
        
        // 최종 문자열 반환
        return left.toString() + "0" + right;
    }
}