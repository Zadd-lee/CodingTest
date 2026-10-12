import java.util.*;
import java.lang.*;

class Solution {
    boolean[][] visited;
    int[] dx = {1,-1,0,0};
    int[] dy = {0,0,1,-1};
    public List<Integer> solution(String[] maps) {
        visited = new boolean[maps.length][maps[0].length()];
        List<Integer> result = new ArrayList<>();
        
        for(int i = 0;i<maps.length;i++){
            for(int j = 0;j<maps[0].length();j++){
                if(maps[i].charAt(j)!='X' && !visited[i][j]){
                    int sum = dfs(maps,i,j);
                    System.out.println(sum);
                    result.add(sum);
                }
            }
        }
        
        result.sort(Comparator.naturalOrder());
        if(result.size()==0) result.add(-1);
        return result;
    }
    
    int dfs(String[] maps, int x, int y){
        visited[x][y] = true;
        int hap=maps[x].charAt(y)-'0';
        for(int i = 0;i<4;i++){
            int nx = x+dx[i];
            int ny = y+dy[i];
            if(nx<0 || ny<0 || nx>=maps.length || ny>=maps[0].length()) continue;
            if(visited[nx][ny]) continue;
    
            if(maps[nx].charAt(ny)=='X') continue;
            hap += dfs(maps,nx,ny);
        }
        return hap;
        
    }
}