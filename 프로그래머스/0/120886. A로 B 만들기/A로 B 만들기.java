import java.util.*;

class Solution {
    public int solution(String before, String after) {
        char[] b = before.toCharArray();
        Arrays.sort(b);
        String bb = new String(b);
        
        char[] a = after.toCharArray();
        Arrays.sort(a);
        String aa = new String(a);
        
        if(aa.equals(bb)){
            return 1;
        }else{
            return 0;
        }
    }
}