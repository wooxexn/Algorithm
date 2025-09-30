class Solution {
    public int[] solution(int n, int m) {
        int gcd = getGCD(n, m);              // 최대공약수
        int lcm = n * m / gcd;               // 최소공배수
        
        return new int[]{gcd, lcm};          // 배열로 반환
    }
    
    // 유클리드 호제법으로 최대공약수 계산
    private int getGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}