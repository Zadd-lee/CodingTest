import java.util.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        List<String> rs = new ArrayList<>();
        
        for(int i=0;i<todo_list.length;i++){
            if(!finished[i]){
                rs.add(todo_list[i]);
            }
        }
        
        return rs.toArray(new String[rs.size()]);
    }
}