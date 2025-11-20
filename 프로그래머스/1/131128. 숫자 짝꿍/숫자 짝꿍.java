class Solution {
    public String solution(String X, String Y) {
        int[] cx = new int[10], cy = new int[10];
        for (char c : X.toCharArray()) cx[c-'0']++;
        for (char c : Y.toCharArray()) cy[c-'0']++;

        StringBuilder sb = new StringBuilder();
        for (int i = 9; i >= 0; i--)
            for (int j = 0, common = Math.min(cx[i], cy[i]); j < common; j++)
                sb.append(i);

        if (sb.length() == 0) return "-1";
        if (sb.charAt(0) == '0') return "0";
        return sb.toString();
    }
}