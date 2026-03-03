

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] input = new int[n][2];
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 2; j++) {
                input[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i = 0; i < n; i++) {
            int[] stand = input[i];
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if(i==j) continue;
                if(stand[0]<input[j][0] && stand[1]<input[j][1]) cnt++;
            }
            result[i] = cnt+1;

        }

        for (int i : result) {
            System.out.print(i+" ");
        }

    }
}