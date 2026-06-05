import java.util.*;
import java.lang.*;
class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[n];
        for(int start = 0;start<n;start++){
            
            if(visited[start]) continue;
            
            Queue<Integer> q = new LinkedList<>();
            q.offer(start);
            while(!q.isEmpty()){
                int node = q.poll();
                visited[node] = true;
                for(int i = 0;i<n;i++){
                    if(computers[node][i]==1){
                        if(!visited[i]){
                            q.offer(i);
                        }
                    }
                }
            }
            
            answer++;
        }
        return answer;
    }
}