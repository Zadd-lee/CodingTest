
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        int k = sc.nextInt();
        for (int i = 0; i < k; i++) {
            int n = sc.nextInt();
            if (n == 0) {
                st.pop();
            } else {
                st.push(n);
            }
        }
        int hap = 0;
        for (Integer i : st) {
            hap += i;
        }
        System.out.println(hap);

    }
}