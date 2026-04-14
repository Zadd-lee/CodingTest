//  복호화

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int[] cnt = new int[26];
            String input = br.readLine();

            if (input.length() == 1) {
                System.out.println(input);
                continue;
            } else {

            }
            char[] inp = input.toCharArray();

            for (char c : inp) {
                if(c==' ') continue;
                int ind =(int) c;
                ind-=97;
                cnt[ind]++;
            }

            int[] maxL = cnt.clone();
            Arrays.sort(maxL);


            if (maxL[24]!=0 && maxL[25] == maxL[24]) {
                System.out.println("?");
                continue;
            }

            for (int j = 0; j < cnt.length; j++) {
                if (cnt[j] == maxL[25]) {
                    j += 97;
                    System.out.println((char) j);
                }

            }

        }

    }
}