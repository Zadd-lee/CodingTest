import java.lang.*;
import java.util.*;

class Solution {
    boolean[] visited;
    public int solution(int n, int[][] wires) {
        int answer = Integer.MAX_VALUE;
        for(int i = 0;i<wires.length;i++){
            visited = new boolean[n+1];
            List<int[]> sliceMap = new ArrayList<>(Arrays.asList(wires));
            sliceMap.remove(i);
            List<Integer> r = new ArrayList<>();
            for(int j = 1;j<=n;j++){
                if(visited[j]) continue;
                int rs = bfs(sliceMap,j);
                r.add(rs);
            }
            answer = Math.min(answer,Math.abs(r.get(0)-r.get(1)));
            
        }
        
        return answer;
    }
    int bfs(List<int[]> maps, int start){
        int cnt = 0;
        Queue<Integer> q = new ArrayDeque<>();
        q.offer(start);

        while(!q.isEmpty()) {
            int now = q.poll();
            cnt++;
            visited[now] = true;
            
            for(int[] map:maps){
                int next = 0;
                if(map[0]==now) next = map[1];
                else if(map[1]==now) next = map[0];
                else continue;
                
                if(visited[next]) continue;
                visited[next] = true;
                q.offer(next);
            }
    }

    return cnt;
        
    }
}