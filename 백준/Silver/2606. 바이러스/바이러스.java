
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static List<List<Integer>> graph;
    static boolean[] visited;
    static int cnt;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sang = Integer.parseInt(br.readLine());

        graph = new ArrayList<>();
        visited = new boolean[n + 1];
        for (int i = 0; i < n+1; i++) {
            graph.add(new ArrayList<>());
            visited[i] = false;
        }

        for (int i = 0; i < sang; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            addEdge(a, b);
        }

        dfs(1);
        System.out.println(cnt-1);
    }

    private static void addEdge(int a, int b) {
        graph.get(a).add(b);
        graph.get(b).add(a);
    }

    private static void dfs(int node) {
        visited[node] = true;
        cnt++;
        for (Integer i : graph.get(node)) {
            if (!visited[i]) {
                dfs(i);
            }
        }
    }
}