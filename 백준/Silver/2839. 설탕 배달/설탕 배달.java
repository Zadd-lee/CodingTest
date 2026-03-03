//  설탕 배달

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;

        while (n > 0) {
            if (n % 5 == 0) {
                cnt += n / 5;
                System.out.println(cnt);
                return;
            }
            if (n < 3) {
                System.out.println(-1);
                return;
            }
            n -= 3;
            cnt++;
        }
        System.out.println(cnt);

    }

}