
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String code = br.readLine();
            if (code.contains("push")) {
                StringTokenizer st = new StringTokenizer(code);
                st.nextToken();
                int x = Integer.parseInt(st.nextToken());
                stack.push(x);
            } else if (code.contains("pop")) {
                if (stack.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(stack.pop());
                }
            } else if (code.contains("size")) {
                System.out.println(stack.size());
            } else if (code.contains("empty")) {
                if(stack.isEmpty()) System.out.println(1);
                else System.out.println(0);
            } else if (code.contains("top")) {
                if (stack.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(stack.peek());
                }
            }
        }


    }

}
