import java.lang.*;
import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        Map<String,Integer> per = new HashMap<>();
        for(int i = 0;i<name.length;i++){
            per.put(name[i],yearning[i]);
        }
        int[] answer = new int[photo.length];
        for(int i = 0;i<photo.length;i++){
            int hap = 0;
            for(String na:photo[i]){
                hap+=per.getOrDefault(na,0);
            }
            answer[i]=hap;
        }
        return answer;
    }
}