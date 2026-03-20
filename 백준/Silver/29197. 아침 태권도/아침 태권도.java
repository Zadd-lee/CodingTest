//  아침 태권도

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Set<Float> inc = new HashSet<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            float a = Float.parseFloat(st.nextToken());
            float b = Float.parseFloat(st.nextToken());
            inc.add(b/a);
        }

        System.out.println(inc.size());

    }
}