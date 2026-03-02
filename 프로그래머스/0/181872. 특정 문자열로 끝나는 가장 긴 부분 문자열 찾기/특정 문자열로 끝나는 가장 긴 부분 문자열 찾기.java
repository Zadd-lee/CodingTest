class Solution {
    public String solution(String myString, String pat) {
        int patL = pat.length();
        int ind = 999;
        for(int i=myString.length()-patL;i>=0;i--){
            if(myString.substring(i,i+patL).equals(pat)){
                ind = i+patL;
                break;
            }
        }
        
        return myString.substring(0,ind);
    }
}