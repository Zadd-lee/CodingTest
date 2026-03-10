
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    static List<List<Integer>> graph;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        graph = new ArrayList<>();
        visited = new boolean[n + 1];

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            addEdge(a, b);
        }

        for (int i = 1; i <= n; i++) {
            Collections.sort(graph.get(i));
        }

        dfs(v);
        sb.append('\n');
        visited = new boolean[n + 1];
        bfs(v);
        System.out.println(sb);

    }

    private static void dfs(int node) {
        sb.append(node).append(' ');
        visited[node] = true;
        for (Integer next : graph.get(node)) {
            if (!visited[next]) {
                dfs(next);
            }
        }
    }

    private static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int now = queue.poll();
            sb.append(now).append(' ');
            for (int next: graph.get(now)) {
                if (!visited[next]) {
                    visited[next] = true;
                    queue.offer(next);
                }
            }
        }
    }
    private static void addEdge(int a, int b) {
        graph.get(a).add(b);
        graph.get(b).add(a);
    }
}