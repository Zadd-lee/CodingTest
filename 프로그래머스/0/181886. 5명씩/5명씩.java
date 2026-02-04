import java.util.*;

class Solution {
    public String[] solution(String[] names) {
        List<String> rs = new ArrayList<>();
        
        for(int i=0;i<names.length;i+=5){
            rs.add(names[i]);
        }
        return rs.toArray(new String[rs.size()]);
    }
}