class Solution {
    public String solution(String phone_number) {
        int len = phone_number.length();
        String back = phone_number.substring(len-4);
        String front = "*".repeat(len-4);
        return front+back;
    }
}