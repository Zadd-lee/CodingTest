class Solution {
    public String solution(String[] id_pw, String[][] db) {
        boolean isId = false;
        for(String[] dbData:db){
            if(id_pw[0].equals(dbData[0])){
                if(id_pw[1].equals(dbData[1])){
                    return "login";
                }else{
                    isId = true;
                }
            }
        }
        return isId ? "wrong pw":"fail";
    }
}