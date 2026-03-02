class Solution {
    public String solution(String myString) {
        StringBuffer sb= new StringBuffer();
        
        for(char c : myString.toCharArray()){
            int cInt = (int) c;
            if(cInt == 97){
                sb.append("A");
            }else if(cInt>65 && cInt<=90){
                cInt+=32;
                sb.append((char)cInt);
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}