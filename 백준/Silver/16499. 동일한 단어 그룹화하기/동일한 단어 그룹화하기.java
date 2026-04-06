
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        HashMap<String, Integer> dict = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            char[] inputA = input.toCharArray();
            Arrays.sort(inputA);
            String sortInput = new String(inputA);
            dict.put(sortInput, dict.getOrDefault(sortInput, 0) + 1);
        }

        System.out.println(dict.size());
    }
}