
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        PriorityQueue<Long> card = new PriorityQueue<>();
        for (int i = 0; i < n ; i++) {
            card.add(Long.parseLong(st.nextToken()));
        }

        for (int i = 0; i < m; i++) {
            Long a = card.poll();
            Long b = card.poll();
            card.add(a + b);
            card.add(a + b);
        }

        Long hap = 0L;
        for (Long l : card) {
            hap += l;
        }
        System.out.println(hap.toString());

    }
}