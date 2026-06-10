import java.util.*;
import java.lang.*;
class Solution {
    public int solution(String begin, String target, String[] words) {
        int answer = Integer.MAX_VALUE;
        Stack<String[]> s = new Stack<>();
        boolean[] visited = new boolean[words.length];
        s.push(new String[]{begin,"0"});
        
        while(!s.isEmpty()){
            String[] node = s.pop();
            String now = node[0];
            int depth = Integer.parseInt(node[1]);
            
            if(now.equals(target)){
                answer = Math.min(answer,depth);
            }
            
            for(int i=0;i<begin.length();i++){
                String sd = deleteCharAt(now,i);
                for(int j = 0;j<words.length;j++){
                    String wd = deleteCharAt(words[j],i);
                    if(!visited[j]&&sd.equals(wd)){
                        s.push(new String[]{words[j],depth+1+""});
                        visited[j] = true;
                    }
                }
            }
            
            
            
        }
        
        return (answer==Integer.MAX_VALUE)? 0:answer;
    }
    private String deleteCharAt(String word,int ind){
        if(word.length()<=ind) return "";
        StringBuffer sb = new StringBuffer();
        return sb.append(word).deleteCharAt(ind).toString();
    }
}