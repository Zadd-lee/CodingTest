//  TGN

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String yes = "advertise";
        String no = "do not advertise";
        String soso = "does not matter";

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (r == e - c) {
                System.out.println(soso);
            } else if (r < e - c) {
                System.out.println(yes);
            } else {
                System.out.println(no);
            }
        }
    }
}