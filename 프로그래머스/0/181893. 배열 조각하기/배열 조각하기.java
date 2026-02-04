import java.util.*;
import java.util.stream.*;
class Solution {
    public int[] solution(int[] arr, int[] query) {
        List<Integer> rs = Arrays.stream(arr)
            .boxed()
            .collect(Collectors.toList());
        
        
        for(int i = 0;i<query.length;i++){
            if(i%2==0){
                rs.subList(query[i]+1,rs.size()).clear();
            }else{
                rs.subList(0,query[i]).clear();
            }
        }
        
        return rs.stream()
            .mapToInt(i->i)
            .toArray();
    }
}