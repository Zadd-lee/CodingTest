//  좌표 정렬하기 2

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] input = new int[n][2];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 2; j++) {
                input[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        Arrays.sort(input, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                int c = Integer.compare(o1[1], o2[1]);
                if (c != 0) {
                    return c;
                } else {
                    return Integer.compare(o1[0], o2[0]);
                }

            }
        });
        for (int[] ints : input) {
            System.out.println(ints[0]+" "+ints[1]);
        }
    }
}