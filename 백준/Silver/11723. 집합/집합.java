//  집합

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Set<Integer> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        Set<Integer> setAll = new HashSet<>();
        for (int i = 1; i <= 20; i++) {
            setAll.add(i);
        }

        int m = Integer.parseInt(br.readLine());
        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String code = st.nextToken();
            int x;

            switch (code) {
                case "add" :
                    x = Integer.parseInt(st.nextToken());
                    set.add(x);
                    break;

                case "remove" :
                    x = Integer.parseInt(st.nextToken());
                    set.remove(x);
                    break;

                case "check" :
                    x = Integer.parseInt(st.nextToken());
                    if (set.contains(x)) {
                        sb.append(1);
                    } else {
                        sb.append(0);
                    }
                    sb.append("\n");
                    break;

                case "toggle" :
                    x = Integer.parseInt(st.nextToken());
                    if (set.contains(x)) {
                        set.remove(x);
                    } else {
                        set.add(x);
                    }
                    break;

                case "all" :
                    set = new HashSet<>(setAll);
                    break;

                case "empty" :
                    set = new HashSet<>();
                    break;

            }
        }

        System.out.println(sb);

    }
}