class Solution {
    public String solution(String s) {
        String[] ss = s.split("");
        int cnt = 0;
        for(int i=0;i<ss.length;i++){
            
            if(ss[i].equals(" ")){
            cnt = 0;
            }else{
                if(cnt%2==0){
                    ss[i]=ss[i].toUpperCase();
                }else{
                    ss[i]=ss[i].toLowerCase();
                }
                
                cnt++;
            }
        }
        
        return String.join("",ss);
    }
}