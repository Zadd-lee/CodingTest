//  ATM

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] time = new int[n];
        for (int i = 0; i < n; i++) {
            time[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(time);

        int nowTime = 0;
        int hap = 0;
        for (int i = 0; i < n; i++) {
            nowTime = nowTime + time[i];
            hap += nowTime;
        }
        System.out.println(hap);
    }
}