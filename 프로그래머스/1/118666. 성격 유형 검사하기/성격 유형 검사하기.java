import java.lang.*;
import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String[] codes = {"RT","CF","JM","AN"};
        int[] cnt = new int[4];
        
        for(int i = 0;i< survey.length;i++){
            String s = survey[i];
            for(int ind = 0;ind<4;ind++){
                int nI = s.indexOf(codes[ind].charAt(0));
                if(nI<0) continue;
                else if(nI==0){
                    cnt[ind]-=choices[i]-4;
                }else{
                    cnt[ind]+=choices[i]-4;
                }
            }
        }
        
        String answer = "";
        for(int i = 0;i<4;i++){
            if(cnt[i]<0){
                answer+=codes[i].charAt(1);
            }else{
                answer+=codes[i].charAt(0);
            }
        }
        return answer;
    }
}