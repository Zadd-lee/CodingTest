import java.util.*;
import java.lang.*;
class Solution {
    public List<String> solution(String[] strArr) {
        List<String> result = new ArrayList<>();
        for(String s : strArr){
            if(!s.contains("ad")) result.add(s);
        }
        return result;
    }
}