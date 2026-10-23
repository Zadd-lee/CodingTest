import java.lang.*;
import java.util.*;

class Solution {
    public int solution(String begin, String target, String[] words) {
        Queue<int[]> q = new ArrayDeque<>();
        
        words = Arrays.copyOf(words, words.length + 1);
        words[words.length-1] = begin;
        boolean[] visited = new boolean[words.length];
        visited[words.length-1] = true;
        
        q.offer(new int[]{words.length-1,0});
        
        while(!q.isEmpty()){
            int[] p = q.poll();
            String now = words[p[0]];
            if(now.equals(target)) return p[1];
            
            for(int i = 0;i<now.length();i++){
                StringBuffer sb = new StringBuffer("^");
                sb.append(now);
                sb.append("$");
                sb.setCharAt(i+1,'.');

                for(int j = 0;j<words.length;j++){
                    if(!words[j].matches(sb.toString())) continue;
                    if(visited[j]) continue;
                    q.offer(new int[]{j,p[1]+1});
                    visited[j] = true;
                }
            }
        }
        
        return 0;
    }
}