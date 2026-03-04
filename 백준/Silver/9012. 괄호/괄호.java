//  괄호

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            int b = 0;
            for (char c : s.toCharArray()) {
                if(c=='(') b++;
                if (c == ')') {
                    b--;
                    if (b < 0) break;
                }
            }
            if (b != 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}