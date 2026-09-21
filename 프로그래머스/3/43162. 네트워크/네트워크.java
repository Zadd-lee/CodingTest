import java.lang.*;
import java.util.*;

class Solution {
    boolean[] visited;
    
    public int solution(int n, int[][] computers) {
        int answer = 0;
        visited = new boolean[n];
        for(int i = 0;i<n;i++){
            if(visited[i]) continue;
            bfs(computers,i);
            answer++;
        }
        return answer;
    }
    
    void bfs(int[][] maps,int start){
        Queue<Integer> q = new ArrayDeque<>();
        q.offer(start);
        while(!q.isEmpty()){
            int now = q.poll();
            visited[now] = true;
            for(int i = 0;i<maps.length;i++){
                if(maps[now][i] == 1 && !visited[i]){
                    q.offer(i);
                }
            }
        }
    }
}