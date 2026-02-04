import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        List<Integer> rs = new ArrayList<>();
        
        for(int i=n;i<num_list.length;i++){
            rs.add(num_list[i]);
        }
        for(int i=0;i<n;i++){
            rs.add(num_list[i]);
        }
        return rs.stream()
            .mapToInt(i->i)
            .toArray();
    }
}