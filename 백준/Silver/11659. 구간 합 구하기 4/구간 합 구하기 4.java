
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        long[] hap = new long[n + 1];
        int[] input = new int[n + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i < n + 1; i++) {
            input[i] = Integer.parseInt(st.nextToken());
        }

        hap[1] = input[1];

        for (int i = 2; i < n + 1; i++) {
            hap[i] = hap[i - 1] + input[i];
        }
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sb.append(hap[Math.max(a, b)] - hap[Math.min(a, b) - 1]);

            sb.append('\n');
        }
        System.out.println(sb);

    }
}