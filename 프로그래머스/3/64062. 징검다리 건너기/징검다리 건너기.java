class Solution {
    public int solution(int[] stones, int k) {
        int left = 1;
        int right = 0;

        for (int stone : stones) {
            right = Math.max(right, stone);
        }

        int answer = 0;

        while (left <= right) {
            int mid = (left + right) / 2;

            int cnt = 0;

            for (int stone : stones) {
                if (stone < mid) {
                    cnt++;

                    if (cnt >= k) {
                        break;
                    }
                } else {
                    cnt = 0;
                }
            }

            if (cnt >= k) {
                right = mid - 1;
            } else {
                answer = mid;
                left = mid + 1;
            }
        }

        return answer;
    }
}