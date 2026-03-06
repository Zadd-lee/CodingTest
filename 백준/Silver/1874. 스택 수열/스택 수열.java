
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws  IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Stack<Integer> temp = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int num = 0;

        for (int i = 0; i < n; i++) {
            int value = Integer.parseInt(br.readLine());
            if (value > num) {
                for (int j = num+1; j <= value; j++) {
                    temp.push(j);
                    sb.append('+').append("\n");
                }
                num = value;
            } else if (temp.peek() != value) {
                System.out.println("NO");
                return;
            }
            temp.pop();
            sb.append('-').append('\n');
        }

        System.out.println(sb);


    }
}