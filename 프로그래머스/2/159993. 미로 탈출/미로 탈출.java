import java.lang.*;
import java.util.*;

class Solution {
    int[] dx = {1,-1,0,0};
    int[] dy = {0,0,1,-1};
    boolean[][] visited;
    
    public int solution(String[] maps) {
        int sx = 0;
        int sy = 0;
        int lx = 0;
        int ly = 0;
        int answer =0;
        for(int i = 0;i<maps.length;i++){
            for(int j = 0;j<maps[0].length();j++){
                if(maps[i].charAt(j)=='S'){
                    sx = i;
                    sy = j;
                }else if(maps[i].charAt(j)=='L'){
                    lx = i;
                    ly = j;
                }
            }
        }
        int temp = bfs(maps,sx,sy,'L');
        if(temp == -1) return -1;
        answer+=temp;
        temp = bfs(maps,lx,ly,'E');
        if(temp == -1) return -1;
        answer+= temp;
        return answer;
    }
    
    int bfs(String[] maps,int startX,int startY,int target){
        Queue<int[]> q = new ArrayDeque<>();
        boolean[][] visited = new boolean[maps.length][maps[0].length()];
        q.offer(new int[]{startX,startY,0});
        visited[startX][startY] = true;
        
        while(!q.isEmpty()){
            int[] p = q.poll();
            int px = p[0];
            int py = p[1];
            if(maps[px].charAt(py)==target) return p[2];
            for(int i= 0;i<4;i++){
                int nx = px+dx[i];
                int ny = py+dy[i];
                if(nx<0 || nx>=maps.length || ny<0 || ny>=maps[0].length()) continue;
                if(visited[nx][ny]) continue;
                if(maps[nx].charAt(ny)=='X') continue;
                visited[nx][ny] = true;
                q.offer(new int[]{nx,ny,p[2]+1});
                
            }
        }
        return -1;

    }
}