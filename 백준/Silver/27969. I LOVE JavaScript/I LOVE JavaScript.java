//  I LOVE JavaScript

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int result = 0;

        Queue<String> ason = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                ason.offer(sb.toString());
                sb.setLength(0);
            } else {
                sb.append(input.charAt(i));
            }

        }
        ason.offer("]");

        int bracket = 0;

        while (!ason.isEmpty()) {
            String string = ason.poll();
            if (string.equals("[")) {
                bracket++;
            } else if (string.equals("]")) {
                bracket--;
                result+=8;
            } else if (string.matches("[0-9]+")) {//숫자
                result+=8;
            } else {//문자
                result+=string.length()+12;
            }

        }
        System.out.println(result);
    }

}