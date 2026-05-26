import java.util.*;
import java.lang.*;

class Solution {
    public String reverseWords(String s) {
        String[] sp = s.split(" ");
        List<String> c = new ArrayList<>();
        for(String sps : sp){
            if(!sps.isBlank()){
                c.add(sps);
            } 
        }

        StringBuilder sb = new StringBuilder();

        for(int i=c.size()-1;i>=0;i--){
            sb.append(c.get(i));
            if(i!=0) sb.append(" ");
        }
        return sb.toString();
    }
}