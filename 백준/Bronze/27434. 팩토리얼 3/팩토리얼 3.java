

import java.math.BigInteger;
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(br.readLine());
        BigInteger result = factorial(1,i);
        System.out.println(result.toString());
    }

    private static BigInteger factorial(int a,int n) {
        BigInteger result = BigInteger.valueOf(a);
        if (a < n) {
            int b = (a + n) / 2;
            result = factorial(a, b).multiply(factorial(b + 1, n));
        }
        return result;
    }
}