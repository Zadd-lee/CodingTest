
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Map;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            Map<String, Integer> closet = new HashMap<>();
            for (int j = 0; j < n; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String name = st.nextToken();
                String gen = st.nextToken();
                closet.put(gen, closet.getOrDefault(gen, 0) + 1);
            }

            int result = 1;
            for (Integer value : closet.values()) {
                result *= value + 1;
            }
            sb.append(result - 1).append('\n');
        }

        System.out.println(sb);

    }
}