//  피보나치 함수

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int[][] fibo = new int[41][2];
        fibo[0][0] = 1;
        fibo[0][1] = 0;
        fibo[1][0] = 0;
        fibo[1][1] = 1;

        for (int i = 2; i < 41; i++) {
            if (fibo[i][0] == 0 && fibo[i][1] == 0) {
                fibo[i][0] = fibo[i - 1][0] + fibo[i - 2][0];
                fibo[i][1] = fibo[i - 1][1] + fibo[i - 2][1];
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            sb.append(fibo[n][0]+" "+fibo[n][1]).append('\n');
        }
        System.out.println(sb);
    }

}