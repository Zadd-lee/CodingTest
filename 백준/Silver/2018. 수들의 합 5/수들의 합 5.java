
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = 1;
        int r = 2;
        int cnt = 1;
        while (l != n) {
            int hap = (l+r) *(r - l + 1) / 2;

            if (hap == n) {
                cnt++;
                l++;
                r = l + 1;
            } else if (hap > n) {
                l++;
                r = l + 1;
            } else {
                r++;
            }

        }
        System.out.println(cnt);
    }
}