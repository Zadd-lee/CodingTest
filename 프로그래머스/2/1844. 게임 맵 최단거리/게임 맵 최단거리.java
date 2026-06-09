import java.util.*;
import java.lang.*;

class Solution {
    private static int[] dx = {0,0,1,-1};
    private static int[] dy = {1,-1,0,0};
    private boolean[][] visited;
    
    
    public int solution(int[][] maps) {
        int tx = maps.length-1;
        int ty = maps[0].length-1;
        visited = new boolean[tx+1][ty+1];
        
        Queue<int[]> q= new LinkedList<>();
        q.offer(new int[]{0,0,1});
        
        while(!q.isEmpty()){
            int[] coord = q.poll();
            int x = coord[0];
            int y = coord[1];
            int cnt = coord[2];
            visited[x][y] = true;
                        
            if(x==tx && y == ty) return cnt;
            
            for(int i = 0;i<4;i++){
                int xx = x+dx[i];
                int yy = y+dy[i];
              
                
                if(xx<0 ||xx>tx || yy<0 || yy>ty ||visited[xx][yy]) continue;
                if(maps[xx][yy]==0) continue;
                visited[xx][yy] = true;

                q.offer(new int[]{xx,yy,cnt+1});
            }

        
        }
        return -1;
    }
}