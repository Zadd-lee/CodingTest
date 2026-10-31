import java.util.*;
import java.lang.*;

class Solution {
    boolean[] visited;
    List<String> answer = new ArrayList<>();
    public String[] solution(String[][] tickets) {
        Arrays.sort(tickets,(a,b)->a[1].compareTo(b[1]));
        visited = new boolean[tickets.length];
        
        answer.add("ICN");
        dfs(tickets,"ICN",0);
    
        return answer.toArray(new String[0]);
    }
    
    boolean dfs(String[][] tickets, String start,int cnt){
        if(cnt>=tickets.length) return true;
        for(int i = 0;i<tickets.length;i++){
            String[] t = tickets[i];
            if(!t[0].equals(start)) continue;
            if(visited[i]) continue;
            visited[i] = true;
            answer.add(t[1]);
            if(dfs(tickets,t[1],cnt+1)) return true;   
            visited[i] = false;
            
        }
        answer.remove(answer.size()-1);
        return false;
    }
}