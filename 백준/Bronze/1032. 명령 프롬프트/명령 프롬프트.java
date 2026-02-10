import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        int[] alp = new int[26];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        List<String> path = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            path.add(br.readLine());
        }

        String stand = path.get(0);
        StringBuffer sb = new StringBuffer();
        for (int i = 1; i < n; i++) {
            String s = path.get(i);
            for (int j = 0; j < s.length(); j++) {
                if (stand.charAt(j) != s.charAt(j)) {
                    sb.append(stand);
                    sb.setCharAt(j,'?');
                    stand = sb.toString();
                    sb.setLength(0);
                }
            }
        }

        System.out.println(stand);

    }
}