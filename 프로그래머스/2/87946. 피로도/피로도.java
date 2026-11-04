class Solution {
    int answer = 0;
    boolean[] visited;
    public int solution(int k, int[][] dungeons) {
        
        for(int i = 0;i<dungeons.length;i++){
            if(k<dungeons[i][0]) continue;
            visited = new boolean[dungeons.length];
            visited[i] = true;
            dfs(k-dungeons[i][1],dungeons,1);
        }
        
        return answer;
    }
    void dfs(int fatigue, int[][]dungeons,int cnt){
        answer = Math.max(answer,cnt);
        
        for(int i = 0;i<dungeons.length;i++){
            if(visited[i]) continue;
            if(fatigue<dungeons[i][0]){
                visited[i]=false;
                continue;
            }
            visited[i] = true;
            dfs(fatigue-dungeons[i][1],dungeons,cnt+1);
            visited[i] = false;
        }
    }
}