
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int l = Integer.parseInt(br.readLine());
        char[] input = br.readLine().toCharArray();

        long result = 0;
        for (int i = 0; i < l; i++) {
            // a= 97
            int n = (int) input[i] - 96;
            result += n * Math.pow(31, i );
        }
        System.out.println(result%1234567891);

    }
}