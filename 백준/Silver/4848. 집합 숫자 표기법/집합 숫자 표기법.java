

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        ArrayList<String> dp = new ArrayList<>();

        for (int i = 0; i < 16; i++) {
            sb.append("{");
            for (int j = 0; j < i; j++) {
                sb.append(dp.get(j));
                if (j != i - 1) {
                    sb.append(',');
                }
            }
            sb.append("}");
            dp.add(sb.toString());
            sb.setLength(0);
        }

        for (int i = 0; i < t; i++) {
            String aS = br.readLine();
            String bS = br.readLine();
            int a = -1;
            int b = -1;

            for (int j = 0; j < 16; j++) {
                String dpS = dp.get(j);
                if (dpS.equals(aS)) {
                    a = j;
                }
                if (dpS.equals(bS)) {
                    b = j;
                }

                if (a != -1 && b != -1) {
                    break;
                }
            }
            System.out.println(dp.get(a+b));

        }

    }
}