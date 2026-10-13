class Solution {
    int[] queen;
    int answer = 0;
    public int solution(int n) {
        queen = new int[n];        
        dfs(0,n);
        return answer;
    }
    
    void dfs(int row,int n){
        if(row == queen.length){
            answer++;
            return;
        }
        for(int col = 0;col<n;col++){
            if(isPossible(row,col)){
                queen[row] = col;
                dfs(row+1,n);
            }
        }
    }
    boolean isPossible(int row,int col){
        for(int prevRow = 0;prevRow <row;prevRow++){
            int prevCol = queen[prevRow];
            
            if(prevCol == col) return false;
            if(Math.abs(row-prevRow)
               ==Math.abs(col-prevCol)) return false;
        }
        return true;
    }
}