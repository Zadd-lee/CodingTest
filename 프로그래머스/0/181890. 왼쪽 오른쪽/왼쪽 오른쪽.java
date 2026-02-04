import java.util.*;
import java.lang.*;
class Solution {
    public String[] solution(String[] str_list) {
        List<String> rs = new ArrayList<>();
        
        int lInd = Arrays.asList(str_list).indexOf("l");
        int rInd = Arrays.asList(str_list).indexOf("r");
        
        if(lInd == rInd && lInd ==-1){
            String[] answer = {};
            return answer;
        }else if(lInd!=-1 && rInd !=-1){
            if(lInd<rInd){
                for(int i=0;i<lInd;i++){
                    rs.add(str_list[i]);
                }
            }else{
                for(int i = rInd+1;i<str_list.length;i++){
                    rs.add(str_list[i]);
                }
            }
        }else if(lInd!=-1){
            for(int i=0;i<lInd;i++){
                    rs.add(str_list[i]);
                }
        }else{
            for(int i = rInd+1;i<str_list.length;i++){
                    rs.add(str_list[i]);
                }
        }
        
        return rs.toArray(new String[rs.size()]);
        
    }
}