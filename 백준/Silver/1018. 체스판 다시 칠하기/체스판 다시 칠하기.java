
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static boolean[][] board;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        board = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < m; j++) {
                board[i][j] = (str.charAt(j) == 'W');
            }
        }

        int minColoring = 9999;
        for (int i = 0; i < n - 7; i++) {
            for (int j = 0; j < m - 7; j++) {
                int coloring = coloring(i, j);
                minColoring = Math.min(minColoring, coloring(i, j));
            }
        }
        System.out.println(minColoring);
    }

    private static int coloring(int startRow, int startCol) {
        boolean standard = board[startRow][startCol];
        int cnt = 0;

        for (int i = startCol; i < startCol + 8; i++) {
            for (int j = startRow; j < startRow + 8; j++) {

                if (board[j][i] != standard) {
                    cnt++;
                }
                standard = !standard;
            }
            standard = !standard;
        }

        return Math.min(cnt,64-cnt);
    }
}