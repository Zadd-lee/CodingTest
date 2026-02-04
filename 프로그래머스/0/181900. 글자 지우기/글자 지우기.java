import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        int[] ind = new int[my_string.length()];
        for(int indi:indices){
            ind[indi]++;
        }
        
        StringBuffer sb= new StringBuffer();
        for(int i=0 ;i<ind.length;i++){
            if(ind[i]==0){
                sb.append(my_string.charAt(i));
            }
        }
        
        return sb.toString();
    }
}