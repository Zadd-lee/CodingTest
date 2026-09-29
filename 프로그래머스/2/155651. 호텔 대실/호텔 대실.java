import java.lang.*;
import java.util.*;

class Solution {
    public int solution(String[][] book_time) {
        int[][] room = new int[book_time.length][2];
        for(int i = 0; i<book_time.length;i++){
            
            room[i][0] = parse(book_time[i][0]);
            room[i][1] = parse(book_time[i][1])+10;
        }
        Arrays.sort(room,(a,b)->Integer.compare(a[0],b[0]));
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int[] r : room){
            int start = r[0];
            int end = r[1];
            
            if(!pq.isEmpty() && pq.peek()<=start){
                pq.poll();
            }
            pq.offer(end);
        }
        
        return pq.size();
    }
    int parse(String time){
        String[] t = time.split(":");
        return Integer.parseInt(t[0])*60+Integer.parseInt(t[1]);
    }
}