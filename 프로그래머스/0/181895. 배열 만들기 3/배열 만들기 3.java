import java.util.*;

class Solution {
    public List<Integer> solution(int[] arr, int[][] intervals) {
        List<Integer> result = new ArrayList<>();
        
        for(int[] interval:intervals){
            for(int i = interval[0];i<=interval[1];i++){
                result.add(arr[i]);
            }
        }
        
        
        return result;
    }
}