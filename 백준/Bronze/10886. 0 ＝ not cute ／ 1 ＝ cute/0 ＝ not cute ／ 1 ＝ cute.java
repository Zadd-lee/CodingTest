//  0 = not cute / 1 = cute

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int in = 0;
        for (int i = 0; i < n; i++) {
            if (Integer.parseInt(br.readLine()) == 1) {
                in++;
            }
        }
        if (n / 2 +1> in) {
            System.out.println("Junhee is not cute!");
        } else {
            System.out.println("Junhee is cute!");
        }

    }
}