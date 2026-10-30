import java.util.*;
import java.lang.*;

class Solution {
    boolean visited[];
    List<String> answer = new ArrayList<>();
    public String[] solution(String[][] tickets) {
        visited = new boolean[tickets.length];
        
        Arrays.sort(tickets,(a,b)->(a[1].compareTo(b[1])));
        
        
        
        answer.add("ICN");
        dfs(tickets,"ICN",0);
        
        
    
        return answer.stream().toArray(String[]::new);
    }
    boolean dfs(String[][] tickets,String start,int cnt){
        if(cnt>=tickets.length) return true;
        
        for(int i = 0;i<tickets.length;i++){
            String[] ticket = tickets[i];
            if(!ticket[0].equals(start)) continue;
            if(visited[i]) continue;
            visited[i] = true;
            answer.add(ticket[1]);
            if(dfs(tickets,ticket[1],cnt+1)){
                return true;
            }
            
            visited[i] = false;
            answer.remove(answer.size()-1);
            
        }
        return false;
    }
}
