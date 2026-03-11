
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Map;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Map<String, Integer> people = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String name = br.readLine();
            people.put(name, 1);
        }
        for (int i = 0; i < m; i++) {
            String name = br.readLine();
            people.put(name, people.getOrDefault(name, 0) + 1);
        }

        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Integer> stringIntegerEntry : people.entrySet()) {
            if (stringIntegerEntry.getValue() == 2) {
                result.add(stringIntegerEntry.getKey());
            }
        }

        result.sort(String::compareTo);
        StringBuilder sb = new StringBuilder();
        sb.append(result.size()).append('\n');
        for (String s : result) {
            sb.append(s).append('\n');
        }
        System.out.println(sb);


    }
}