import java.lang.*;
import java.util.*;

class Solution {
    int[] dx = {1,-1,0,0};
    int[] dy = {0,0,1,-1};
    
    public int[] solution(String[][] places) {
        int[] answer = new int[5];
        for(int room = 0;room<5;room++){
            
            String[] place = places[room];
            boolean safe = true;
            for(int i = 0;i<5;i++){
                for(int j = 0;j<5;j++){
                    if(place[i].charAt(j)!='P') continue;
                    if(!check(place,i,j)){
                        safe = false;
                        break;
                    }
                }
            }
            if(safe) answer[room] = 1;
            
        }
        return answer;
    }
    boolean check(String[] place,int i,int j){
        boolean[][] visited = new boolean[5][5];

        Queue<int[]> q = new ArrayDeque<>();
        q.offer(new int[]{i,j,0});
        visited[i][j] = true;

        while(!q.isEmpty()){
            int[] p = q.poll();
            int x = p[0];
            int y = p[1];
            if(p[2]>=2) continue;


            for(int k = 0;k<4;k++){
                int nx = x+dx[k];
                int ny = y+dy[k];
                if(nx>4 || nx<0 || ny>4 || ny<0) continue;
                if(visited[nx][ny]) continue;
                if(place[nx].charAt(ny)=='X') continue;
                if(place[nx].charAt(ny)=='P')
                    
                if(place[nx].charAt(ny)=='P') return false;
                q.offer(new int[]{nx,ny,p[2]+1});
                visited[nx][ny] = true;
                

            }
        }
        return true;
    }
}