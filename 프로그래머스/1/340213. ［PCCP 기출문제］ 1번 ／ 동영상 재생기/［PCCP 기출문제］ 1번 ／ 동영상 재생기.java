import java.lang.*;
import java.util.*;

class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        //1. 입력 : 길기, 직전 재생 위치,오프닝 시작시간, 오프닝 종료시간,입력
        //2. 출력 : 입력 종료 후 마지막 위치
        //3. 로직 : 
        //4. 엣지 케이스 : 00:00 이전 , 길이 이후 이동
        Queue<String> comm = new LinkedList<>(Arrays.asList(commands));
        int[][] op = new int[2][2];
        op[0] = setTime(op_start);
        op[1] = setTime(op_end);
        
        int[] now = setTime(pos);
        int[] video = setTime(video_len);
        
        while(!comm.isEmpty()){
            String com = comm.poll();
            
            //오프닝 구간인지 체크
            if((now[0]>op[0][0]||(now[0]==op[0][0] && now[1]>=op[0][1]))&&
              (now[0]<op[1][0]||(now[0]==op[1][0] && now[1]<=op[1][1]))){
                now[0]=op[1][0];
                now[1]=op[1][1];
            }
            
            switch (com){
                case "prev":
                    now[1]-=10;
                    break;
                case "next":
                    now[1]+=10;
                    break;
            }
            //시간 처리
            if(now[1]>=60){
                now[1]-=60;
                now[0]+=1;
            }else if(now[1]<0){
                now[1]+=60;
                now[0]-=1;
            }
            
            //범위 이상
            if(now[0]<0 || (now[0]==0 && now[1]<0)){
                now[0]=0;
                now[1]=0;
            }else if(now[0]>video[0] || (now[0]==video[0]&&now[1]>video[1])){
                now[0]=video[0];
                now[1]=video[1];
            }
            
            //오프닝 구간인지 체크
            if((now[0]>op[0][0]||(now[0]==op[0][0] && now[1]>=op[0][1]))&&
              (now[0]<op[1][0]||(now[0]==op[1][0] && now[1]<=op[1][1]))){
                now[0]=op[1][0];
                now[1]=op[1][1];
            }
                    
        }
        String result = "";
        if(now[0]<10){
            result+="0";
        }
        result+=now[0]+":";
        if(now[1]<10){
            result+="0";
        }
        result+=now[1];
        
        return result;
    }
    private int[] setTime(String time){
        int[] result = new int[2];
        String[] split = time.split(":");
        result[0]=Integer.parseInt(split[0]);
        result[1]=Integer.parseInt(split[1]);
        return result;
    }
}