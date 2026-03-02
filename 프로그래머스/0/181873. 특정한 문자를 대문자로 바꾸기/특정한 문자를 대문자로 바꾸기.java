class Solution {
    public String solution(String my_string, String alp) {
        StringBuffer sb = new StringBuffer();
        for(char c: my_string.toCharArray()){
            if(alp.charAt(0) == c){
                int cI = (int) c -32;
                sb.append((char) cI);
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}