
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Map;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());


        Map<String, Integer> score = new HashMap<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            score.put(st.nextToken(), Integer.parseInt(st.nextToken()));
        }

        int hap = 0;

        for (int i = 0; i < k; i++) {
            String subjects = br.readLine();
            hap += score.get(subjects);
            score.remove(subjects);
        }

        int max = hap;
        int min = hap;

        int[] array = score.values().stream()
                .sorted()
                .mapToInt(Integer::intValue)
                .toArray();

        for (int i = 0; i < m - k; i++) {
            max += array[array.length - i - 1];
            min += array[i];

        }

        System.out.println(min+" "+max);
    }
}