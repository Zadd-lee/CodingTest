
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result = 0;
        for (int i = 0; i < n; i++) {
            List<Character> alp = new ArrayList<>();
            String s = br.readLine();
            alp.add(s.charAt(0));
            boolean check = true;
            for (int j = 1; j < s.length(); j++) {
                if(s.charAt(j)==s.charAt(j-1)) continue;
                if (alp.contains(s.charAt(j))) {
                    check = false;
                    break;
                }
                alp.add(s.charAt(j));
            }
            if (check) {
                result++;
            }
        }
        System.out.println(result);
    }
}