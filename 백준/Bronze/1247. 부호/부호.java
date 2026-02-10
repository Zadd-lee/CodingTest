

import java.math.BigInteger;
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            int n = sc.nextInt();

            BigInteger hap = BigInteger.ZERO;
            for (int j = 0; j < n; j++) {
                hap = hap.add(sc.nextBigInteger());
            }
            int sig = hap.signum();
            if (sig == 0) {
                System.out.println(0);
            } else if (sig == -1) {
                System.out.println("-");
            } else {
                System.out.println("+");
            }
        }
    }
}