

class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuffer sb = new StringBuffer();
        sb.append(my_string.substring(0,s));
        
        StringBuffer sbR = new StringBuffer();
        sbR.append(my_string.substring(s,e+1));
        sbR.reverse();
        sb.append(sbR.toString());
        
        sb.append(my_string.substring(e+1,my_string.length()));
        
        return sb.toString();
    }
}