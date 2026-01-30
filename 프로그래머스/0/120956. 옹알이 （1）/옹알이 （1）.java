import java.util.*;
class Solution {
    public int solution(String[] babbling) {
        int answer = 0;

        ArrayList<String> balums=new ArrayList<>(Arrays.asList("aya", "ye", "woo", "ma"));
        //babbling 하나씩 가져오기
        for(int i=0;i<babbling.length;i++){
            int len = 0;
            for(String bal:balums){
                if(babbling[i].contains(bal)){
                    len+=bal.length();
                }
            }
            if(babbling[i].length()==len){
                answer++;
            }
        }
        return answer;
    }
}