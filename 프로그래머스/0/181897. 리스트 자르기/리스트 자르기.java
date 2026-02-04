import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        List<Integer> rs = Arrays.stream(num_list)
            .boxed()
            .collect(Collectors.toList());
        
        switch (n){
            case 1:
                rs.subList(slicer[1]+1,rs.size()).clear();
                break;
                
            case 2:
                rs.subList(0,slicer[0]).clear();
                break;
                
            case 3:
                rs = rs.subList(slicer[0],slicer[1]+1);
                break;
            case 4:
                rs.clear();
                for(int i=slicer[0];i<=slicer[1];i+=slicer[2]){
                    rs.add(num_list[i]);
                }
                break;
                
        } 
        return rs.stream()
            .mapToInt(i->i)
            .toArray();
    }
}