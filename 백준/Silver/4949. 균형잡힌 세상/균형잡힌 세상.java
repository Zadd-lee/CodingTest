

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        Stack<Character> st = new Stack<>();
        while (!input.equals(".")) {
            st.clear();

            for (char c : input.toCharArray()) {
                if (c == '(' || c == '[') {
                    st.push(c);
                } else if (c == ')' || c == ']') {
                    if (st.isEmpty() || (st.peek() == '(' && c == ']')|| (st.peek() == '[' && c == ')') ) {
                        st.push(c);
                        break;
                    }
                    st.pop();
                }
            }
            if(st.isEmpty()) System.out.println("yes");
            else System.out.println("no");

            input = br.readLine();
        }

    }


}