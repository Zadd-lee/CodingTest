import java.lang.*;
import java.util.*;

class Solution {
    int[] dx = {1,-1,0,0};
    int[] dy = {0,0,1,-1};
    String[] b = {"E","W","S","N"};
    public int[] solution(String[] park, String[] routes) {
        // 1. 입력 : 지도(도로, 방해불) 명령어
        // 2. 현재 위치
        // 3. 1. 시작 좌표 세팅 2. queue 를 돌면서 
        // 4. 좌표를 벗어나거나(0,0이하, h,w이상) 장애물 만난경우
        Queue<String> comm = new LinkedList<>(Arrays.asList(routes));
        //1인 경우 장애물, 아닌 경우 가능 통로
        int[][] graph = new int[park.length][park[0].length()];
        int[] coor = new int[2];
        for(int y =0;y<park.length;y++){
            char[] p = park[y].toCharArray();
            for(int x= 0;x<park[0].length();x++){
                if(p[x]=='S'){
                    coor[0]=x;
                    coor[1]=y;
                }else if(p[x]=='X'){
                    graph[y][x]=1;
                }
            }
        }
        
        
        
        while(!comm.isEmpty()){
            String[] com = comm.poll().split(" ");
            int cnt = Integer.parseInt(com[1]);
            int x=coor[0];
            int y = coor[1];
            int coInd = -1;
            boolean isPassed = true;
            for(int i = 0;i<4;i++){
                if(com[0].equals(b[i])){
                    coInd=i;
                    break;
                }
            }
            
            while(cnt-->0){
                x+=dx[coInd];
                y+=dy[coInd];
                if((x<0 ||y<0||y>=park.length||x>=park[0].length())||graph[y][x]==1) {
                    isPassed = false;
                    break;
                }
            }
            if(isPassed){
                coor[0]=x;
                coor[1]=y;
            }
            
        }
        
        
        
        int[] answer = {coor[1],coor[0]};
        return answer;
    }
}