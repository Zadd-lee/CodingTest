//  나이순 정렬

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[][] input = new String[n][2];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 2; j++) {
                input[i][j] = st.nextToken();
            }
        }

        Arrays.sort(input, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                int age1 = Integer.parseInt(o1[0]);
                int age2 = Integer.parseInt(o2[0]);
                return Integer.compare(age1, age2);
            }
        });

        for (String[] strings : input) {
            for (String string : strings) {
                System.out.print(string+" ");
            }
            System.out.println();
        }
    }
}