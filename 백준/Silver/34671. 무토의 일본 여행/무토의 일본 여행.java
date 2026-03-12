

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Map;

class Main {
    static int[][] graph;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());

        Map<String, Integer> time = new HashMap<>();

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            String input = Math.min(a, b) + " " + Math.max(a, b);
            time.put(input, Math.min(time.getOrDefault(input, Integer.MAX_VALUE), c));
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < q; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            String input = Math.min(a, b) + " " + Math.max(a, b);
            sb.append(time.getOrDefault(input, -1)).append("\n");
        }
        System.out.println(sb);


    }
}