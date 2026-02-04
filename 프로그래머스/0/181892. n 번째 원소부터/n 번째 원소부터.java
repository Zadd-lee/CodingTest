import java.util.*;
import java.util.stream.*;
class Solution {
    public int[] solution(int[] num_list, int n) {
        List<Integer> rs = new ArrayList<>();
        for(int i = n-1;i<num_list.length;i++){
            rs.add(num_list[i]);
        }
        return rs.stream()
            .mapToInt(i->i)
            .toArray();
    }
}