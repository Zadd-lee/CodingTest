import java.util.*;
import java.util.stream.*;
import java.lang.*;

class Solution {
    public int solution(int[] citations) {
        List<Integer> cita = Arrays.stream(citations)
            .boxed()
            .sorted((i1,i2)->i2-i1)
            .collect(Collectors.toList());
        int l = 1;
        int r = cita.size()-1;
        for(int h=cita.get(0);h>=0;h--){
            int ind = cita.lastIndexOf(h);
            if(ind !=-1){
                l = ind+1;
                r = cita.size()-1-ind;
            }
            if(h <= l && h >= r){
                return h;
            }
        }
        return 0;
    }
}