class Solution {
    public int[] solution(int[] arr) {
        // 가장 작은 수를 찾기
        int min = Integer.MAX_VALUE;
        for (int num : arr) {
            min = Math.min(min, num);
        }

        // 가장 작은 수를 제외한 새로운 배열 크기 계산
        int newSize = arr.length - 1;  // 하나의 수를 제거하므로 배열 크기는 1 줄어듬
        if (newSize == 0) {
            return new int[]{-1};  // 배열에서 하나만 남았다면 -1 리턴
        }

        // 새로운 배열 만들기
        int[] result = new int[newSize];
        int index = 0;
        for (int num : arr) {
            if (num != min) {
                result[index++] = num;
            }
        }

        return result;
    }
}