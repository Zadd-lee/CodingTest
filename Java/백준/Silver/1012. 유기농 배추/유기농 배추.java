//  유기농 배추

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static  int m,n, k;
    static int[][] map;
    static  boolean[][] visited;
    static int[] dx = {0, -1, 0, 1};
    static int[] dy = {1, 0, -1, 0};

    static void dfs(int x, int y) {
        visited[x][y] = true;
        for (int i = 0; i < 4; i++) {
            int cx = x + dx[i];
            int cy = y + dy[i];
            if (cx >= 0 && cy >= 0 && cx < m && cy < n) {
                if (!visited[cx][cy] && map[cx][cy] == 1) {
                    dfs(cx, cy);
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());
             m = Integer.parseInt(st.nextToken());
             n = Integer.parseInt(st.nextToken());
             k = Integer.parseInt(st.nextToken());

            map = new int[m][n];
            visited = new boolean[m][n];

            for (int j = 0; j < k; j++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                map[x][y] = 1;
            }

            int cnt = 0;

            for (int y = 0; y < n; y++) {
                for (int x = 0; x < m; x++) {
                    if (map[x][y] == 1 && !visited[x][y]) {
                        dfs(x,y);
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);
        }


    }

}