import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n;

        // 정렬
        Arrays.sort(lost);
        Arrays.sort(reserve);

        // 1. 여벌이 있지만 본인이 도난당한 경우 제거
        List<Integer> lostList = new ArrayList<>();
        List<Integer> reserveList = new ArrayList<>();

        for (int l : lost) lostList.add(l);
        for (int r : reserve) reserveList.add(r);

        // 교집합 제거 (본인만 입음)
        Iterator<Integer> it = lostList.iterator();
        while (it.hasNext()) {
            int student = it.next();
            if (reserveList.contains(student)) {
                reserveList.remove(Integer.valueOf(student));
                it.remove();
            }
        }

        // 2. 빌려주기 시도
        for (Iterator<Integer> lostIt = lostList.iterator(); lostIt.hasNext(); ) {
            int l = lostIt.next();

            if (reserveList.contains(l - 1)) {
                reserveList.remove(Integer.valueOf(l - 1));
                lostIt.remove();
            } else if (reserveList.contains(l + 1)) {
                reserveList.remove(Integer.valueOf(l + 1));
                lostIt.remove();
            }
        }

        // 체육복을 못 빌린 학생 수만큼 전체 학생 수에서 제외
        answer -= lostList.size();

        return answer;
    }
}