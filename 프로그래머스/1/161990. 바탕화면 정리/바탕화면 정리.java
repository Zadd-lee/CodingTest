class Solution {
    public int[] solution(String[] wallpaper) {
        //1. 격자 배열 - 파일의 좌표
        //2. 드래그 시작,끝 좌표 배열
        //3. 로직 최소 x 값과 최대 y OR 최소 y, 최대 x 값을 구하기
        //4. 엣지 케이스
        int[] answer = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE,Integer.MIN_VALUE,Integer.MIN_VALUE};
        for(int x = 0;x<wallpaper.length;x++){
            for(int y = 0;y<wallpaper[0].length();y++){
                if(wallpaper[x].charAt(y)=='#'){
                    answer[0] = Math.min(x,answer[0]);
                    answer[1] = Math.min(y,answer[1]);
                    answer[2] = Math.max(x,answer[2]);
                    answer[3] = Math.max(y,answer[3]);
                }
            }
        }
        
        answer[2]+=1;
        answer[3]+=1;
        
        
        return answer;
    }
}