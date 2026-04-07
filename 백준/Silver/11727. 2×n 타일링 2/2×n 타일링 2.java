
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] dp = new int[1001];
        dp[1] = 1;
        dp[2] = 3;

        int i = sc.nextInt();
        for (int j = 3; j < i+1; j++) {
            dp[j] = (dp[j-1]+dp[j-2]*2)%10007;
        }
        System.out.println(dp[i]);
    }
}