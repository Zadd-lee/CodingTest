//  동전 0

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        Long k = Long.parseLong(st.nextToken());
        Long[] jun = new Long[n];

        for (int i = 0; i < n; i++) {
            jun[i] = Long.parseLong(br.readLine());
        }

        int cnt = 0;
        for (int i = n-1; i >= 0; i--) {
            if(jun[i]>k) continue;
            while (k >= jun[i]) {
                cnt++;
                k -= jun[i];
            }
        }
        System.out.println(cnt);



    }
}