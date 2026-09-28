import java.lang.*;
import java.util.*;

class Solution {
    int[] dx = {1,-1,0,0};
    int[] dy  = {0,0,1,-1};
    public int solution(int[][] maps) {
        int answer = Integer.MAX_VALUE;
        boolean[][] visited = new boolean[maps.length][maps[0].length];
        Queue<int[]> q = new ArrayDeque<>();
        q.offer(new int[]{0,0,1});
        visited[0][0] = true;
        while(!q.isEmpty()){
            int[] p = q.poll();
            int nx = p[0];
            int ny = p[1];
            
            
            if(nx==maps.length-1 && ny == maps[0].length-1){
                answer = Math.min(answer,p[2]);
            }
            
            for(int i = 0;i<4;i++){
                int nextx = nx+dx[i];
                int nexty = ny+dy[i];
                if(nextx<0 || nextx>=maps.length || nexty<0 || nexty>=maps[0].length) continue;
                if(maps[nextx][nexty]==0 ||visited[nextx][nexty]) continue;
                visited[nextx][nexty] = true;
                q.offer(new int[]{nextx,nexty,p[2]+1});
            }
        }
        
        return (answer==Integer.MAX_VALUE)?-1:answer;
    }
}