

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        ArrayDeque<Integer> q = new ArrayDeque<>();

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String code = br.readLine();
            if (code.startsWith("push")) {
                StringTokenizer st = new StringTokenizer(code);
                st.nextToken();
                int x = Integer.parseInt(st.nextToken());
                q.offer(x);

            } else if (code.equals("pop")) {
                sb.append(q.isEmpty() ? -1 : q.poll()).append('\n');

            } else if (code.equals("size")) {
                sb.append(q.size()).append('\n');

            } else if (code.equals("empty")) {
                sb.append(q.isEmpty() ? 1 : 0).append('\n');

            } else if (code.equals("front")) {
                sb.append(q.isEmpty() ? -1 : q.peek()).append('\n');

            } else if (code.equals("back")) {
                sb.append(q.isEmpty() ? -1 : q.peekLast()).append('\n');
            }
        }
        System.out.println(sb);


    }


}