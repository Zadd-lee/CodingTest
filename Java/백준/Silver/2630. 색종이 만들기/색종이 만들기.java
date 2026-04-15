//  색종이 만들기

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {

    static boolean[] cx = {true, false, true, false};
    static boolean[] cy = {true, true, false, false};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Queue<int[][]> q = new LinkedList<>();

        int[][] input = new int[n][n];
        int[] complete = new int[2];

        for (int y = 0; y < n; y++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int x = 0; x < n; x++) {
                input[y][x] = Integer.parseInt(st.nextToken());
            }
        }
        q.add(input);

        while (!q.isEmpty()) {
            int[][] now = q.poll();
            if (isFullColor(now)) {//동일한 경우
                if (now[0][0] == 0) complete[0]++;
                else complete[1]++;

            } else {
                int a = now.length / 2;

                for (int i = 0; i < 4; i++) {
                    int[][] cutting = new int[a][a];
                    for (int y = 0; y < a; y++) {
                        for (int x = 0; x < a; x++) {
                            int nowY = cy[i] ? 0 : a;
                            int nowX = cx[i] ? 0 : a;
                            cutting[y][x] = now[nowY + y][nowX + x];
                        }
                    }
                    q.add(cutting);
                }


            }
        }

        System.out.println(complete[0]);
        System.out.println(complete[1]);


    }

    static boolean isFullColor(int[][] paper) {
        int target = paper[0][0];
        for (int y = 0; y < paper.length; y++) {
            for (int x = 0; x < paper.length; x++) {
                if (paper[y][x] != target) {
                    return false;
                }
            }
        }
        return true;
    }
}