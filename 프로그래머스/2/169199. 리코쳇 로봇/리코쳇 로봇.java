import java.util.*;
import java.lang.*;

class Solution {
    String[] map;
    int[] dx = {1,-1,0,0};
    int[] dy = {0,0,1,-1};
    public int solution(String[] board) {
        map = board;
        Queue<int[]> q = new ArrayDeque<>();
        boolean[][] visited = new boolean[board.length][board[0].length()];
        
        for(int i = 0;i<map.length;i++){
            int ind = map[i].indexOf('R');
            if(ind!=-1){
                q.offer(new int[]{i,ind,0});
                visited[i][ind] = true;
                break;
            }
        }
        
        
        while(!q.isEmpty()){
            int[] p = q.poll();
            int x = p[0];
            int y = p[1];
            if(board[x].charAt(y)=='G') return p[2];
            
            for(int ind = 0;ind<4;ind++){
                int[] s = sliding(x,y,ind);
                if(s[0]==-1) continue;
                if(visited[s[0]][s[1]]) continue;
                visited[s[0]][s[1]] = true;
                q.offer(new int[]{s[0],s[1],p[2]+1});
                
            }
            
        }
        
        return -1;
    }
    
    int[] sliding(int x, int y, int dir) {

    int cx = x;
    int cy = y;

    while (true) {
        int nx = cx + dx[dir];
        int ny = cy + dy[dir];
        if (nx < 0 || ny < 0 ||
            nx >= map.length || ny >= map[0].length()) {
            break;
        }
        if (map[nx].charAt(ny) == 'D') {
            break;
        }
        cx = nx;
        cy = ny;
    }
    return new int[]{cx, cy};
    }
    
}