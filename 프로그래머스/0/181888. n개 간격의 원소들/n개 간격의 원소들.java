import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        List<Integer> rs = new ArrayList<>();
        
        for(int i=0;i<num_list.length;i+=n){
            rs.add(num_list[i]);
        }
        
        return rs.stream()
            .mapToInt(i->i)
            .toArray();
    }
}