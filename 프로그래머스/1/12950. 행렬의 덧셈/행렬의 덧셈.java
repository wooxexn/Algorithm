class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int n = arr1.length;          // 행 개수
        int m = arr1[0].length;       // 열 개수
        int[][] answer = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return answer;
    }
}