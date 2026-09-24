import java.util.*;
import java.lang.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        Map<Integer, Integer> count = new HashMap<>();

        for (int t : tangerine) {
            count.put(t, count.getOrDefault(t, 0) + 1);
        }

        List<Integer> counts = new ArrayList<>(count.values());
        counts.sort(Collections.reverseOrder());

        int answer = 0;

        for (int cnt : counts) {
            k -= cnt;
            answer++;

            if (k <= 0) {
                break;
            }
        }

        return answer;
    }
}