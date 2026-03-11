
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        HashMap<String, Integer> nameN = new HashMap<>();
        HashMap<Integer, String> numbN = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            nameN.put(s, i);
            numbN.put(i, s);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            String input = br.readLine();
            if (input.matches("\\d*")) {
                int num = Integer.parseInt(input) - 1;
                sb.append(numbN.get(num)).append('\n');
            } else {
                sb.append(nameN.get(input)+1).append('\n');
            }
        }
        System.out.println(sb);

    }
}