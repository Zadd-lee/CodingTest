//  solved.ac

import java.math.BigInteger;
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if (n == 0) {
            System.out.println(0);
            return;
        }


        int[] op = new int[n];
        for (int i = 0; i < n; i++) {
            op[i] = Integer.parseInt(br.readLine());
        }
        int sac = ((Long) Math.round((double) n * 15 / 100)).intValue();

        Arrays.sort(op);
        int result = 0;
        for (int i = sac; i < op.length-sac ; i++) {
            result += op[i];
        }
        int round = ((Long)Math.round((double) result / (n - sac * 2))).intValue();
        System.out.println(round);


    }
}