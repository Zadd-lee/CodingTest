

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            result.add(Integer.parseInt(br.readLine()));
        }
        result.sort(Integer::compare);
        for (Integer i : result) {
            System.out.println(i);
        }

    }
}