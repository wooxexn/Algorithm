class Solution {
    public String solution(int a, int b) {
        String[] days = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int[] monthDays = {31,29,31,30,31,30,31,31,30,31,30,31}; // 2016년 윤년 기준
        
        // 1월 1일부터 a월 b일까지 총 지난 일수 계산
        int totalDays = 0;
        for (int i = 0; i < a - 1; i++) {
            totalDays += monthDays[i];
        }
        totalDays += b - 1; // b일까지 포함하려면 b-1일 만큼 더함
        
        // 2016년 1월 1일은 금요일(FRI), days 배열에서 인덱스 5
        int dayIndex = (totalDays + 5) % 7;
        
        return days[dayIndex];
    }
}