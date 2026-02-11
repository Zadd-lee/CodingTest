import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        System.out.println(factorial(a) / (factorial(b) * factorial(a - b)));
    }

    private static int factorial(int a) {
        int result = 1;
        for (int i = 1; i <= a; i++) {
            result*=i;
        }
        return result;
    }
}