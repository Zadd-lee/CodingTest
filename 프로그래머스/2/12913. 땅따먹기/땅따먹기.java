class Solution {
    public int solution(int[][] land) {

        int n = land.length;

        int[][] dp = new int[n][4];
        dp[0] = land[0];

        for (int i = 1; i < n; i++) {

            for (int j = 0; j < 4; j++) {

                int maxPrev = 0;

                for (int k = 0; k < 4; k++) {

                    if (k==j) continue;

                    maxPrev = Math.max(maxPrev, dp[i-1][k]);
                }

                // 현재 칸을 선택했을 때 최대 누적 점수
                dp[i][j] = maxPrev + land[i][j];
            }
        }

        int answer = 0;

        for (int j = 0; j < 4; j++) {
            answer = Math.max(answer, dp[n-1][j]);
        }

        return answer;
    }
}