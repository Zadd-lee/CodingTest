import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 666;
        while (true) {
            if (String.valueOf(cnt).contains("666")) {
                n--;
                if (n == 0) {
                    break;
                }
            }
            cnt++;
        }
        System.out.println(cnt);

    }
}