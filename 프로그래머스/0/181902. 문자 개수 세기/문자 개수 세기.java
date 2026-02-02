class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        for(int i= 0; i<my_string.length();i++){
            int ind = (int)my_string.charAt(i);
            if(ind >=65 && ind <=90){
                ind-=65;
            }else{
                ind-=71;
            }
            answer[ind]++;
        }
        return answer;
    }
}