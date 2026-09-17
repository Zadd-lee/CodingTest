import java.lang.*;
import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String,Integer> p = new HashMap<>();
        for(int i = 0;i<players.length;i++){
            p.put(players[i],i);
        }
        for(String calling:callings){
            int i =p.get(calling);
            String prep = players[i-1];
            players[i-1] = calling;
            players[i]=prep;
            p.put(calling,i-1);
            p.put(prep,i);
        }
        
        return players;
    }
}