import java.math.BigInteger;
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int l = Integer.parseInt(br.readLine());
        char[] input = br.readLine().toCharArray();

        BigInteger result = BigInteger.ZERO;
        for (int i = 0; i < l; i++) {
            // a= 97
            int n = (int) input[i] - 96;
            result = result.add(BigInteger.valueOf(n).multiply(BigInteger.valueOf(31).pow(i)));

        }
        System.out.println(result.remainder(BigInteger.valueOf(1234567891)));

    }
}