//  근로장학생

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        HashMap<String, String> dict = new HashMap<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            dict.put(st.nextToken(), st.nextToken());
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            String input = br.readLine();
            for (int j = 0; j < input.length(); j++) {
                int ind = j + 1;
                while (ind <= input.length()) {
                    String substring = input.substring(j, ind);
                    if (dict.containsKey(substring)) {
                        sb.append(dict.get(substring));
                    }
                    ind++;
                }
            }
            if (sb.length() == 0) {
                System.out.println(-1);
            } else {
                System.out.println(sb.toString());
            }
            sb.setLength(0);
        }
    }
}